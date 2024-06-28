package element;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import layout.ViewPanelLogoutBtnLayout;

public class ButtonElement extends JButton{
	
	String text;
	int wSize;
	int hSize;
	String fontType;
	int fontStyle;
	int fontSize;
	Color backgroundColor;
	Color borderColor;
	int borderThickness;
	
	public void setButtonText(String text) {
		this.setText(text);
	}
	
	public void setButtonSize(int wSize, int hSize) {
		this.setSize(wSize, hSize);
	}
	
	public void setButtonFontStyle(String fontType, int fontStyle, int fontSize) {
		this.setFont(new Font(fontType, fontStyle, fontSize));
	}
	
	public void setButtonBackgroundColor(Color backgroundColor) {
		this.setBackground(backgroundColor);
	}
	
	public void setButtonBorder(Color borderColor, int borderThickness) {
		this.setBorder(new LineBorder(borderColor, borderThickness));
	}
	
	public ButtonElement(String text, int wSize, int hSize, String fontType, int fontStyle, int fontSize, Color backgroundColor, Color borderColor, int borderThickness) {
		this.text = text;
		this.wSize = wSize;
		this.hSize = hSize;
		this.fontType = fontType;
		this.fontStyle = fontStyle;
		this.fontSize = fontSize;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
		this.borderThickness = borderThickness;
		
		setButtonText(text);
		setButtonSize(wSize, hSize);
		setButtonFontStyle(fontType, fontStyle, fontSize);
		setButtonBackgroundColor(backgroundColor);
		setButtonBorder(borderColor, borderThickness);
	}
	
}
