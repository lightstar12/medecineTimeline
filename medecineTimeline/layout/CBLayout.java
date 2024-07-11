package layout;

import java.awt.Color;

public class CBLayout {
	
	private int cbWidth;
	private int cbHeight;
	private String cbFontType;
	private int cbFontStyle;
	private int cbFontSize;
	private Color cbBackgroundColor;
	private Color cbBorderColor;
	private int cbBorderThickness;

	public int getCbWidth() {
		return cbWidth;
	}

	public void setCbWidth(int cbWidth) {
		this.cbWidth = cbWidth;
	}

	public int getCbHeight() {
		return cbHeight;
	}

	public void setCbHeight(int cbHeight) {
		this.cbHeight = cbHeight;
	}

	public String getCbFontType() {
		return cbFontType;
	}

	public void setCbFontType(String cbFontType) {
		this.cbFontType = cbFontType;
	}

	public int getCbFontStyle() {
		return cbFontStyle;
	}

	public void setCbFontStyle(int cbFontStyle) {
		this.cbFontStyle = cbFontStyle;
	}

	public int getCbFontSize() {
		return cbFontSize;
	}

	public void setCbFontSize(int cbFontSize) {
		this.cbFontSize = cbFontSize;
	}

	public Color getCbBackgroundColor() {
		return cbBackgroundColor;
	}

	public void setCbBackgroundColor(Color cbBackgroundColor) {
		this.cbBackgroundColor = cbBackgroundColor;
	}

	public Color getCbBorderColor() {
		return cbBorderColor;
	}

	public void setCbBorderColor(Color cbBorderColor) {
		this.cbBorderColor = cbBorderColor;
	}

	public int getCbBorderThickness() {
		return cbBorderThickness;
	}

	public void setCbBorderThickness(int cbBorderThickness) {
		this.cbBorderThickness = cbBorderThickness;
	}

	public CBLayout() {

		setCbWidth(cbWidth);
		setCbHeight(cbHeight);
		setCbFontType(cbFontType);
		setCbFontStyle(cbFontStyle);
		setCbFontSize(cbFontSize);
		setCbBackgroundColor(cbBackgroundColor);
		setCbBorderColor(cbBorderColor);
		setCbBorderThickness(cbBorderThickness);

	}

}
