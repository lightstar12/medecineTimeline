package panel;

import java.awt.Dimension;
import java.awt.Font;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import _main.Index;

import dao.MemberDAO;

import element.ButtonElement;
import element.LabelElement;

import layout.LoginPanelIdLblLayout;
import layout.LoginPanelLoginBtnLayout;
import layout.LoginPanelPwLblLayout;

public class LoginPanel extends JPanel {

	public ButtonElement loginBtn;
	LabelElement idLabel, pwLabel;
	public static JTextField idTxf, pwTxf;

	LoginPanelIdLblLayout idLblLayout = new LoginPanelIdLblLayout();
	LoginPanelPwLblLayout pwLblLayout = new LoginPanelPwLblLayout();
	LoginPanelLoginBtnLayout loginBtnLayout = new LoginPanelLoginBtnLayout();

	public static ArrayList<model.Member> memberList;
	
	public static boolean loginCheck = false;

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
		idTxf.setText("lightstar12");
		idTxf.setFont(new Font("", Font.PLAIN, 20));
		add(idTxf);

		pwLabel = new LabelElement(pwLblLayout.lblText, pwLblLayout.lblWidth, pwLblLayout.lblHeight,
				pwLblLayout.lblFontType, pwLblLayout.lblFontStyle, pwLblLayout.lblFontSize, pwLblLayout.lblBackgroundColor,
				pwLblLayout.lblBorderColor, pwLblLayout.lblBorderThickness);
		pwLabel.setLocation(70, 100);
		add(pwLabel);

		pwTxf = new JPasswordField(5);
		pwTxf.setBounds(150, 100, 260, 30);
		pwTxf.setText("starlight12");
		pwTxf.setFont(new Font("", Font.PLAIN, 20));
		add(pwTxf);

		loginBtn = new ButtonElement(loginBtnLayout.btnText, loginBtnLayout.btnWidth, loginBtnLayout.btnHeight,
				loginBtnLayout.btnFontType, loginBtnLayout.btnFontStyle, loginBtnLayout.btnFontSize,
				loginBtnLayout.btnBackgroundColor, loginBtnLayout.btnBorderColor, loginBtnLayout.btnBorderThickness);
		loginBtn.setLocation(250 - loginBtnLayout.btnWidth / 2, 200);
		add(loginBtn);

		memberList = MemberDAO.getInstance().getMemberList();

	}
	public static void tryLogin() {

		String $inputId = idTxf.getText();
		String $inputPw = pwTxf.getText();
		
		for (model.Member member : memberList) {
			if ($inputId.equals(member.id) && $inputPw.equals(member.pw)) {
				loginCheck = true;
				successLogin(member);
				break;
			}
		}
		
		if(!loginCheck) {
			failLogin();
		}
	}
	
	public static void successLogin(model.Member member) {
		Index.log = member.number;
		Index.userId = member.id;
		JOptionPane.showMessageDialog(null, "어서오세요 " + Index.userId + "님", "로그인 성공", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void failLogin() {
		JOptionPane.showMessageDialog(null, "id, pw를 확인해주세요", "로그인 실패", JOptionPane.ERROR_MESSAGE);
	}

}
