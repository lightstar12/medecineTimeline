package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginPanelBtnLayout extends BtnLayout {
	public LoginPanelBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public LoginPanelBtnLayout(String text) {
		// TODO Auto-generated constructor stub

		btnText = text;
		btnWidth = 100;
		btnHeight = 30;
		btnFontType = "";
		btnFontStyle = Font.BOLD;
		btnFontSize = 20;
		btnBackgroundColor = Color.gray;
		btnBorderColor = Color.black;
		btnBorderThickness = 0;
	}
}
