package layout;

import java.awt.Color;
import java.awt.Font;

public class TitleLblLayout extends LblLayout {
	public TitleLblLayout() {
		// TODO Auto-generated constructor stub
	}

	public TitleLblLayout(String text) {
		// TODO Auto-generated constructor stub
		setLblText(text);
		setLblWidth(100);
		setLblHeight(100);
		setLblFontType("");
		setLblFontStyle(Font.BOLD);
		setLblFontSize(30);
		setLblBackgroundColor(Color.white);

	}
}
