package element;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.border.LineBorder;

import layout.BtnLayout;

@SuppressWarnings("serial")
public class ButtonElement extends JButton {

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

	public ButtonElement(BtnLayout layout) {
		// TODO Auto-generated constructor stub
		setButtonText(layout.getBtnText());
		setButtonSize(layout.getBtnWidth(), layout.getBtnHeight());
		setButtonFontStyle(layout.getBtnFontType(), layout.getBtnFontStyle(), layout.getBtnFontSize());
		setButtonBackgroundColor(layout.getBtnBackgroundColor());
		setButtonBorder(layout.getBtnBorderColor(), layout.getBtnBorderThickness());
	}

}
