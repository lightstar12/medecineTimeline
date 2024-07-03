package layout;

import java.awt.Color;

public class BtnLayout {
	public static String btnText;
	public static int btnWidth;
	public static int btnHeight;
	public static String btnFontType;
	public static int btnFontStyle;
	public static int btnFontSize;
	public static Color btnBackgroundColor;
	public static Color btnBorderColor;
	public static int btnBorderThickness;

	public static String getBtnText() {
		return btnText;
	}

	public static void setBtnText(String btnText) {
		BtnLayout.btnText = btnText;
	}

	public static int getBtnWidth() {
		return btnWidth;
	}

	public static void setBtnWidth(int btnWidth) {
		BtnLayout.btnWidth = btnWidth;
	}

	public static int getBtnHeight() {
		return btnHeight;
	}

	public static void setBtnHeight(int btnHeight) {
		BtnLayout.btnHeight = btnHeight;
	}

	public static String getBtnFontType() {
		return btnFontType;
	}

	public static void setBtnFontType(String btnFontType) {
		BtnLayout.btnFontType = btnFontType;
	}

	public static int getBtnFontStyle() {
		return btnFontStyle;
	}

	public static void setBtnFontStyle(int btnFontStyle) {
		BtnLayout.btnFontStyle = btnFontStyle;
	}

	public static int getBtnFontSize() {
		return btnFontSize;
	}

	public static void setBtnFontSize(int btnFontSize) {
		BtnLayout.btnFontSize = btnFontSize;
	}

	public static Color getBtnBackgroundColor() {
		return btnBackgroundColor;
	}

	public static void setBtnBackgroundColor(Color btnBackgroundColor) {
		BtnLayout.btnBackgroundColor = btnBackgroundColor;
	}

	public static Color getBtnBorderColor() {
		return btnBorderColor;
	}

	public static void setBtnBorderColor(Color btnBorderColor) {
		BtnLayout.btnBorderColor = btnBorderColor;
	}

	public static int getBtnBorderThickness() {
		return btnBorderThickness;
	}

	public static void setBtnBorderThickness(int btnBorderThickness) {
		BtnLayout.btnBorderThickness = btnBorderThickness;
	}

	public BtnLayout() {

		setBtnText(btnText);
		setBtnWidth(btnWidth);
		setBtnHeight(btnHeight);
		setBtnFontType(btnFontType);
		setBtnFontStyle(btnFontStyle);
		setBtnFontSize(btnFontSize);
		setBtnBackgroundColor(btnBackgroundColor);
		setBtnBorderColor(btnBorderColor);
		setBtnBorderThickness(btnBorderThickness);

	}

}
