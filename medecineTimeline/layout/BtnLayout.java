package layout;

import java.awt.Color;

public class BtnLayout {
	private String btnText;
	private int btnWidth;
	private int btnHeight;
	private String btnFontType;
	private int btnFontStyle;
	private int btnFontSize;
	private Color btnBackgroundColor;
	private Color btnBorderColor;
	private int btnBorderThickness;

	public String getBtnText() {
		return btnText;
	}

	public void setBtnText(String btnText) {
		this.btnText = btnText;
	}

	public int getBtnWidth() {
		return btnWidth;
	}

	public void setBtnWidth(int btnWidth) {
		this.btnWidth = btnWidth;
	}

	public int getBtnHeight() {
		return btnHeight;
	}

	public void setBtnHeight(int btnHeight) {
		this.btnHeight = btnHeight;
	}

	public String getBtnFontType() {
		return btnFontType;
	}

	public void setBtnFontType(String btnFontType) {
		this.btnFontType = btnFontType;
	}

	public int getBtnFontStyle() {
		return btnFontStyle;
	}

	public void setBtnFontStyle(int btnFontStyle) {
		this.btnFontStyle = btnFontStyle;
	}

	public int getBtnFontSize() {
		return btnFontSize;
	}

	public void setBtnFontSize(int btnFontSize) {
		this.btnFontSize = btnFontSize;
	}

	public Color getBtnBackgroundColor() {
		return btnBackgroundColor;
	}

	public void setBtnBackgroundColor(Color btnBackgroundColor) {
		this.btnBackgroundColor = btnBackgroundColor;
	}

	public Color getBtnBorderColor() {
		return btnBorderColor;
	}

	public void setBtnBorderColor(Color btnBorderColor) {
		this.btnBorderColor = btnBorderColor;
	}

	public int getBtnBorderThickness() {
		return btnBorderThickness;
	}

	public void setBtnBorderThickness(int btnBorderThickness) {
		this.btnBorderThickness = btnBorderThickness;
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
