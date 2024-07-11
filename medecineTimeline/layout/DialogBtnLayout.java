package layout;

import java.awt.Color;
import java.awt.Font;

public class DialogBtnLayout extends BtnLayout {

	
	
	public DialogBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public DialogBtnLayout(String text) {
		
		setBtnText(text);
		setBtnWidth(70);
		setBtnHeight(30);
		setBtnFontType("");
		setBtnFontStyle(Font.BOLD);
		setBtnFontSize(20);
		setBtnBackgroundColor(Color.white);
		setBtnBorderColor(Color.black);
		setBtnBorderThickness(0);

	}
	

}
