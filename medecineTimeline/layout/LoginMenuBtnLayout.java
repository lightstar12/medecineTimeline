package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginMenuBtnLayout extends BtnLayout {

	public LoginMenuBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public LoginMenuBtnLayout(String text) {

		btnText = text;
		btnWidth = 100;
		btnHeight = 30;
		btnFontType = "";
		btnFontStyle = Font.PLAIN;
		btnFontSize = 20;
		btnBackgroundColor = Color.white;
		btnBorderColor = Color.black;
		btnBorderThickness = 1;

	}
}