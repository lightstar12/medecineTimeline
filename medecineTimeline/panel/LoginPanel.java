package panel;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;

import element.ButtonElement;
import element.LabelElement;

import layout.LoginPanelIdLblLayout;
import layout.LoginPanelLoginBtnLayout;
import layout.LoginPanelPwLblLayout;

public class LoginPanel extends JPanel {
	public static ButtonElement loginBtn;
	LabelElement idLabel, pwLabel;
	public static JTextField idTxf, pwTxf;

	LoginPanelIdLblLayout idLblLayout = new LoginPanelIdLblLayout();
	LoginPanelPwLblLayout pwLblLayout = new LoginPanelPwLblLayout();
	LoginPanelLoginBtnLayout loginBtnLayout = new LoginPanelLoginBtnLayout();

	public LoginPanel() {

		setLayout(null);
		setPreferredSize(new Dimension(0, 360));

		idLabel = new LabelElement(idLblLayout.lblText, idLblLayout.lblWidth, idLblLayout.lblHeight,
				idLblLayout.lblFontType, idLblLayout.lblFontStyle, idLblLayout.lblFontSize, idLblLayout.lblBackgroundColor,
				idLblLayout.lblBorderColor, idLblLayout.lblBorderThickness);
		idLabel.setLocation(70, 50);
		add(idLabel);

		idTxf = new JTextField(5);
		idTxf.setBounds(150, 50, 260, 30);
		add(idTxf);

		pwLabel = new LabelElement(pwLblLayout.lblText, pwLblLayout.lblWidth, pwLblLayout.lblHeight,
				pwLblLayout.lblFontType, pwLblLayout.lblFontStyle, pwLblLayout.lblFontSize, pwLblLayout.lblBackgroundColor,
				pwLblLayout.lblBorderColor, pwLblLayout.lblBorderThickness);
		pwLabel.setLocation(70, 100);
		add(pwLabel);

		pwTxf = new JTextField(5);
		pwTxf.setBounds(150, 100, 260, 30);
		add(pwTxf);

		loginBtn = new ButtonElement(loginBtnLayout.btnText, loginBtnLayout.btnWidth, loginBtnLayout.btnHeight,
				loginBtnLayout.btnFontType, loginBtnLayout.btnFontStyle, loginBtnLayout.btnFontSize,
				loginBtnLayout.btnBackgroundColor, loginBtnLayout.btnBorderColor, loginBtnLayout.btnBorderThickness);
		loginBtn.setLocation(250 - loginBtnLayout.btnWidth / 2, 200);
		add(loginBtn);
	}

}
