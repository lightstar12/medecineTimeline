package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginPanelBtnLayout extends BtnLayout {
	public LoginPanelBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public LoginPanelBtnLayout(String text) {
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
