package layout;

import java.awt.Color;
import java.awt.Font;

public class DialogTitleLblLayout {

	public String lblText;
	public int lblWidth;
	public int lblHeight;
	public String lblFontType;
	public int lblFontStyle;
	public int lblFontSize;
	public Color lblBackgroundColor;
	public Color lblBorderColor;
	public int lblBorderThickness;

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

	public DialogTitleLblLayout() {

	}

	public DialogTitleLblLayout(String text) {

		setLblText(text);
		setLblWidth(150);
		setLblHeight(30);
		setLblFontType("");
		setLblFontStyle(Font.BOLD);
		setLblFontSize(20);
		setLblBackgroundColor(Color.white);
		setLblBorderColor(Color.black);
		setLblBorderThickness(0);

	}

}
