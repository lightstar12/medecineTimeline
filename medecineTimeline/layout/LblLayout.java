package layout;

import java.awt.Color;

public class LblLayout {
	private String lblText;
	private int lblWidth;
	private int lblHeight;
	private String lblFontType;
	private int lblFontStyle;
	private int lblFontSize;
	private Color lblBackgroundColor;
	private Color lblBorderColor;
	private int lblBorderThickness;

	public String getLblText() {
		return lblText;
	}

	public void setLblText(String lblText) {
		this.lblText = lblText;
	}

	public int getLblWidth() {
		return lblWidth;
	}

	public void setLblWidth(int lblWidth) {
		this.lblWidth = lblWidth;
	}

	public int getLblHeight() {
		return lblHeight;
	}

	public void setLblHeight(int lblHeight) {
		this.lblHeight = lblHeight;
	}

	public String getLblFontType() {
		return lblFontType;
	}

	public void setLblFontType(String lblFontType) {
		this.lblFontType = lblFontType;
	}

	public int getLblFontStyle() {
		return lblFontStyle;
	}

	public void setLblFontStyle(int lblFontStyle) {
		this.lblFontStyle = lblFontStyle;
	}

	public int getLblFontSize() {
		return lblFontSize;
	}

	public void setLblFontSize(int lblFontSize) {
		this.lblFontSize = lblFontSize;
	}

	public Color getLblBackgroundColor() {
		return lblBackgroundColor;
	}

	public void setLblBackgroundColor(Color lblBackgroundColor) {
		this.lblBackgroundColor = lblBackgroundColor;
	}

	public Color getLblBorderColor() {
		return lblBorderColor;
	}

	public void setLblBorderColor(Color lblBorderColor) {
		this.lblBorderColor = lblBorderColor;
	}

	public int getLblBorderThickness() {
		return lblBorderThickness;
	}

	public void setLblBorderThickness(int lblBorderThickness) {
		this.lblBorderThickness = lblBorderThickness;
	}

	public LblLayout() {

		setLblText(lblText);
		setLblWidth(lblWidth);
		setLblHeight(lblHeight);
		setLblFontType(lblFontType);
		setLblFontStyle(lblFontStyle);
		setLblFontSize(lblFontSize);
		setLblBackgroundColor(lblBackgroundColor);
		setLblBorderColor(lblBorderColor);
		setLblBorderThickness(lblBorderThickness);

	}

}
