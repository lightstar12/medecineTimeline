package panel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class MyPanel extends JPanel implements ActionListener{
	JButton[] btnList;
	JLabel label1, label2, label0;
	Font font;
	
	static final int BTNWIDTH = 200;
	static final int BTNHEIGHT = 40;
	static final int BTNLOCATIONWIDTH = 70;
	static final int BTNLOCATIONHEIGHT = 100;
	static final int BTNBETWEEN = 20;
	String[] btnLabelList = {"데이터 추가","데이터 조회","데이터 삭제","데이터 갱신"};
	
	public MyPanel() {
		this.setLayout(null);
		
		setBackground(Color.white);
		setBounds(0, 0, _main.mainForm.FRAME_WIDTH, 180);
		

		label0 = new JLabel("테스트");
		label0.setFont(font);
		label0.setSize(100,180);
		label0.setLocation(0, 0);
		label0.setHorizontalAlignment(JLabel.CENTER);
		label0.setBorder(new LineBorder(Color.black, 1, true));
		add(label0);
		
		font = new Font("", Font.BOLD, 40);
		label1 = new JLabel("복약 타임라인");
		label1.setFont(font);
		label1.setSize(300,40);
		label1.setLocation(350, 30);
		label1.setHorizontalAlignment(JLabel.CENTER);
		add(label1);

		font = new Font("", Font.PLAIN, 20);
		btnList = new JButton[4];
		for(int i = 0; i < 4; i++) {
			btnList[i] = new JButton();
			btnList[i].setText(btnLabelList[i]);
			btnList[i].setFont(font);
			btnList[i].setSize(BTNWIDTH, BTNHEIGHT);
			btnList[i].setLocation(BTNLOCATIONWIDTH + (BTNWIDTH + BTNBETWEEN) * i, BTNLOCATIONHEIGHT);
			btnList[i].setBackground(Color.LIGHT_GRAY);
			btnList[i].setBorder(getBorder());
			
			if(i == 0) {
				btnList[i].addActionListener(this);
			}
			add(btnList[i]);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			_main.mainForm.frame.setContentPane(new View_Panel());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		_main.mainForm.frame.revalidate();
	}
}
