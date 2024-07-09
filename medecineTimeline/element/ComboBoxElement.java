package element;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;

import layout.CBLayout;

public class ComboBoxElement<E> extends JComboBox<String> {
	private static final long serialVersionUID = 1L;
	
	public void setComboBoxSize(int wSize, int hSize) {
		this.setSize(wSize, hSize);
	}
	
	public void setComboBoxFontStyle(String fontType, int fontStyle, int fontSize) {
		this.setFont(new FontUIResource(fontType, fontStyle, fontSize));
	}
	
	public void setComboBoxBackgroundColor(Color backgroundColor) {
		this.setBackground(backgroundColor);
	}
	
	public void setComboBoxBorder(Color borderColor, int borderThickness) {
		this.setBorder(new LineBorder(borderColor, borderThickness));
	}
	
	public ComboBoxElement(String[] itmes, CBLayout layout) {
		// TODO Auto-generated constructor stub
//		setCombo
		setModel(new DefaultComboBoxModel<String>(itmes));
		setComboBoxSize(CBLayout.cbWidth, CBLayout.cbHeight);
		setComboBoxFontStyle(CBLayout.cbFontType, CBLayout.cbFontStyle, CBLayout.cbFontSize);
		setComboBoxBackgroundColor(CBLayout.cbBackgroundColor);
		setComboBoxBorder(CBLayout.cbBorderColor, CBLayout.cbBorderThickness);
	}
}
