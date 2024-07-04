package dialog;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.DbConnect;
import dao.MemberDAO;
import element.ButtonElement;
import element.LabelElement;

import layout.DialogBtnLayout;
import layout.DialogLblLayout;
import layout.DialogTitleLblLayout;

public class JoinDialog implements ActionListener, KeyListener {

	JDialog joinDialog;
	LabelElement titleLbl, idLbl, firstnameLbl, lastnameLbl, passwordLbl, emailLbl, phoneLbl;
	ButtonElement checkIdBtn, checkEmailBtn, checkPhoneBtn;
	static ButtonElement joinBtn;
	ButtonElement cancelBtn;
	static JTextField idTxf, firstnameTxf, lastnameTxf, passwordTxf, emailTxf, phoneTxf;

	int DialogWidth = 450, DialogHeight = 370;
	DialogTitleLblLayout titleLblLayout;
	DialogLblLayout idLblLayout, firstnameLblLayout, lastnameLblLayout, passwordLblLayout, emailLblLayout,
			phoneLblLayout;
	DialogBtnLayout checkIdBtnLayout, checkEmailBtnLayout, checkPhoneBtnLayout, joinBtnLayout, cancelBtnLayout;

	public static ArrayList<model.Member> memberList;

	public JoinDialog() {
		joinDialog = new JDialog();

		joinDialog.setLayout(null);
		joinDialog.setSize(DialogWidth, DialogHeight);
		joinDialog.setLocationRelativeTo(null);
//		joinDialog.setUndecorated(true);
		joinDialog.setBackground(Color.darkGray);

		titleLblLayout = new DialogTitleLblLayout("회원가입");
		titleLbl = new LabelElement(titleLblLayout);
		titleLbl.setHorizontalAlignment(JLabel.CENTER);
		titleLbl.setLocation(DialogWidth / 2 - titleLblLayout.getLblWidth() / 2, 10);
		joinDialog.add(titleLbl);

		idLblLayout = new DialogLblLayout("아이디");
		idLbl = new LabelElement(idLblLayout);
		idLbl.setLocation(30, 50);
		joinDialog.add(idLbl);

		idTxf = new JTextField();
		idTxf.setBounds(150, 50, 150, 30);
		idTxf.addKeyListener(this);
		joinDialog.add(idTxf);

		checkIdBtnLayout = new DialogBtnLayout("중복확인");
		checkIdBtnLayout.setBtnWidth(100);
		checkIdBtn = new ButtonElement(checkIdBtnLayout);
		checkIdBtn.setEnabled(false);
		checkIdBtn.setLocation(310, 50);
		checkIdBtn.addActionListener(this);
		joinDialog.add(checkIdBtn);

		firstnameLblLayout = new DialogLblLayout("이름");
		firstnameLbl = new LabelElement(firstnameLblLayout);
		firstnameLbl.setLocation(30, 90);
		joinDialog.add(firstnameLbl);

		firstnameTxf = new JTextField();
		firstnameTxf.setBounds(150, 90, 150, 30);
		firstnameTxf.setEnabled(false);
		joinDialog.add(firstnameTxf);

		lastnameLblLayout = new DialogLblLayout("성");
		lastnameLbl = new LabelElement(lastnameLblLayout);
		lastnameLbl.setLocation(30, 130);
		joinDialog.add(lastnameLbl);

		lastnameTxf = new JTextField();
		lastnameTxf.setBounds(150, 130, 150, 30);
		lastnameTxf.setEnabled(false);
		joinDialog.add(lastnameTxf);

		passwordLblLayout = new DialogLblLayout("비밀번호");
		passwordLbl = new LabelElement(passwordLblLayout);
		passwordLbl.setLocation(30, 170);
		joinDialog.add(passwordLbl);

		passwordTxf = new JTextField();
		passwordTxf.setBounds(150, 170, 150, 30);
		passwordTxf.setEnabled(false);
		joinDialog.add(passwordTxf);

		emailLblLayout = new DialogLblLayout("이메일");
		emailLbl = new LabelElement(emailLblLayout);
		emailLbl.setLocation(30, 210);
		joinDialog.add(emailLbl);

		emailTxf = new JTextField();
		emailTxf.setBounds(150, 210, 150, 30);
		emailTxf.setEnabled(false);
		emailTxf.addKeyListener(this);
		joinDialog.add(emailTxf);

		checkEmailBtnLayout = new DialogBtnLayout("중복확인");
		checkEmailBtnLayout.setBtnWidth(100);
		checkEmailBtn = new ButtonElement(checkEmailBtnLayout);
		checkEmailBtn.setEnabled(false);
		checkEmailBtn.setLocation(310, 210);
		checkEmailBtn.addActionListener(this);
		joinDialog.add(checkEmailBtn);

		phoneLblLayout = new DialogLblLayout("전화번호");
		phoneLbl = new LabelElement(phoneLblLayout);
		phoneLbl.setLocation(30, 250);
		joinDialog.add(phoneLbl);

		phoneTxf = new JTextField();
		phoneTxf.setBounds(150, 250, 150, 30);
		phoneTxf.setEnabled(false);
		phoneTxf.addKeyListener(this);
		joinDialog.add(phoneTxf);

		checkPhoneBtnLayout = new DialogBtnLayout("중복확인");
		checkPhoneBtnLayout.setBtnWidth(100);
		checkPhoneBtn = new ButtonElement(checkPhoneBtnLayout);
		checkPhoneBtn.setEnabled(false);
		checkPhoneBtn.setLocation(310, 250);
		checkPhoneBtn.addActionListener(this);
		joinDialog.add(checkPhoneBtn);

		joinBtnLayout = new DialogBtnLayout("가입");
		joinBtn = new ButtonElement(joinBtnLayout);
		joinBtn.setLocation(DialogWidth / 2 - (30 + joinBtnLayout.getBtnWidth()), 290);
		joinBtn.setEnabled(false);
		joinBtn.addActionListener(this);
		joinDialog.add(joinBtn);

		cancelBtnLayout = new DialogBtnLayout("취소");
		cancelBtn = new ButtonElement(cancelBtnLayout);
		cancelBtn.setLocation(DialogWidth / 2 + 30, 290);
		cancelBtn.addActionListener(this);
		joinDialog.add(cancelBtn);

		joinDialog.setVisible(true);

		memberList = MemberDAO.getInstance().getMemberList();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelBtn) {
			joinDialog.dispose();
		}

