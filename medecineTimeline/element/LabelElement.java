package element;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import layout.LblLayout;

@SuppressWarnings("serial")
public class LabelElement extends JLabel {

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
		setLabelText(layout.getLblText());
		setLabelSize(layout.getLblWidth(), layout.getLblHeight());
		setLabelFontStyle(layout.getLblFontType(), layout.getLblFontStyle(), layout.getLblFontSize());
		setLabelBackgroundColor(layout.getLblBackgroundColor());
		setLabelBorder(layout.getLblBorderColor(), layout.getLblBorderThickness());
	}
}
