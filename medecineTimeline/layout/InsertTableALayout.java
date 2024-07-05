package layout;

import java.awt.Color;
import java.awt.Font;

public class InsertTableALayout extends LblLayout {
	public InsertTableALayout() {
		// TODO Auto-generated constructor stub
	}
	public InsertTableALayout(String text) {
		// TODO Auto-generated constructor stub
		if(text.equals("번호")) {
			lblHeight = 122;
		} else if(text.equals("구분")) {
			lblHeight = 122;			
		} else if(text.equals("시간")) {
			lblHeight = 356;			
		} else {
			return;
		}
		lblWidth = 150;
		lblText = text;
		lblFontType = "";
		lblFontStyle = Font.PLAIN;
		lblFontSize = 40;
		lblBackgroundColor = Color.lightGray;
		lblBorderColor = Color.black;
		lblBorderThickness = 1;
	}
}
