package _main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;


import panel.LoginMenuPanel;
import panel.LoginPanel;

import dialog.JoinDialog;

import element.ButtonElement;
import element.LabelElement;

import layout.TitleLblLayout;

public class LoginFrame implements ActionListener {
	
	private static final int FRAME_WIDTH = 500; // 프레임 너비
	private static final int FRAME_HEIGHT = 500; // 프레임 높이
	
	public static JFrame loginFrame;

	LabelElement titleLbl;
	LoginMenuPanel loginMenuPanel;
	ButtonElement joinBtn;
	
	TitleLblLayout titleLblLayout;

	public LoginFrame() {
		
		loginFrame = new JFrame();

		loginFrame.setTitle("로그인");
		loginFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		loginFrame.setLocationRelativeTo(null);
		loginFrame.setLayout(new BorderLayout(0, 0));
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		titleLblLayout = new TitleLblLayout("로그인");
		titleLbl = new LabelElement(titleLblLayout);
		titleLbl.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		titleLbl.setHorizontalAlignment(JLabel.CENTER);
		loginFrame.add("North", titleLbl);

		new LoginPanel();
		LoginPanel.loginBtn.addActionListener(this);
		loginFrame.add("Center", LoginPanel.loginPanel);

		new LoginMenuPanel();
		loginFrame.add("South", LoginMenuPanel.loginMenuPanel);

		loginFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == LoginPanel.loginBtn) {
			LoginPanel.tryLogin();
			if(LoginPanel.loginCheck) {
				try {
					LtoM();
				} catch (Exception e1) {
					e1.printStackTrace();
				}				
			}
		}
		
		if (e.getSource() == JoinDialog.joinBtn) {
			loginFrame.dispose();
			new LoginFrame();
		}

	}

	public void LtoM() throws Exception {
		loginFrame.dispose();
		new MainFrame();
	}

}
