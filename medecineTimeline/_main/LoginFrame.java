package _main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import panel.LoginMenuPanel;
import panel.LoginPanel;

import element.ButtonElement;
import element.LabelElement;

public class LoginFrame extends JFrame implements ActionListener {

	private static final int FRAME_WIDTH = 500; // 프레임 너비
	private static final int FRAME_HEIGHT = 500; // 프레임 높이

	LabelElement loginLbl;
	LoginPanel loginPanel;
	LoginMenuPanel loginMenuPanel;
	ButtonElement joinBtn;

	public LoginFrame() {

		setTitle("로그인");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(0, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		loginLbl = new LabelElement("로그인", 100, 100, "", Font.BOLD, 30, Color.WHITE, Color.black, 0);
		loginLbl.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		loginLbl.setHorizontalAlignment(JLabel.CENTER);
		add("North", loginLbl);

		loginPanel = new LoginPanel();
		loginPanel.loginBtn.addActionListener(this);
		add("Center", loginPanel);
//
//		joinBtn = new ButtonElement("회원가입", 100, 30, "", Font.PLAIN, 20, Color.white, Color.black, 1);
//		joinBtn.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
		loginMenuPanel = new LoginMenuPanel();
		
		add("South", loginMenuPanel);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginPanel.loginBtn) {
			LoginPanel.tryLogin();
			if(LoginPanel.loginCheck) {
				try {
					LtoM();
				} catch (Exception e1) {
					e1.printStackTrace();
				}				
			}
		}

	}

	public void LtoM() throws Exception {
		dispose();
		new MainFrame();
	}

}
