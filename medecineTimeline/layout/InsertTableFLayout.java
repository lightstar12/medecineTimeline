package layout;

import java.awt.Color;

public class InsertTableFLayout extends LblLayout {
	public InsertTableFLayout() {
		// TODO Auto-generated constructor stub
	}

	public InsertTableFLayout(String text) {
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
		setLblText("");
		setLblWidth(710);
		setLblBackgroundColor(Color.lightGray);
		setLblBorderColor(Color.black);
		setLblBorderThickness(1);
		
	}
}
