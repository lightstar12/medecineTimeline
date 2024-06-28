package layout;

import java.awt.Color;
import java.awt.Font;

public class ViewPanelLogoutBtnLayout {

	public String btnText;
	public int btnWidth;
	public int btnHeight;
	public String btnFontType;
	public int btnFontStyle;
	public int btnFontSize;
	public Color btnBackgroundColor;
	public Color btnBorderColor;
	public int btnBorderThickness;
	
	public ViewPanelLogoutBtnLayout() {
		
		this.btnText = "로그아웃";
		this.btnWidth = 100;
		this.btnHeight = 30;
		this.btnFontType = "";
		this.btnFontStyle = Font.BOLD;
		this.btnFontSize = 20;
		this.btnBackgroundColor = Color.gray;
		this.btnBorderColor = Color.black;
		this.btnBorderThickness = 0;
		
	}
}
