package element;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import layout.LblLayout;

public class LabelElement extends JLabel{
	
	private static final long serialVersionUID = 1L;
	
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
	
	public LabelElement(LblLayout layout) {
		// TODO Auto-generated constructor stub
		setLabelText(LblLayout.lblText);
		setLabelSize(LblLayout.lblWidth, LblLayout.lblHeight);
		setLabelFontStyle(LblLayout.lblFontType, LblLayout.lblFontStyle, LblLayout.lblFontSize);
		setLabelBackgroundColor(LblLayout.lblBackgroundColor);
		setLabelBorder(LblLayout.lblBorderColor, LblLayout.lblBorderThickness);
	}
}
