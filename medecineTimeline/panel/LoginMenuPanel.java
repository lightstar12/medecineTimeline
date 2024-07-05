package panel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import dialog.JoinDialog;
import dialog.SearchIdDialog;
import dialog.SearchPwDialog;

import element.ButtonElement;

import layout.LoginMenuBtnLayout;

public class LoginMenuPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;

	ButtonElement searchIdBtn, searchPwBtn, joinBtn;

	LoginMenuBtnLayout searchIdBtnLayout, searchPwBtnLayout, joinBtnLayout;

	public LoginMenuPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(0, 100));
		setBackground(Color.white);

		searchIdBtnLayout = new LoginMenuBtnLayout("ID 찾기");
		searchIdBtn = new ButtonElement(searchIdBtnLayout);
		searchIdBtn.setLocation(70, 10);
		searchIdBtn.addActionListener(this);
		add(searchIdBtn);

		searchPwBtnLayout = new LoginMenuBtnLayout("PW 찾기");
		searchPwBtn = new ButtonElement(searchPwBtnLayout);
		searchPwBtn.setLocation(200, 10);
		searchPwBtn.addActionListener(this);
		add(searchPwBtn);

		joinBtnLayout = new LoginMenuBtnLayout("회원가입");
		joinBtn = new ButtonElement(joinBtnLayout);
		joinBtn.setLocation(330, 10);
		joinBtn.addActionListener(this);
		add(joinBtn);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == searchIdBtn) {
			new SearchIdDialog();
		}
		
		if(e.getSource() == searchPwBtn) {
			new SearchPwDialog();
		}
		
		if(e.getSource() == joinBtn) {
			new JoinDialog();
		}
		
	}
	
	
}
