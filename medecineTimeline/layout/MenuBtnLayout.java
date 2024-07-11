package layout;

import java.awt.Color;
import java.awt.Font;

public class MenuBtnLayout extends BtnLayout {
	public MenuBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public MenuBtnLayout(String text) {
		// TODO Auto-generated constructor stub

		setBtnText(text);
		setBtnWidth(200);
		setBtnHeight(30);
		setBtnFontType("");
		setBtnFontStyle(Font.PLAIN);
		setBtnFontSize(20);
		setBtnBackgroundColor(Color.white);
		setBtnBorderColor(Color.black);
		setBtnBorderThickness(1);

	}

}
