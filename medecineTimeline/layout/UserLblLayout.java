package layout;

import java.awt.Color;
import java.awt.Font;

import _main.Index;

public class UserLblLayout extends LblLayout {
	public UserLblLayout() {
		// TODO Auto-generated constructor stub
		lblText = Index.userId + "님";
		lblWidth = 200;
		lblHeight = 30;
		lblFontType = "";
		lblFontStyle = Font.BOLD;
		lblFontSize = 20;
		lblBackgroundColor = Color.white;
		lblBorderColor = Color.black;
		lblBorderThickness = 0;
	}
}
