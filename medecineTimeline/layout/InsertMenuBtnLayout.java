package layout;

import java.awt.Color;
import java.awt.Font;

public class InsertMenuBtnLayout extends BtnLayout {
	public InsertMenuBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public InsertMenuBtnLayout(String text) {
		// TODO Auto-generated constructor stub
		if (text.equals("추가")) {
			btnText = text;
		} else if (text.equals("초기화")) {
			btnText = text;
		} else {
			return;
		}
		btnWidth = 200;
		btnHeight = 50;
		btnFontType = "";
		btnFontStyle = Font.PLAIN;
		btnFontSize = 30;
		btnBackgroundColor = Color.white;
		btnBorderColor = Color.black;
		btnBorderThickness = 1;
	}
}
