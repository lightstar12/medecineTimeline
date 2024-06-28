package layout;

import java.awt.Color;
import java.awt.Font;

public class MenuPanelBtnLayout {
	public String[] btnMenuTextList = null;
	public int btnWidth;
	public int btnHeight;
	public String btnFontType;
	public int btnFontStyle;
	public int btnFontSize;
	public Color btnBackgroundColor;
	public Color btnBorderColor;
	public int btnBorderThickness;
	
	public MenuPanelBtnLayout() {
		
		this.btnMenuTextList = new String[]{"데이터 조회", "데이터 추가", "데이터 삭제", "데이터 갱신"};
		this.btnWidth = 200;
		this.btnHeight = 30;
		this.btnFontType = "";
		this.btnFontStyle = Font.PLAIN;
		this.btnFontSize = 20;
		this.btnBackgroundColor = Color.white;
		this.btnBorderColor = Color.black;
		this.btnBorderThickness = 1;
		
	}
	
}
