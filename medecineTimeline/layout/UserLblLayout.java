package layout;

import java.awt.Color;
import java.awt.Font;

import _main.Index;

public class UserLblLayout extends LblLayout {
	public UserLblLayout() {
		// TODO Auto-generated constructor stub
		setLblText(Index.userId + "님");
		setLblWidth(200);
		setLblHeight(30);
		setLblFontType("");
		setLblFontStyle(Font.BOLD);
		setLblFontSize(20);
		setLblBackgroundColor(Color.white);
		
	}
}
