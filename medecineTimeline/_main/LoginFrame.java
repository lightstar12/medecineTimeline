package _main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import dao.MemberDAO;
import element.ButtonElement;
import element.LabelElement;
import panel.LoginPanel;

public class LoginFrame extends JFrame implements ActionListener {

	private static final int FRAME_WIDTH = 500; // 프레임 너비
	private static final int FRAME_HEIGHT = 500; // 프레임 높이
	private static final int LOCATION_X = Index.SCREEN_WIDTH / 2 - FRAME_WIDTH / 2; // 프레임 위치 x축
	private static final int LOCATION_Y = Index.SCREEN_HEIGHT / 2 - FRAME_HEIGHT / 2; // 프레임 위치 y축
	
	ArrayList<model.Member> memberList;

	public static String userId;
	public static int log;

	public LoginFrame() {

		setTitle("로그인");
		setBounds(LOCATION_X, LOCATION_Y, FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(new BorderLayout(0, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LabelElement loginLbl = new LabelElement("로그인", 100, 100, "", Font.BOLD, 30, Color.WHITE, Color.black, 0);
		loginLbl.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		loginLbl.setHorizontalAlignment(JLabel.CENTER);
		add("North", loginLbl);

		LoginPanel loginPanel = new LoginPanel();
		loginPanel.loginBtn.addActionListener(this);
		add("Center", loginPanel);

		ButtonElement joinBtn = new ButtonElement("회원가입", 100, 30, "", Font.PLAIN, 20, Color.white, Color.black, 1);
		joinBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
		add("South", joinBtn);

		setVisible(true);
		
		memberList = MemberDAO.getInstance().getMemberList();
		
		System.out.println(memberList.get(0).number);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == LoginPanel.loginBtn) {
			String $inputId = LoginPanel.idTxf.getText();
			String $inputPw = LoginPanel.pwTxf.getText();
			
			for(int i = 0; i < memberList.size(); i++) {
				if($inputId.equals(memberList.get(i).id) && $inputPw.equals(memberList.get(i).pw)) {
					log = memberList.get(i).number;
					userId = memberList.get(i).id;
					LtoM();
					break;
				}
			}
		}

	}

	public void LtoM() {
		dispose();
		new MainFrame();
	}

}
