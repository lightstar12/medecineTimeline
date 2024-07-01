package layout;

import java.awt.Color;
import java.awt.Font;

import panel.ViewPanel;

public class LoginPanelIdLblLayout {

	public String lblText;
	public int lblWidth;
	public int lblHeight;
	public String lblFontType;
	public int lblFontStyle;
	public int lblFontSize;
	public Color lblBackgroundColor;
	public Color lblBorderColor;
	public int lblBorderThickness;
	
	public LoginPanelIdLblLayout() {
		
		this.lblText = "ID";
		this.lblWidth = 80;
		this.lblHeight = 30;
		this.lblFontType = "";
		this.lblFontStyle = Font.BOLD;
		this.lblFontSize = 30;
		this.lblBackgroundColor = Color.white;
		this.lblBorderColor = Color.black;
		this.lblBorderThickness = 0;
		
	}
}
