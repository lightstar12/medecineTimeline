package layout;

import java.awt.Color;
import java.awt.Font;

public class DialogBtnLayout extends BtnLayout {

	public DialogBtnLayout() {
		// TODO Auto-generated constructor stub
	}

	public DialogBtnLayout(String text) {
		
		btnText = text;
		btnWidth = 70;
		btnHeight = 30;
		btnFontType = "";
		btnFontStyle = Font.BOLD;
		btnFontSize = 20;
		btnBackgroundColor = Color.white;
		btnBorderColor = Color.black;
		btnBorderThickness = 0;

	}
	

}
