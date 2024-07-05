package layout;

import java.awt.Color;

public class InsertTableFLayout extends LblLayout {
	public InsertTableFLayout() {
		// TODO Auto-generated constructor stub
	}

	public InsertTableFLayout(String text) {
		// TODO Auto-generated constructor stub
		if (text.equals("번호")) {
			lblHeight = 122;
		} else if (text.equals("구분")) {
			lblHeight = 122;
		} else if (text.equals("시간")) {
			lblHeight = 356;
		} else {
			return;
		}
		lblText = "";
		lblWidth = 710;
		lblFontType = "";
		lblFontStyle = 0;
		lblFontSize = 0;
		lblBackgroundColor = Color.lightGray;
		lblBorderColor = Color.black;
		lblBorderThickness = 1;
	}
}
