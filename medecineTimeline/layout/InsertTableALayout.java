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
			setLblHeight(122);
		} else if(text.equals("구분")) {
			setLblHeight(122);
		} else if(text.equals("시간")) {
			setLblHeight(356);
		} else {
			return;
		}
		setLblText(text);
		setLblWidth(150);
		setLblFontType("");
		setLblFontStyle(Font.PLAIN);
		setLblFontSize(40);
		setLblBackgroundColor(Color.lightGray);
		setLblBorderColor(Color.black);
		setLblBorderThickness(1);
		
	}
}