		if (e.getSource() == joinBtn) {

			String $inputId = idTxf.getText();
			String $inputFirstname = firstnameTxf.getText();
			String $inputLastname = lastnameTxf.getText();
			String $inputPassword = passwordTxf.getText();
			String $inputEmail = emailTxf.getText();
			String $inputPhone = phoneTxf.getText();
			$inputPhone = $inputPhone.substring(0, 3) + $inputPhone.substring(3, 7) + $inputPhone.substring(7, 11);

			if ($inputFirstname.equals("")) {
				JOptionPane.showMessageDialog(null, "이름을 입력해주세요", "회원가입 불가", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if ($inputLastname.equals("")) {
				JOptionPane.showMessageDialog(null, "성을 입력해주세요", "회원가입 불가", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if ($inputPassword.equals("")) {
				JOptionPane.showMessageDialog(null, "비밀번호를 입력해주세요", "회원가입 불가", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			String sql = " INSERT INTO member(number, id, first_name, last_name, password, email, phone_number)";
			sql	+= " VALUES(0, ?, ?, ?, ?, ?, ?) ";
			
			try(
					DbConnect dbc = new DbConnect();
					PreparedStatement pstmt = dbc.getPrepare(sql);
					) {
				pstmt.setString(1, $inputId);
				pstmt.setString(2, $inputFirstname);
				pstmt.setString(3, $inputLastname);
				pstmt.setString(4, $inputPassword);
				pstmt.setString(5, $inputEmail);
				pstmt.setString(6, $inputPhone);
				pstmt.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "환영합니다" + $inputFirstname + " " + $inputLastname + "님!", "가입 성공", JOptionPane.INFORMATION_MESSAGE);
				joinDialog.dispose();
				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			try {
				MemberDAO.getInstance().init();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		if (e.getSource() == checkIdBtn) {
			checkId();
		}

		if (e.getSource() == checkEmailBtn) {
			checkEmail();
		}

		if (e.getSource() == checkPhoneBtn) {
			checkPhone();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == idTxf) {

			String $inputId = idTxf.getText();
			boolean checkId = $inputId.matches("^[a-z]{1}[a-z0-9]{5,20}+$");

			if (checkId) {
				checkIdBtn.setEnabled(true);
			} else {
				checkIdBtn.setEnabled(false);
			}
		}

		if (e.getSource() == emailTxf) {
			String $inputEmail = emailTxf.getText();
			boolean checkEmail = $inputEmail.matches("^[a-zA-Z0-9]+@[0-9a-zA-Z]+\\.[a-z]+$");

			if (checkEmail) {
				checkEmailBtn.setEnabled(true);
			} else {
				checkEmailBtn.setEnabled(false);
			}
		}

		if (e.getSource() == phoneTxf) {
			String $inputPhone = phoneTxf.getText();
			boolean checkPhone = $inputPhone.matches("^[\\d]{11}+$");

			if (checkPhone) {
				checkPhoneBtn.setEnabled(true);
			} else {
				checkPhoneBtn.setEnabled(false);
			}
		}
	}

	public static void checkId() {
		String $inputId = idTxf.getText();
		int index = -1;

		int i = 0;
		for (model.Member member : memberList) {
			System.out.println(member.id);
			if ($inputId.equals(member.id)) {
				index = i;
				break;
			}
			i += 1;
		}

		System.out.println(index);

		if (index == -1) {
			JOptionPane.showMessageDialog(null, "사용 가능한 ID 입니다", "아이디 사용 가능", JOptionPane.INFORMATION_MESSAGE);
			firstnameTxf.setEnabled(true);
			lastnameTxf.setEnabled(true);
			passwordTxf.setEnabled(true);
			emailTxf.setEnabled(true);
			return;
		} else {
			JOptionPane.showMessageDialog(null, "이미 있는 ID입니다", "아이디 사용 불가", JOptionPane.ERROR_MESSAGE);
			firstnameTxf.setEnabled(false);
			lastnameTxf.setEnabled(false);
			passwordTxf.setEnabled(false);
			emailTxf.setEnabled(false);
			phoneTxf.setEnabled(false);
			return;
		}

	}

	public static void checkEmail() {
		String $inputEmail = emailTxf.getText();
		int index = -1;

		int i = 0;
		for (model.Member member : memberList) {
			if ($inputEmail.equals(member.email)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			JOptionPane.showMessageDialog(null, "사용 가능한 Email 입니다", "이메일 사용 가능", JOptionPane.INFORMATION_MESSAGE);
			phoneTxf.setEnabled(true);
			return;
		} else {
			JOptionPane.showMessageDialog(null, "이미 있는 Email 입니다", "이메일 사용 불가", JOptionPane.ERROR_MESSAGE);
			phoneTxf.setEnabled(false);
			return;
		}
	}

	public static void checkPhone() {
		String $inputPhone = phoneTxf.getText();
		$inputPhone = $inputPhone.substring(0, 3) + "-" + $inputPhone.substring(3, 7) + "-"
				+ $inputPhone.substring(7, 11);

		int index = -1;

		int i = 0;
		for (model.Member member : memberList) {
			if ($inputPhone.equals(member.phoneNumber)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			JOptionPane.showMessageDialog(null, "사용 가능한 전화번호 입니다", "전화번호 사용 가능", JOptionPane.INFORMATION_MESSAGE);
			joinBtn.setEnabled(true);
			return;
		} else {
			JOptionPane.showMessageDialog(null, "이미 있는 전화번호 입니다", "전화번호 사용 불가", JOptionPane.ERROR_MESSAGE);
			joinBtn.setEnabled(false);
			return;
		}
	}

}