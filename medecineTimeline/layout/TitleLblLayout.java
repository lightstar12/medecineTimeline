package layout;

import java.awt.Color;
import java.awt.Font;

public class TitleLblLayout extends LblLayout {
	public TitleLblLayout() {
		// TODO Auto-generated constructor stub
	}

	public TitleLblLayout(String text) {
		// TODO Auto-generated constructor stub
		lblText = text;
		lblWidth = 100;
		lblHeight = 100;
		lblFontType = "";
		lblFontStyle = Font.BOLD;
		lblFontSize = 30;
		lblBackgroundColor = Color.white;
		lblBorderColor = Color.black;
		lblBorderThickness = 0;
	}
}
