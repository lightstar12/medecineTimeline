package layout;

import java.awt.Color;
import java.awt.Font;

public class InsertMenuBtnLayout extends BtnLayout {
	public InsertMenuBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public InsertMenuBtnLayout(String text) {
		// TODO Auto-generated constructor stub
		setBtnText(text);
		setBtnWidth(200);
		setBtnHeight(50);
		setBtnFontType("");
		setBtnFontStyle(Font.PLAIN);
		setBtnFontSize(30);
		setBtnBackgroundColor(Color.white);
		setBtnBorderColor(Color.black);
		setBtnBorderThickness(1);
		
	}
}
