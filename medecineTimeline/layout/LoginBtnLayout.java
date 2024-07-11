package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginBtnLayout extends BtnLayout {
	public LoginBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public LoginBtnLayout(String text) {
		// TODO Auto-generated constructor stub
		setBtnText(text);
		setBtnWidth(100);
		setBtnHeight(30);
		setBtnFontType("");
		setBtnFontStyle(Font.BOLD);
		setBtnFontSize(20);
		setBtnBackgroundColor(Color.gray);

		
	}
}
