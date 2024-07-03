package dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import element.ButtonElement;
import element.LabelElement;
import layout.DialogBtnLayout;
import layout.DialogLblLayout;
import layout.DialogTitleLblLayout;

public class JoinDialog implements ActionListener {

	JDialog joinDialog;
	LabelElement titleLbl, idLbl, firstnameLbl, lastnameLbl, passwordLbl, emailLbl, phoneLbl;
	ButtonElement searchBtn, cancelBtn;
	static JTextField idTxf, firstnameTxf, lastnameTxf, passwordTxf, emailTxf, phoneTxf;

	DialogTitleLblLayout titleLblLayout = new DialogTitleLblLayout("회원가입");
	DialogLblLayout idLblLayout = new DialogLblLayout("아이디");
	DialogLblLayout firstnameLblLayout = new DialogLblLayout("이름");
	DialogLblLayout lastnameLblLayout = new DialogLblLayout("성");
	DialogLblLayout passwordLblLayout = new DialogLblLayout("비밀번호");
	DialogLblLayout emailLblLayout = new DialogLblLayout("이메일");
	DialogLblLayout phoneLblLayout = new DialogLblLayout("전화번호");
	DialogBtnLayout searchBtnLayout = new DialogBtnLayout("가입");
	DialogBtnLayout cancelBtnLayout = new DialogBtnLayout("취소");
	
	public JoinDialog() {
		joinDialog = new JDialog();
		joinDialog = new JDialog();

		joinDialog.setLayout(null);
		joinDialog.setSize(350, 370);
		joinDialog.setLocationRelativeTo(null);

		titleLbl = new LabelElement(titleLblLayout.lblText, titleLblLayout.lblWidth, titleLblLayout.lblHeight,
				titleLblLayout.lblFontType, titleLblLayout.lblFontStyle, titleLblLayout.lblFontSize,
				titleLblLayout.lblBackgroundColor, titleLblLayout.lblBorderColor, titleLblLayout.lblBorderThickness);
		titleLbl.setHorizontalAlignment(JLabel.CENTER);
		titleLbl.setLocation(100, 10);
		joinDialog.add(titleLbl);

		idLbl = new LabelElement(idLblLayout.lblText, idLblLayout.lblWidth, idLblLayout.lblHeight,
				idLblLayout.lblFontType, idLblLayout.lblFontStyle, idLblLayout.lblFontSize,
				idLblLayout.lblBackgroundColor, idLblLayout.lblBorderColor, idLblLayout.lblBorderThickness);
		idLbl.setLocation(30, 50);
		joinDialog.add(idLbl);

		idTxf = new JTextField();
		idTxf.setBounds(150, 50, 150, 30);
		joinDialog.add(idTxf);

		firstnameLbl = new LabelElement(firstnameLblLayout.lblText, firstnameLblLayout.lblWidth, firstnameLblLayout.lblHeight,
				firstnameLblLayout.lblFontType, firstnameLblLayout.lblFontStyle, firstnameLblLayout.lblFontSize,
				firstnameLblLayout.lblBackgroundColor, firstnameLblLayout.lblBorderColor, firstnameLblLayout.lblBorderThickness);
		firstnameLbl.setLocation(30, 90);
		joinDialog.add(firstnameLbl);

		firstnameTxf = new JTextField();
		firstnameTxf.setBounds(150, 90, 150, 30);
		joinDialog.add(firstnameTxf);
		
		lastnameLbl = new LabelElement(lastnameLblLayout.lblText, lastnameLblLayout.lblWidth, lastnameLblLayout.lblHeight,
				lastnameLblLayout.lblFontType, lastnameLblLayout.lblFontStyle, lastnameLblLayout.lblFontSize,
				lastnameLblLayout.lblBackgroundColor, lastnameLblLayout.lblBorderColor, lastnameLblLayout.lblBorderThickness);
		lastnameLbl.setLocation(30, 130);
		joinDialog.add(lastnameLbl);
		
		lastnameTxf = new JTextField();
		lastnameTxf.setBounds(150, 130, 150, 30);
		joinDialog.add(lastnameTxf);

		passwordLbl = new LabelElement(passwordLblLayout.lblText, passwordLblLayout.lblWidth, passwordLblLayout.lblHeight,
				passwordLblLayout.lblFontType, passwordLblLayout.lblFontStyle, passwordLblLayout.lblFontSize,
				passwordLblLayout.lblBackgroundColor, passwordLblLayout.lblBorderColor, passwordLblLayout.lblBorderThickness);
		passwordLbl.setLocation(30, 170);
		joinDialog.add(passwordLbl);
		
		passwordTxf = new JTextField();
		passwordTxf.setBounds(150, 170, 150, 30);
		joinDialog.add(passwordTxf);
		
		emailLbl = new LabelElement(emailLblLayout.lblText, emailLblLayout.lblWidth, emailLblLayout.lblHeight,
				emailLblLayout.lblFontType, emailLblLayout.lblFontStyle, emailLblLayout.lblFontSize,
				emailLblLayout.lblBackgroundColor, emailLblLayout.lblBorderColor, emailLblLayout.lblBorderThickness);
		emailLbl.setLocation(30, 210);
		joinDialog.add(emailLbl);

		emailTxf = new JTextField();
		emailTxf.setBounds(150, 210, 150, 30);
		joinDialog.add(emailTxf);

		phoneLbl = new LabelElement(phoneLblLayout.lblText, phoneLblLayout.lblWidth, phoneLblLayout.lblHeight,
				phoneLblLayout.lblFontType, phoneLblLayout.lblFontStyle, phoneLblLayout.lblFontSize,
				phoneLblLayout.lblBackgroundColor, phoneLblLayout.lblBorderColor, phoneLblLayout.lblBorderThickness);
		phoneLbl.setLocation(30, 250);
		joinDialog.add(phoneLbl);

		phoneTxf = new JTextField();
		phoneTxf.setBounds(150, 250, 150, 30);
		joinDialog.add(phoneTxf);

		searchBtn = new ButtonElement(searchBtnLayout.btnText, searchBtnLayout.btnWidth, searchBtnLayout.btnHeight,
				searchBtnLayout.btnFontType, searchBtnLayout.btnFontStyle, searchBtnLayout.btnFontSize,
				searchBtnLayout.btnBackgroundColor, searchBtnLayout.btnBorderColor, searchBtnLayout.btnBorderThickness);
		searchBtn.setLocation(75, 290);
		searchBtn.addActionListener(this);
		joinDialog.add(searchBtn);

		cancelBtn = new ButtonElement(cancelBtnLayout.btnText, cancelBtnLayout.btnWidth, cancelBtnLayout.btnHeight,
				cancelBtnLayout.btnFontType, cancelBtnLayout.btnFontStyle, cancelBtnLayout.btnFontSize,
				cancelBtnLayout.btnBackgroundColor, cancelBtnLayout.btnBorderColor, cancelBtnLayout.btnBorderThickness);
		cancelBtn.setLocation(175, 290);
		cancelBtn.addActionListener(this);
		joinDialog.add(cancelBtn);

		joinDialog.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	
}