package _main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

import panel.LoginMenuPanel;
import panel.LoginPanel;

import element.ButtonElement;
import element.LabelElement;

import layout.TitleLblLayout;

public class LoginFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private static final int FRAME_WIDTH = 500; // 프레임 너비
	private static final int FRAME_HEIGHT = 500; // 프레임 높이

	LabelElement titleLbl;
	LoginPanel loginPanel;
	LoginMenuPanel loginMenuPanel;
	ButtonElement joinBtn;
	
	TitleLblLayout titleLblLayout;

	public LoginFrame() {

		setTitle("로그인");
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout(0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		titleLblLayout = new TitleLblLayout("로그인");
		titleLbl = new LabelElement(titleLblLayout);
		titleLbl.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		titleLbl.setHorizontalAlignment(JLabel.CENTER);
		add("North", titleLbl);

		loginPanel = new LoginPanel();
		loginPanel.loginBtn.addActionListener(this);
		add("Center", loginPanel);

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
