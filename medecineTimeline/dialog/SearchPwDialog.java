package dialog;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import element.LabelElement;
import panel.LoginPanel;

public class SearchPwDialog implements ActionListener {

	JDialog searchPwDialog;
	JLabel testLbl0, testLbl1, testLbl2, testLbl3, testLbl4;
	static JTextField idTxf, nameTxf, emailTxf, phoneTxf;
	JButton searchIdBtn, cancelBtn;
	Font font = new Font("", Font.BOLD, 20);

	public SearchPwDialog() {
		searchPwDialog = new JDialog();

		searchPwDialog.setLayout(null);
		searchPwDialog.setSize(350, 290);
		searchPwDialog.setLocationRelativeTo(null);

		testLbl0 = new JLabel("비밀번호 찾기");
		testLbl0.setFont(font);
		testLbl0.setHorizontalAlignment(JLabel.CENTER);
		testLbl0.setBounds(100, 10, 150, 30);
		searchPwDialog.add(testLbl0);

		testLbl1 = new JLabel("ID");
		testLbl1.setFont(font);
		testLbl1.setBounds(30, 50, 110, 30);
		searchPwDialog.add(testLbl1);

		idTxf = new JTextField();
		idTxf.setBounds(150, 50, 150, 30);
		searchPwDialog.add(idTxf);

		testLbl1 = new JLabel("이름");
		testLbl1.setFont(font);
		testLbl1.setBounds(30, 90, 110, 30);
		searchPwDialog.add(testLbl1);

		nameTxf = new JTextField();
		nameTxf.setBounds(150, 90, 150, 30);
		searchPwDialog.add(nameTxf);

		testLbl2 = new JLabel("이메일");
		testLbl2.setFont(font);
		testLbl2.setBounds(30, 130, 110, 30);
		searchPwDialog.add(testLbl2);

		emailTxf = new JTextField();
		emailTxf.setBounds(150, 130, 150, 30);
		searchPwDialog.add(emailTxf);

		testLbl3 = new JLabel("전화번호");
		testLbl3.setFont(font);
		testLbl3.setBounds(30, 170, 110, 30);
		searchPwDialog.add(testLbl3);

		phoneTxf = new JTextField();
		phoneTxf.setBounds(150, 170, 150, 30);
		searchPwDialog.add(phoneTxf);

		font = new Font("", Font.BOLD, 15);
		searchIdBtn = new JButton("찾기");
		searchIdBtn.setFont(font);
		searchIdBtn.setBounds(75, 210, 80, 25);
		searchIdBtn.addActionListener(this);
		searchPwDialog.add(searchIdBtn);

		cancelBtn = new JButton("취소");
		cancelBtn.setFont(font);
		cancelBtn.setBounds(175, 210, 80, 25);
		cancelBtn.addActionListener(this);
		searchPwDialog.add(cancelBtn);

		searchPwDialog.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cancelBtn) {
			searchPwDialog.dispose();
		}

		if (e.getSource() == searchIdBtn) {
			String $inputId = idTxf.getText();
			String $inputName = nameTxf.getText();
			String $inputEmail = emailTxf.getText();
			String $inputPhone = String.format("%s-%s-%s", phoneTxf.getText().substring(0, 3), phoneTxf.getText().substring(3, 7), phoneTxf.getText().substring(7));

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
				JOptionPane.showMessageDialog(null, "정보가 없습니다.", "비밀번호 찾기 실패", JOptionPane.ERROR_MESSAGE);
			} else {
				System.out.println(LoginPanel.memberList.get(index).pw);
				JOptionPane.showMessageDialog(null, $inputId + "님의 비밀번호는 " + LoginPanel.memberList.get(index).pw + " 입니다.",
						"비밀번호 찾기 성공", JOptionPane.PLAIN_MESSAGE);
				searchPwDialog.dispose();
			}
		}
	}

}
