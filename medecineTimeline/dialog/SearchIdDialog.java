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

public class SearchIdDialog implements ActionListener {

	JDialog searchIdDialog;
	
	LabelElement titleLbl, nameLbl, emailLbl, phoneLbl;
	ButtonElement searchBtn, cancelBtn;
	static JTextField nameTxf, emailTxf, phoneTxf;

	DialogTitleLblLayout titleLblLayout;
	DialogLblLayout nameLblLayout, emailLblLayout, phoneLblLayout;
	DialogBtnLayout searchBtnLayout, cancelBtnLayout;
	
	
	public SearchIdDialog() {
		searchIdDialog = new JDialog();

		searchIdDialog.setLayout(null);
		searchIdDialog.setSize(350, 250);
		searchIdDialog.setLocationRelativeTo(null);

		titleLblLayout = new DialogTitleLblLayout("아이디 찾기");
		titleLbl = new LabelElement(titleLblLayout);
		titleLbl.setHorizontalAlignment(JLabel.CENTER);
		titleLbl.setLocation(100, 10);
		searchIdDialog.add(titleLbl);

		nameLblLayout = new DialogLblLayout("이름");
		nameLbl = new LabelElement(nameLblLayout);
		nameLbl.setLocation(30, 50);
		searchIdDialog.add(nameLbl);

		nameTxf = new JTextField();
		nameTxf.setBounds(150, 50, 150, 30);
		searchIdDialog.add(nameTxf);

		emailLblLayout = new DialogLblLayout("이메일");
		emailLbl = new LabelElement(emailLblLayout);
		emailLbl.setLocation(30, 90);
		searchIdDialog.add(emailLbl);

		emailTxf = new JTextField();
		emailTxf.setBounds(150, 90, 150, 30);
		searchIdDialog.add(emailTxf);

		phoneLblLayout = new DialogLblLayout("전화번호");
		phoneLbl = new LabelElement(phoneLblLayout);
		phoneLbl.setLocation(30, 130);
		searchIdDialog.add(phoneLbl);

		phoneTxf = new JTextField();
		phoneTxf.setBounds(150, 130, 150, 30);
		searchIdDialog.add(phoneTxf);

		searchBtnLayout = new DialogBtnLayout("찾기");
		searchBtn = new ButtonElement(searchBtnLayout);
		searchBtn.setLocation(75, 170);
		searchBtn.addActionListener(this);
		searchIdDialog.add(searchBtn);

		cancelBtnLayout = new DialogBtnLayout("취소");
		cancelBtn = new ButtonElement(cancelBtnLayout);
		cancelBtn.setLocation(175, 170);
		cancelBtn.addActionListener(this);
		searchIdDialog.add(cancelBtn);

		searchIdDialog.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelBtn) {
			searchIdDialog.dispose();
		}

		if (e.getSource() == searchBtn) {
			String $inputName = nameTxf.getText();
			String $inputEmail = emailTxf.getText();
			String $inputPhone = phoneTxf.getText();
			
			boolean formatCheck = false;
			
			if($inputName.equals("")) {
				JOptionPane.showMessageDialog(null, "이름을 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if($inputEmail.equals("")) {
				JOptionPane.showMessageDialog(null, "이메일을 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if($inputPhone.equals("")) {
				JOptionPane.showMessageDialog(null, "전화번호를 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			formatCheck = $inputEmail.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?");
			
			if(!formatCheck) {
				JOptionPane.showMessageDialog(null, "올바른 이메일 형식을 입력해주세요.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			$inputPhone = $inputPhone.substring(0, 3) + "-" + $inputPhone.substring(3, 7) + "-" + $inputPhone.substring(7, 11);

			int index = -1;

			for (int i = 0; i < LoginPanel.memberList.size(); i++) {
				if ($inputName.equals(LoginPanel.memberList.get(i).lastName + LoginPanel.memberList.get(i).firstName)
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
				System.out.println(LoginPanel.memberList.get(index).id);
				JOptionPane.showMessageDialog(null,
						$inputName + "님의 아이디는 " + LoginPanel.memberList.get(index).id + " 입니다.", "아이디 찾기 성공",
						JOptionPane.PLAIN_MESSAGE);
				searchIdDialog.dispose();
			}
		}
	}
	
}
