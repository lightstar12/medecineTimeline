package layout;

import java.awt.Color;
import java.awt.Font;

public class LoginMenuBtnLayout {

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

	public String btnText;
	public int btnWidth;
	public int btnHeight;
	public String btnFontType;
	public int btnFontStyle;
	public int btnFontSize;
	public Color btnBackgroundColor;
	public Color btnBorderColor;
	public int btnBorderThickness;

	public LoginMenuBtnLayout() {
		// TODO Auto-generated constructor stub
	}
	
	public LoginMenuBtnLayout(String text) {

		setBtnText(text);
		setBtnWidth(100);
		setBtnHeight(30);
		setBtnFontType("");
		setBtnFontStyle(Font.PLAIN);
		setBtnFontSize(20);
		setBtnBackgroundColor(Color.white);
		setBtnBorderColor(Color.black);
		setBtnBorderThickness(1);

	}
}
