package layout;

import java.awt.Color;
import java.awt.Font;

public class DialogLblLayout extends LblLayout {

	public DialogLblLayout() {
		// TODO Auto-generated constructor stub
	}

	public DialogLblLayout(String text) {
		// TODO Auto-generated constructor stub
		setLblText(text);
		setLblWidth(100);
		setLblHeight(30);
		setLblFontType("");
		setLblFontStyle(Font.BOLD);
		setLblFontSize(20);
		setLblBackgroundColor(Color.white);


	}
}
