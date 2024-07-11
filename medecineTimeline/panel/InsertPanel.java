package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import _main.Index;
import dao.DbConnect;
import dao.TimelineDAO;
import element.ButtonElement;
import element.ComboBoxElement;
import element.LabelElement;

import layout.InsertTableALayout;
import layout.InsertTableFLayout;
import layout.InsertTimeCBLayout;
import layout.InsertMenuBtnLayout;

public class InsertPanel implements ActionListener, KeyListener {
	
	public static JPanel insertPanel;

	LabelElement tableALbl, tableFLbl;
	ButtonElement insertBtn, initBtn;
	JTextField numberTxf;
	ComboBoxElement<String> timeClassficationCB, timeYearCB, timeMonthCB, timeDayCB, timeHourCB, timeMinuteCB,
			timeSecondCB;
	ButtonGroup btnGroup = new ButtonGroup();
	JRadioButton presentTimeRB, optionTimeRB;

	InsertTableALayout tableALayout;
	InsertTableFLayout tabelFLayout;
	InsertMenuBtnLayout insertBtnLayout, initBtnLayout;
	InsertTimeCBLayout timeCBLayout;

	String[] timeC = { "선택", "아침", "점심", "저녁" };
	String[] timeYear = { "2022", "2023", "2024" };
	String[] timeMonth = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
	String[] timeDay = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", };
	String[] timeHour = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23" };
	String[] timeMinute = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
			"33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
			"51", "52", "53", "54", "55", "56", "57", "58", "59" };
	String[] timeSecond = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32",
			"33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50",
			"51", "52", "53", "54", "55", "56", "57", "58", "59" };

	LocalDateTime now = LocalDateTime.now();
	int year = now.getYear();
	int month = now.getMonthValue();
	int day = now.getDayOfMonth();
	int hour = now.getHour();
	int minute = now.getMinute();
	int second = now.getSecond();

	public InsertPanel() {
		
		insertPanel = new JPanel();

		insertPanel.setLayout(null);
		insertPanel.setBackground(Color.white);

		int posX = 0;
		int posY = 0;
		for (int i = 0; i < ViewPanel.header.length; i++) {
			tableALayout = new InsertTableALayout(ViewPanel.header[i]);
			tableALbl = new LabelElement(tableALayout);
			tableALbl.setHorizontalAlignment(JLabel.CENTER);
			tableALbl.setLocation(70, 20 + posY);

			posX = tableALayout.getLblWidth();

			tabelFLayout = new InsertTableFLayout(ViewPanel.header[i]);
			tableFLbl = new LabelElement(tabelFLayout);
			tableFLbl.setLocation(70 + posX, 20 + posY);
			tableFLbl.setOpaque(false);

			posY += tableALayout.getLblHeight();
			insertPanel.add(tableALbl);
			insertPanel.add(tableFLbl);
		}

		numberTxf = new JTextField(5);
		numberTxf.setSize(100, 70);
		numberTxf.setFont(new Font("", Font.PLAIN, 50));
		numberTxf.setLocation(70 + posX + 10, 46);
		numberTxf.addKeyListener(this);
		insertPanel.add(numberTxf);

		timeCBLayout = new InsertTimeCBLayout();
		timeClassficationCB = new ComboBoxElement<String>(timeC, timeCBLayout);
		timeClassficationCB.setSelectedIndex(0);
		timeClassficationCB.setLocation(70 + posX + 10, 168);
		insertPanel.add(timeClassficationCB);

		presentTimeRB = new JRadioButton("현재시간");
		presentTimeRB.setFont(new Font("", Font.PLAIN, 50));
		presentTimeRB.setSize(250, 70);
		presentTimeRB.setLocation(70 + posX + 10, 274);
		presentTimeRB.setSelected(false);
		presentTimeRB.addActionListener(this);
		btnGroup.add(presentTimeRB);
		insertPanel.add(presentTimeRB);

		optionTimeRB = new JRadioButton("임의시간");
		optionTimeRB.setFont(new Font("", Font.PLAIN, 50));
		optionTimeRB.setSize(250, 70);
		optionTimeRB.setLocation(70 + posX + 10, 364);
		optionTimeRB.setSelected(false);
		optionTimeRB.addActionListener(this);
		btnGroup.add(optionTimeRB);
		insertPanel.add(optionTimeRB);

		timeYearCB = new ComboBoxElement<String>(timeYear, timeCBLayout);
		timeYearCB.setSelectedIndex(2);
		timeYearCB.setLocation(70 + posX + 10, 455);
		timeYearCB.setEnabled(false);
		insertPanel.add(timeYearCB);

		timeMonthCB = new ComboBoxElement<String>(timeMonth, timeCBLayout);
		timeMonthCB.setSelectedIndex(month - 1);
		timeMonthCB.setLocation(70 + posX + 170, 455);
		timeMonthCB.setEnabled(false);
		insertPanel.add(timeMonthCB);

		timeDayCB = new ComboBoxElement<String>(timeDay, timeCBLayout);
		timeDayCB.setSelectedIndex(day - 1);
		timeDayCB.setLocation(70 + posX + 330, 455);
		timeDayCB.setEnabled(false);
		insertPanel.add(timeDayCB);

		timeHourCB = new ComboBoxElement<String>(timeHour, timeCBLayout);
		timeHourCB.setSelectedIndex(hour);
		timeHourCB.setLocation(70 + posX + 10, 540);
		timeHourCB.setEnabled(false);
		insertPanel.add(timeHourCB);

		timeMinuteCB = new ComboBoxElement<String>(timeMinute, timeCBLayout);
		timeMinuteCB.setSelectedIndex(minute);
		timeMinuteCB.setLocation(70 + posX + 170, 540);
		timeMinuteCB.setEnabled(false);
		insertPanel.add(timeMinuteCB);

		timeSecondCB = new ComboBoxElement<String>(timeSecond, timeCBLayout);
		timeSecondCB.setSelectedIndex(second);
		timeSecondCB.setLocation(70 + posX + 330, 540);
		timeSecondCB.setEnabled(false);
		insertPanel.add(timeSecondCB);

		insertBtnLayout = new InsertMenuBtnLayout("추가");
		insertBtn = new ButtonElement(insertBtnLayout);
		insertBtn.setLocation(250, 650);
		insertBtn.addActionListener(this);
		insertBtn.setEnabled(false);
		insertPanel.add(insertBtn);

		initBtnLayout = new InsertMenuBtnLayout("초기화");
		initBtn = new ButtonElement(initBtnLayout);
		initBtn.setLocation(550, 650);
		initBtn.addActionListener(this);
		insertPanel.add(initBtn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		if (e.getSource() == presentTimeRB) {
			timeYearCB.setEnabled(false);
			timeMonthCB.setEnabled(false);
			timeDayCB.setEnabled(false);
			timeHourCB.setEnabled(false);
			timeMinuteCB.setEnabled(false);
			timeSecondCB.setEnabled(false);
			if((numberTxf.getText().length() == 3) && (timeClassficationCB.getSelectedIndex() != 0)) {
				insertBtn.setEnabled(true);
			} else {
				insertBtn.setEnabled(false);
			}
		}

		if (e.getSource() == optionTimeRB) {
			timeYearCB.setEnabled(true);
			timeMonthCB.setEnabled(true);
			timeDayCB.setEnabled(true);
			timeHourCB.setEnabled(true);
			timeMinuteCB.setEnabled(true);
			timeSecondCB.setEnabled(true);
			if((numberTxf.getText().length() == 3) && (timeClassficationCB.getSelectedIndex() != 0)) {
				insertBtn.setEnabled(true);
			} else {
				insertBtn.setEnabled(false);
			}
		}
		
		if (e.getSource() == insertBtn) {
	
			String $inputNumber = numberTxf.getText();
			String $inputTimeC = (String) timeClassficationCB.getSelectedItem();
			
			String strYear = "";
			String strMonth = "";
			String strDay = "";
			String strHour = "";
			String strMinute = "";
			String strSecond = "";
			
			if (presentTimeRB.isSelected()) {
				now = LocalDateTime.now();
				strYear = now.getYear() + "";
				strMonth = now.getMonthValue() + "";
				strDay = now.getDayOfMonth() + "";
				strHour = now.getHour() + "";
				strMinute = now.getMinute() + "";
				strSecond = now.getSecond() + "";
				
				if(strMonth.length() < 2) {
					strMonth = "0" + strMonth;
				}
				if(strDay.length() < 2) {
					strDay = "0" + strDay;
				}
				if(strHour.length() < 2) {
					strHour = "0" + strHour;
				}
				if(strMinute.length() < 2) {
					strMinute = "0" + strMinute;
				}
				if(strSecond.length() < 2) {
					strSecond = "0" + strSecond;
				}
			}
			if (optionTimeRB.isSelected()) {
				strYear = (String) timeYearCB.getSelectedItem();
				strMonth = (String) timeMonthCB.getSelectedItem();
				strDay = (String) timeDayCB.getSelectedItem();
				strHour = (String) timeHourCB.getSelectedItem();
				strMinute = (String) timeMinuteCB.getSelectedItem();
				strSecond = (String) timeSecondCB.getSelectedItem();
			}
			
			String $inputTime = String.format("%s-%s-%s %s:%s:%s", strYear, strMonth, strDay, strHour, strMinute, strSecond);
			
			String sql = " INSERT INTO timeline(number, medecine_number, time_classfication, time)";
			sql += " VALUES(?, ?, ?, ?) ";
			
			try(
					DbConnect dbc = new DbConnect();
					PreparedStatement pstmt = dbc.getPrepare(sql);
					) {
				pstmt.setInt(1, Index.log);
				pstmt.setString(2, $inputNumber);
				pstmt.setString(3, $inputTimeC);
				pstmt.setString(4, $inputTime);
				pstmt.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "데이터가 추가 되었습니다.", "데이터 추가 성공", JOptionPane.INFORMATION_MESSAGE);
				TimelineDAO.getInstance().init();
	
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if (e.getSource() == initBtn) {
			numberTxf.setText("");
			timeClassficationCB.setSelectedIndex(0);
		}
		

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == numberTxf) {
			nonDigitRemove();
			lengthOverRemove();
		}
	}

	public void lengthOverRemove() {
		String $inputNumber = numberTxf.getText();

		if ($inputNumber.length() > 3) {
			numberTxf.setText($inputNumber.substring(0, 3));
		}
	}

	public void nonDigitRemove() {
		String $inputNumber = numberTxf.getText();
		if ($inputNumber.length() > 0) {
			boolean checkDigit = Character.isDigit($inputNumber.charAt($inputNumber.length() - 1));
			if (!checkDigit) {
				numberTxf.setText($inputNumber.substring(0, $inputNumber.length() - 1));
			}
		}
	}

}
