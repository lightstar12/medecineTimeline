package element;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.plaf.FontUIResource;

public class ComboBoxElement extends JComboBox<String> {
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
	
	public ComboBoxElement() {
		// TODO Auto-generated constructor stub
		setComboBoxSize(ALLBITS, ABORT);
		setComboBoxFontStyle(TOOL_TIP_TEXT_KEY, ALLBITS, ABORT);
		setComboBoxBackgroundColor(getBackground());
	}
}
