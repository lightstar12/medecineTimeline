package layout;

import java.awt.Color;
import java.awt.Font;

public class MenuBtnLayout extends BtnLayout {
	public MenuBtnLayout() {
		// TODO Auto-generated constructor stub
	}
	public MenuBtnLayout(String text) {
		// TODO Auto-generated constructor stub
		btnText = text;
		btnWidth = 200;
		btnHeight = 30;
		btnFontType = "";
		btnFontStyle = Font.PLAIN;
		btnFontSize = 20;
		btnBackgroundColor = Color.white;
		btnBorderColor = Color.black;
		btnBorderThickness = 1;
	}

}
