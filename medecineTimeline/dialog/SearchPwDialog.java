package dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import element.ButtonElement;
import element.LabelElement;

import layout.DialogBtnLayout;
import layout.DialogLblLayout;
import layout.DialogTitleLblLayout;

import panel.LoginPanel;

public class SearchPwDialog implements ActionListener {

	JDialog searchPwDialog;

	LabelElement titleLbl, idLbl, nameLbl, emailLbl, phoneLbl;
	ButtonElement searchBtn, cancelBtn;
	static JTextField idTxf, nameTxf, emailTxf, phoneTxf;

	DialogTitleLblLayout titleLblLayout = new DialogTitleLblLayout("비밀번호 찾기");
	DialogLblLayout idLblLayout = new DialogLblLayout("아이디");
	DialogLblLayout nameLblLayout = new DialogLblLayout("이름");
	DialogLblLayout emailLblLayout = new DialogLblLayout("이메일");
	DialogLblLayout phoneLblLayout = new DialogLblLayout("전화번호");
	DialogBtnLayout searchBtnLayout = new DialogBtnLayout("찾기");
	DialogBtnLayout cancelBtnLayout = new DialogBtnLayout("취소");

	public SearchPwDialog() {
		searchPwDialog = new JDialog();

		searchPwDialog.setLayout(null);
		searchPwDialog.setSize(350, 290);
		searchPwDialog.setLocationRelativeTo(null);

		titleLbl = new LabelElement(titleLblLayout.lblText, titleLblLayout.lblWidth, titleLblLayout.lblHeight,
				titleLblLayout.lblFontType, titleLblLayout.lblFontStyle, titleLblLayout.lblFontSize,
				titleLblLayout.lblBackgroundColor, titleLblLayout.lblBorderColor, titleLblLayout.lblBorderThickness);
		titleLbl.setHorizontalAlignment(JLabel.CENTER);
		titleLbl.setLocation(100, 10);
		searchPwDialog.add(titleLbl);

		idLbl = new LabelElement(idLblLayout.lblText, idLblLayout.lblWidth, idLblLayout.lblHeight,
				idLblLayout.lblFontType, idLblLayout.lblFontStyle, idLblLayout.lblFontSize,
				idLblLayout.lblBackgroundColor, idLblLayout.lblBorderColor, idLblLayout.lblBorderThickness);
		idLbl.setLocation(30, 50);
		searchPwDialog.add(idLbl);

		idTxf = new JTextField();
		idTxf.setBounds(150, 50, 150, 30);
		searchPwDialog.add(idTxf);

		nameLbl = new LabelElement(nameLblLayout.lblText, nameLblLayout.lblWidth, nameLblLayout.lblHeight,
				nameLblLayout.lblFontType, nameLblLayout.lblFontStyle, nameLblLayout.lblFontSize,
				nameLblLayout.lblBackgroundColor, nameLblLayout.lblBorderColor, nameLblLayout.lblBorderThickness);
		nameLbl.setLocation(30, 90);
		searchPwDialog.add(nameLbl);

		nameTxf = new JTextField();
		nameTxf.setBounds(150, 90, 150, 30);
		searchPwDialog.add(nameTxf);

		emailLbl = new LabelElement(emailLblLayout.lblText, emailLblLayout.lblWidth, emailLblLayout.lblHeight,
				emailLblLayout.lblFontType, emailLblLayout.lblFontStyle, emailLblLayout.lblFontSize,
				emailLblLayout.lblBackgroundColor, emailLblLayout.lblBorderColor, emailLblLayout.lblBorderThickness);
		emailLbl.setLocation(30, 130);
		searchPwDialog.add(emailLbl);

		emailTxf = new JTextField();
		emailTxf.setBounds(150, 130, 150, 30);
		searchPwDialog.add(emailTxf);

		phoneLbl = new LabelElement(phoneLblLayout.lblText, phoneLblLayout.lblWidth, phoneLblLayout.lblHeight,
				phoneLblLayout.lblFontType, phoneLblLayout.lblFontStyle, phoneLblLayout.lblFontSize,
				phoneLblLayout.lblBackgroundColor, phoneLblLayout.lblBorderColor, phoneLblLayout.lblBorderThickness);
		phoneLbl.setLocation(30, 170);
		searchPwDialog.add(phoneLbl);

		phoneTxf = new JTextField();
		phoneTxf.setBounds(150, 170, 150, 30);
		searchPwDialog.add(phoneTxf);

		searchBtn = new ButtonElement(searchBtnLayout.btnText, searchBtnLayout.btnWidth, searchBtnLayout.btnHeight,
				searchBtnLayout.btnFontType, searchBtnLayout.btnFontStyle, searchBtnLayout.btnFontSize,
				searchBtnLayout.btnBackgroundColor, searchBtnLayout.btnBorderColor, searchBtnLayout.btnBorderThickness);
		searchBtn.setLocation(75, 210);
		searchBtn.addActionListener(this);
		searchPwDialog.add(searchBtn);

		cancelBtn = new ButtonElement(cancelBtnLayout.btnText, cancelBtnLayout.btnWidth, cancelBtnLayout.btnHeight,
				cancelBtnLayout.btnFontType, cancelBtnLayout.btnFontStyle, cancelBtnLayout.btnFontSize,
				cancelBtnLayout.btnBackgroundColor, cancelBtnLayout.btnBorderColor, cancelBtnLayout.btnBorderThickness);
		cancelBtn.setLocation(175, 210);
		cancelBtn.addActionListener(this);
		searchPwDialog.add(cancelBtn);

		searchPwDialog.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelBtn) {
			searchPwDialog.dispose();
		}

