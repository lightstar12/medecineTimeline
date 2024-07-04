package element;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import layout.LblLayout;

public class LabelElement extends JLabel{
	
	public static String text;
	public static int wSize;
	public static int hSize;
	public static String fontType;
	public static int fontStyle;
	public static int fontSize;
	public static Color backgroundColor;
	public static Color borderColor;
	public static int borderThickness;
	
	public void setLabelText(String text) {
		this.setText(text);
	}
	
	public void setLabelSize(int wSize, int hSize) {
		this.setSize(wSize, hSize);
	}
	
	public void setLabelFontStyle(String fontType, int fontStyle, int fontsize) {
		this.setFont(new Font(fontType, fontStyle, fontsize));
	}
	
	public void setLabelBackgroundColor(Color backgroundColor) {
		this.setBackground(backgroundColor);
		this.setOpaque(true);
	}
	
	public void setLabelBorder(Color borderColor, int borderThickness) {
		this.setBorder(new LineBorder(borderColor, borderThickness));
	}
	
	public LabelElement(String text, int wSize, int hSize, String fontType, int fontStyle, int fontSize, Color backgroundColor, Color borderColor, int borderThickness) {
		this.text = text;
		this.wSize = wSize;
		this.hSize = hSize;
		this.fontType = fontType;
		this.fontStyle = fontStyle;
		this.fontSize = fontSize;
		this.backgroundColor = backgroundColor;
		this.borderColor = borderColor;
		this.borderThickness = borderThickness;
		
		setLabelText(text);
		setLabelSize(wSize, hSize);
		setLabelFontStyle(fontType, fontStyle, fontSize);
		setLabelBackgroundColor(backgroundColor);
		setLabelBorder(borderColor, borderThickness);
	}
	
	public LabelElement(LblLayout layout) {
		// TODO Auto-generated constructor stub
		setLabelText(layout.lblText);
		setLabelSize(layout.lblWidth, layout.lblHeight);
		setLabelFontStyle(layout.lblFontType, layout.lblFontStyle, layout.lblFontSize);
		setLabelBackgroundColor(layout.lblBackgroundColor);
		setLabelBorder(layout.lblBorderColor, layout.lblBorderThickness);
	}
}
