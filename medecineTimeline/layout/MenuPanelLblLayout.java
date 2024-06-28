package layout;

import java.awt.Color;
import java.awt.Font;

public class MenuPanelLblLayout {
	public String lblText;
	public int lblWidth;
	public int lblHeight;
	public String lblFontType;
	public int lblFontStyle;
	public int lblFontSize;
	public Color lblBackgroundColor;
	public Color lblBorderColor;
	public int lblBorderThickness;
	
	public int lblMarginTop;
	public int lblMarginLeft;
	public int lblMarginBottom;
	public int lblMarginRight;
	
	public MenuPanelLblLayout() {
		
		this.lblText = "복약 타임라인";
		this.lblWidth = 0;
		this.lblHeight = 0;
		this.lblFontType = "";
		this.lblFontStyle = Font.BOLD;
		this.lblFontSize = 40;
		this.lblBackgroundColor = Color.white;
		this.lblBorderColor = Color.black;
		this.lblBorderThickness = 0;
		
		this.lblMarginTop = 20;
		this.lblMarginLeft = 0;
		this.lblMarginBottom = 20;
		this.lblMarginRight = 0;
	}
}