		if (e.getSource() == searchBtn) {
			String $inputId = idTxf.getText();
			String $inputName = nameTxf.getText();
			String $inputEmail = emailTxf.getText();
			String $inputPhone = phoneTxf.getText();

			boolean formatCheck = false;

			if ($inputId.equals("")) {
				JOptionPane.showMessageDialog(null, "id를 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if ($inputName.equals("")) {
				JOptionPane.showMessageDialog(null, "이름을 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if ($inputEmail.equals("")) {
				JOptionPane.showMessageDialog(null, "이메일을 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if ($inputPhone.equals("")) {
				JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}

			formatCheck = $inputEmail.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?");

			if (!formatCheck) {
				JOptionPane.showMessageDialog(null, "올바른 이메일 형식을 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}

			$inputPhone = $inputPhone.substring(0, 3) + "-" + $inputPhone.substring(3, 7) + "-"
					+ $inputPhone.substring(7, 11);

			int index = -1;

			for (int i = 0; i < LoginPanel.memberList.size(); i++) {
				if ($inputId.equals(LoginPanel.memberList.get(i).id)
						&& $inputName.equals(LoginPanel.memberList.get(i).lastName + LoginPanel.memberList.get(i).firstName)
						&& $inputEmail.equals(LoginPanel.memberList.get(i).email)
						&& $inputPhone.equals(LoginPanel.memberList.get(i).phoneNumber)) {
					index = i;
					break;
				}
			}

			if (index == -1) {
				System.out.println("정보가 없습니다.");
				JOptionPane.showMessageDialog(null, "정보가 없습니다.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				nameTxf.setText("");
				emailTxf.setText("");
				phoneTxf.setText("");
			} else {
				System.out.println(LoginPanel.memberList.get(index).pw);
				JOptionPane.showMessageDialog(null,
						$inputId + "님의 비밀번호는 " + LoginPanel.memberList.get(index).pw + " 입니다.", "비밀번호 찾기 성공",
						JOptionPane.PLAIN_MESSAGE);
				searchPwDialog.dispose();
			}
		}
	}

}
