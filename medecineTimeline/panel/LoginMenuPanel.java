package panel;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import dialog.SearchIdDialog;
import dialog.SearchPwDialog;
import element.ButtonElement;

import layout.LoginMenuPanelSidBtnLayout;
import layout.LoginMenuPanelSpwBtnLayout;
import layout.LoginMenuPanelJoinBtnLayout;

public class LoginMenuPanel extends JPanel implements ActionListener {

	ButtonElement searchIdBtn, searchPwBtn, joinBtn;

	LoginMenuPanelSidBtnLayout searchIdBtnLayout = new LoginMenuPanelSidBtnLayout();
	LoginMenuPanelSpwBtnLayout searchPwBtnLayout = new LoginMenuPanelSpwBtnLayout();
	LoginMenuPanelJoinBtnLayout joinBtnLayout = new LoginMenuPanelJoinBtnLayout();

	public LoginMenuPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(0, 100));

		searchIdBtn = new ButtonElement(searchIdBtnLayout.btnText, searchIdBtnLayout.btnWidth, searchIdBtnLayout.btnHeight,
				searchIdBtnLayout.btnFontType, searchIdBtnLayout.btnFontStyle, searchIdBtnLayout.btnFontSize,
				searchIdBtnLayout.btnBackgroundColor, searchIdBtnLayout.btnBorderColor, searchIdBtnLayout.btnBorderThickness);
		searchIdBtn.setLocation(70, 10);
		searchIdBtn.addActionListener(this);
		add(searchIdBtn);

		searchPwBtn = new ButtonElement(searchPwBtnLayout.btnText, searchPwBtnLayout.btnWidth, searchPwBtnLayout.btnHeight,
				searchPwBtnLayout.btnFontType, searchPwBtnLayout.btnFontStyle, searchPwBtnLayout.btnFontSize,
				searchPwBtnLayout.btnBackgroundColor, searchPwBtnLayout.btnBorderColor, searchPwBtnLayout.btnBorderThickness);
		searchPwBtn.setLocation(200, 10);
		searchPwBtn.addActionListener(this);
		add(searchPwBtn);

		joinBtn = new ButtonElement(joinBtnLayout.btnText, joinBtnLayout.btnWidth, joinBtnLayout.btnHeight,
				joinBtnLayout.btnFontType, joinBtnLayout.btnFontStyle, joinBtnLayout.btnFontSize,
				joinBtnLayout.btnBackgroundColor, joinBtnLayout.btnBorderColor, joinBtnLayout.btnBorderThickness);
		joinBtn.setLocation(330, 10);
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
		
	}
	
	
}
