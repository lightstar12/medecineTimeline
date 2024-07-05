package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import element.ButtonElement;
import element.LabelElement;

import layout.LblLayout;
import layout.InsertTableALayout;
import layout.InsertTableFLayout;
import layout.InsertMenuBtnLayout;

public class InsertPanel extends JPanel implements KeyListener {

	private static final long serialVersionUID = 1L;

	LabelElement tableALbl, tableFLbl;
	ButtonElement insertBtn, initBtn;
	JTextField numberTxf;
	JComboBox<String> timeClassficationCB;
	ButtonGroup btnGroup = new ButtonGroup();
	JRadioButton timeRB;

	InsertTableALayout tableALayout;
	InsertTableFLayout tabelFLayout;
	InsertMenuBtnLayout insertBtnLayout, initBtnLayout;

	String[] timeC = { "아침", "점심", "저녁" };
	String[] timeYear = { "2022", "2023", "2024" };
	String[] timeMonth = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
	String[] timeDay = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
			"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", };
	String[] timeHour = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23" };
	String[] timeMinute = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "26", "27", "28", "29", "30", "31", "32", "33",
			"34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51",
			"52", "53", "54", "55", "56", "57", "58", "59" };
	String[] timeSecond = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
			"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "26", "27", "28", "29", "30", "31", "32", "33",
			"34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51",
			"52", "53", "54", "55", "56", "57", "58", "59" };

	public InsertPanel() {
		setLayout(null);
		setBackground(Color.white);

		int posX = 0;
		int posY = 0;
		for (int i = 0; i < ViewPanel.header.length; i++) {
			tableALayout = new InsertTableALayout(ViewPanel.header[i]);
			tableALbl = new LabelElement(tableALayout);
			tableALbl.setHorizontalAlignment(JLabel.CENTER);
			tableALbl.setLocation(70, 20 + posY);

			posX = LblLayout.lblWidth;

			tabelFLayout = new InsertTableFLayout(ViewPanel.header[i]);
			tableFLbl = new LabelElement(tabelFLayout);
			tableFLbl.setLocation(70 + posX, 20 + posY);
			tableFLbl.setOpaque(false);

			posY += LblLayout.lblHeight;
			add(tableALbl);
			add(tableFLbl);
		}

		numberTxf = new JTextField(5);
		numberTxf.setSize(100, 70);
		numberTxf.setFont(new Font("", Font.PLAIN, 50));
		numberTxf.setLocation(70 + posX + 10, 46);
		numberTxf.addKeyListener(this);
		add(numberTxf);

		timeClassficationCB = new JComboBox<String>(timeC);
		timeClassficationCB.setSelectedIndex(0);
		timeClassficationCB.setFont(new Font("", Font.PLAIN, 50));
		timeClassficationCB.setLocation(70 + posX + 10, 168);
		timeClassficationCB.setSize(150, 70);
		timeClassficationCB.setBorder(new LineBorder(Color.black, 1));
		timeClassficationCB.setBackground(Color.white);
		add(timeClassficationCB);

		timeRB = new JRadioButton("현재시간");
		timeRB.setFont(new Font("", Font.PLAIN, 50));
		timeRB.setSize(250, 70);
		timeRB.setLocation(70 + posX + 10, 274);
		btnGroup.add(timeRB);
		add(timeRB);

		timeRB = new JRadioButton("임의시간");
		timeRB.setFont(new Font("", Font.PLAIN, 50));
		timeRB.setSize(250, 70);
		timeRB.setLocation(70 + posX + 10, 364);
		btnGroup.add(timeRB);
		add(timeRB);

		timeClassficationCB = new JComboBox<String>(timeYear);
		timeClassficationCB.setSelectedIndex(2);
		timeClassficationCB.setFont(new Font("", Font.PLAIN, 50));
		timeClassficationCB.setLocation(70 + posX + 10, 464);
		timeClassficationCB.setSize(150, 70);
		timeClassficationCB.setBorder(new LineBorder(Color.black, 1));
		timeClassficationCB.setBackground(Color.white);
		timeClassficationCB.setEnabled(false);
		add(timeClassficationCB);

		insertBtnLayout = new InsertMenuBtnLayout("추가");
		insertBtn = new ButtonElement(insertBtnLayout);
		insertBtn.setLocation(250, 650);
		add(insertBtn);

		initBtnLayout = new InsertMenuBtnLayout("초기화");
		initBtn = new ButtonElement(initBtnLayout);
		initBtn.setLocation(550, 650);
		add(initBtn);

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
