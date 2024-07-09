package layout;

import java.awt.Color;

public class CBLayout {
	
	public static int cbWidth;
	public static int cbHeight;
	public static String cbFontType;
	public static int cbFontStyle;
	public static int cbFontSize;
	public static Color cbBackgroundColor;
	public static Color cbBorderColor;
	public static int cbBorderThickness;

	public static int getCbWidth() {
		return cbWidth;
	}

	public static void setCbWidth(int cbWidth) {
		CBLayout.cbWidth = cbWidth;
	}

	public static int getCbHeight() {
		return cbHeight;
	}

	public static void setCbHeight(int cbHeight) {
		CBLayout.cbHeight = cbHeight;
	}

	public static String getCbFontType() {
		return cbFontType;
	}

	public static void setCbFontType(String cbFontType) {
		CBLayout.cbFontType = cbFontType;
	}

	public static int getCbFontStyle() {
		return cbFontStyle;
	}

	public static void setCbFontStyle(int cbFontStyle) {
		CBLayout.cbFontStyle = cbFontStyle;
	}

	public static int getCbFontSize() {
		return cbFontSize;
	}

	public static void setCbFontSize(int cbFontSize) {
		CBLayout.cbFontSize = cbFontSize;
	}

	public static Color getCbBackgroundColor() {
		return cbBackgroundColor;
	}

	public static void setCbBackgroundColor(Color cbBackgroundColor) {
		CBLayout.cbBackgroundColor = cbBackgroundColor;
	}

	public static Color getCbBorderColor() {
		return cbBorderColor;
	}

	public static void setCbBorderColor(Color cbBorderColor) {
		CBLayout.cbBorderColor = cbBorderColor;
	}

	public static int getCbBorderThickness() {
		return cbBorderThickness;
	}

	public static void setCbBorderThickness(int cbBorderThickness) {
		CBLayout.cbBorderThickness = cbBorderThickness;
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
