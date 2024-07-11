package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginMenuBtnLayout extends BtnLayout {

	public LoginMenuBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public LoginMenuBtnLayout(String text) {
		
		setBtnText(text);
		setBtnWidth(100);
		setBtnHeight(30);
		setBtnFontType("");
		setBtnFontStyle(Font.PLAIN);
		setBtnFontSize(20);
		setBtnBackgroundColor(Color.white);
		setBtnBorderColor(Color.black);
		setBtnBorderThickness(1);

	}
}
