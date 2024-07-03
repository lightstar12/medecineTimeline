package layout;

import java.awt.Color;
import java.awt.Font;

public class DialogLblLayout extends LblLayout {

	public DialogLblLayout() {
		// TODO Auto-generated constructor stub
	}

	public DialogLblLayout(String text) {

		lblText = text;
		lblWidth = 100;
		lblHeight = 30;
		lblFontType = "";
		lblFontStyle = Font.BOLD;
		lblFontSize = 20;
		lblBackgroundColor = Color.white;
		lblBorderColor = Color.black;
		lblBorderThickness = 0;

	}
}
