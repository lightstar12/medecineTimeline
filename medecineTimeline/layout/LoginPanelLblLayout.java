package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginPanelLblLayout extends LblLayout {
	public LoginPanelLblLayout() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginPanelLblLayout(String text) {
		// TODO Auto-generated constructor stub
		
		lblText = text;
		lblWidth = 80;
		lblHeight = 30;
		lblFontType = "";
		lblFontStyle = Font.BOLD;
		lblFontSize = 30;
		lblBackgroundColor = Color.white;
		lblBorderColor = Color.black;
		lblBorderThickness = 0;
	}
}
