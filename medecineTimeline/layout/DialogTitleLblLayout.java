package layout;

import java.awt.Color;
import java.awt.Font;

public class DialogTitleLblLayout extends LblLayout {

	public DialogTitleLblLayout() {
		// TODO Auto-generated constructor stub
	}

	public DialogTitleLblLayout(String text) {
		// TODO Auto-generated constructor stub
		setLblText(text);
		setLblWidth(150);
		setLblHeight(30);
		setLblFontType("");
		setLblFontStyle(Font.BOLD);
		setLblFontSize(20);
		setLblBackgroundColor(Color.white);


	}
}
