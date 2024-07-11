package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginPanelLblLayout extends LblLayout {
	public LoginPanelLblLayout() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginPanelLblLayout(String text) {
		// TODO Auto-generated constructor stub
		setLblText(text);
		setLblWidth(80);
		setLblHeight(40);
		setLblFontType("");
		setLblFontStyle(Font.BOLD);
		setLblFontSize(40);
		setLblBackgroundColor(Color.white);

	}
}
