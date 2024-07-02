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
import layout.SearchDialogIdMenuLblLayout;
import layout.SearchDialogInputEmailLblLayout;
import layout.SearchDialogInputNameLblLayout;
import layout.SearchDialogInputPhoneLblLayout;
import panel.LoginPanel;

public class SearchIdDialog implements ActionListener{
	
	JDialog searchIdDialog;
	JLabel testLbl0, testLbl1, testLbl2, testLbl3;
	LabelElement titleLbl, nameLbl, emailLbl, phoneLbl;
	static JTextField nameTxf, emailTxf, phoneTxf;
	JButton searchIdBtn, cancelBtn;
	Font font = new Font("", Font.BOLD, 20);
	SearchDialogIdMenuLblLayout titleLblLayout;
	SearchDialogInputNameLblLayout nameLblLayout;
	SearchDialogInputEmailLblLayout emailLblLayout;
	SearchDialogInputPhoneLblLayout phoneLblLayout;
	
	public SearchIdDialog() {
		searchIdDialog = new JDialog();
		
		searchIdDialog.setLayout(null);
		searchIdDialog.setSize(350,250);
		searchIdDialog.setLocationRelativeTo(null);
		
//		titleLbl = new LabelElement(titleLblLayout.lblText, titleLblLayout.lblWidth, titleLblLayout.lblHeight,
//				titleLblLayout.lblFontType, titleLblLayout.lblFontStyle, titleLblLayout.lblFontSize, titleLblLayout.lblBackgroundColor,
//				titleLblLayout.lblBorderColor, titleLblLayout.lblBorderThickness);
//		titleLbl.setHorizontalAlignment(JLabel.CENTER);
//		titleLbl.setLocation(100, 10);
//		searchIdDialog.add(titleLbl);
		
		testLbl0 = new JLabel("아이디 찾기");
		testLbl0.setFont(font);
		testLbl0.setHorizontalAlignment(JLabel.CENTER);
		testLbl0.setBounds(100, 10, 150, 30);
		searchIdDialog.add(testLbl0);
		
		testLbl1 = new JLabel("이름");
		testLbl1.setFont(font);
		testLbl1.setBounds(30, 50, 110, 30);
		searchIdDialog.add(testLbl1);
		
		nameTxf = new JTextField();
		nameTxf.setBounds(150, 50, 150, 30);
		searchIdDialog.add(nameTxf);
		
		testLbl2 = new JLabel("이메일");
		testLbl2.setFont(font);
		testLbl2.setBounds(30, 90, 110, 30);
		searchIdDialog.add(testLbl2);
		
		emailTxf = new JTextField();
		emailTxf.setBounds(150, 90, 150, 30);
		searchIdDialog.add(emailTxf);
		
		testLbl3 = new JLabel("전화번호");
		testLbl3.setFont(font);
		testLbl3.setBounds(30, 130, 110, 30);
		searchIdDialog.add(testLbl3);
		
		phoneTxf = new JTextField();
		phoneTxf.setBounds(150, 130, 150, 30);
		searchIdDialog.add(phoneTxf);
		
		font = new Font("", Font.BOLD, 15);
		searchIdBtn = new JButton("찾기");
		searchIdBtn.setFont(font);
		searchIdBtn.setBounds(75, 170, 80, 25);
		searchIdBtn.addActionListener(this);
		searchIdDialog.add(searchIdBtn);
		
		cancelBtn = new JButton("취소");
		cancelBtn.setFont(font);
		cancelBtn.setBounds(175, 170, 80, 25);
		cancelBtn.addActionListener(this);
		searchIdDialog.add(cancelBtn);
		
		
		searchIdDialog.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == cancelBtn) {
			searchIdDialog.dispose();
		}
		
		if(e.getSource() == searchIdBtn) {
			String $inputName = nameTxf.getText();
			String $inputEmail = emailTxf.getText();
			String $inputPhone = phoneTxf.getText();
			
			int index = -1;
			
			for(int i = 0; i < LoginPanel.memberList.size(); i++) {
				if($inputName.equals(LoginPanel.memberList.get(i).lastName + LoginPanel.memberList.get(i).firstName) &&
						$inputEmail.equals(LoginPanel.memberList.get(i).email) &&
						$inputPhone.equals(LoginPanel.memberList.get(i).phoneNumber)) {
					index = i;
					break;
				}
			}
			
			if(index == -1) {
				System.out.println("정보가 없습니다.");
				JOptionPane.showMessageDialog(null, "정보가 없습니다.", "아이디 찾기 실패", JOptionPane.ERROR_MESSAGE);
			} else {
				System.out.println(LoginPanel.memberList.get(index).id);
				JOptionPane.showMessageDialog(null, $inputName + "님의 아이디는 " + LoginPanel.memberList.get(index).id + " 입니다.", "아이디 찾기 성공", JOptionPane.PLAIN_MESSAGE);
				searchIdDialog.dispose();
			}
		}
	}

}
