package layout;

import java.awt.Color;
import java.awt.Font;

public class DialogTitleLblLayout extends LblLayout {

	public DialogTitleLblLayout() {
		// TODO Auto-generated constructor stub
	}

	public DialogTitleLblLayout(String text) {
		// TODO Auto-generated constructor stub

		lblText = text;
		lblWidth = 150;
		lblHeight = 30;
		lblFontType = "";
		lblFontStyle = Font.BOLD;
		lblFontSize = 20;
		lblBackgroundColor = Color.white;
		lblBorderColor = Color.black;
		lblBorderThickness = 0;

	}
}
