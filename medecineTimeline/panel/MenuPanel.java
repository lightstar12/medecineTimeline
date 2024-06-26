package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import _main.MainFrame;

public class MenuPanel extends JPanel{
	JButton[] btnList;
	JLabel label1, label2;
	Font font;
	
	final int MARGIN_WIDTH = 30;
	final int MARGIN_HEIGHT = 0;
	final int BTNWIDTH = 200;
	final int BTNHEIGHT = 40;
	final int BTNLOCATIONWIDTH = 70;
	final int BTNLOCATIONHEIGHT = 100;
	final int BTNBETWEEN = 20;
	String[] btnLabelList = {"데이터 추가","데이터 조회","데이터 삭제","데이터 갱신"};
	
	public MenuPanel() {
		setLayout(new BorderLayout(0, 0));
		    
		setSize(MainFrame.FRAME_WIDTH, MainFrame.FRAME_HEIGHT);
		setBackground(Color.white);
		setBorder(BorderFactory.createEmptyBorder(MARGIN_WIDTH, MARGIN_HEIGHT, MARGIN_WIDTH, MARGIN_HEIGHT));
		
		font = new Font("", Font.BOLD, 40);
		label1 = new JLabel("복약 타임라인");
		label1.setFont(font);
//		label1.setSize(300,40);
		label1.setHorizontalAlignment(JLabel.CENTER);
		label1.setBorder(new LineBorder(Color.black, 1, true));
		add("North", label1);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 0));
		btnPanel.setBackground(Color.green);

		font = new Font("", Font.PLAIN, 20);
		btnList = new JButton[4];
		for(int i = 0; i < btnLabelList.length; i++) {
			btnList[i] = new JButton();
			btnList[i].setText(btnLabelList[i]);
			btnList[i].setFont(font);
			btnList[i].setPreferredSize(new Dimension(BTNWIDTH, BTNHEIGHT));
			btnList[i].setBackground(Color.LIGHT_GRAY);
//			btnList[i].setBorder(BorderFactory.createEmptyBorder(10, BTNHEIGHT / 2, 10, BTNHEIGHT / 2));
			
			if(i == 0) {
//				btnList[i].addActionListener(this);
			}
			btnPanel.add(btnList[i]);
		}
		btnPanel.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		add("Center", btnPanel);
	}
	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		try {
//			_main.MainFrame.frame.setContentPane(new View_Panel());
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		_main.MainFrame.frame.revalidate();
//	}
}
