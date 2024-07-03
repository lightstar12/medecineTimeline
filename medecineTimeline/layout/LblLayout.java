package layout;

import java.awt.Color;

public class LblLayout {
	public static String lblText;
	public static int lblWidth;
	public static int lblHeight;
	public static String lblFontType;
	public static int lblFontStyle;
	public static int lblFontSize;
	public static Color lblBackgroundColor;
	public static Color lblBorderColor;
	public static int lblBorderThickness;

	public static String getLblText() {
		return lblText;
	}

	public static void setLblText(String lblText) {
		LblLayout.lblText = lblText;
	}

	public static int getLblWidth() {
		return lblWidth;
	}

	public static void setLblWidth(int lblWidth) {
		LblLayout.lblWidth = lblWidth;
	}

	public static int getLblHeight() {
		return lblHeight;
	}

	public static void setLblHeight(int lblHeight) {
		LblLayout.lblHeight = lblHeight;
	}

	public static String getLblFontType() {
		return lblFontType;
	}

	public static void setLblFontType(String lblFontType) {
		LblLayout.lblFontType = lblFontType;
	}

	public static int getLblFontStyle() {
		return lblFontStyle;
	}

	public static void setLblFontStyle(int lblFontStyle) {
		LblLayout.lblFontStyle = lblFontStyle;
	}

	public static int getLblFontSize() {
		return lblFontSize;
	}

	public static void setLblFontSize(int lblFontSize) {
		LblLayout.lblFontSize = lblFontSize;
	}

	public static Color getLblBackgroundColor() {
		return lblBackgroundColor;
	}

	public static void setLblBackgroundColor(Color lblBackgroundColor) {
		LblLayout.lblBackgroundColor = lblBackgroundColor;
	}

	public static Color getLblBorderColor() {
		return lblBorderColor;
	}

	public static void setLblBorderColor(Color lblBorderColor) {
		LblLayout.lblBorderColor = lblBorderColor;
	}

	public static int getLblBorderThickness() {
		return lblBorderThickness;
	}

	public static void setLblBorderThickness(int lblBorderThickness) {
		LblLayout.lblBorderThickness = lblBorderThickness;
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
