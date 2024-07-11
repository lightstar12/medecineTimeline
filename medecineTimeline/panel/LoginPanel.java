package panel;

import java.awt.Color;
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

import layout.LoginBtnLayout;
import layout.LoginPanelLblLayout;

public class LoginPanel {
	
	public static JPanel loginPanel;
	
	public static ButtonElement loginBtn;
	LabelElement idLbl, pwLbl;
	public static JTextField idTxf, pwTxf;
		
	LoginPanelLblLayout idLblLayout, pwLblLayout;
	LoginBtnLayout loginBtnLayout;

	public static ArrayList<model.Member> memberList;
	
	public static boolean loginCheck = false;

	public LoginPanel() {
		
		loginPanel = new JPanel();

		loginPanel.setLayout(null);
		loginPanel.setPreferredSize(new Dimension(0, 360));
		loginPanel.setBackground(Color.white);

		idLblLayout = new LoginPanelLblLayout("ID");
		idLbl = new LabelElement(idLblLayout);
		idLbl.setLocation(70, 50);
		loginPanel.add(idLbl);

		idTxf = new JTextField(5);
		idTxf.setBounds(150, 50, 260, 40);
		idTxf.setText("lightstar12");
		idTxf.setFont(new Font("", Font.PLAIN, 23));
		loginPanel.add(idTxf);

		pwLblLayout = new LoginPanelLblLayout("PW");
		pwLbl = new LabelElement(pwLblLayout);
		pwLbl.setLocation(70, 120);
		loginPanel.add(pwLbl);

		pwTxf = new JPasswordField(5);
		pwTxf.setBounds(150, 120, 260, 40);
		pwTxf.setText("starlight12");
		pwTxf.setFont(new Font("", Font.PLAIN, 30));
		loginPanel.add(pwTxf);

		loginBtnLayout = new LoginBtnLayout("로그인");
		loginBtn = new ButtonElement(loginBtnLayout);
		loginBtn.setLocation(250 - loginBtnLayout.getBtnWidth() / 2, 200);
		loginPanel.add(loginBtn);

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
