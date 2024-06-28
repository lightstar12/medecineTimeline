package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import element.*;
import layout.*;

public class MenuPanel extends JPanel{
	ButtonElement[] btnList = new element.ButtonElement[4];
	LabelElement titleLabel;
	
	MenuPanelBtnLayout menuBtnLayout = new MenuPanelBtnLayout();
	MenuPanelLblLayout titleLblLayout = new MenuPanelLblLayout();
	
	public MenuPanel() {
		setLayout(new BorderLayout(70, 0));
		
		titleLabel = new LabelElement(titleLblLayout.lblText, titleLblLayout.lblWidth, titleLblLayout.lblHeight, 
								   titleLblLayout.lblFontType, titleLblLayout.lblFontStyle, titleLblLayout.lblFontSize, 
								   titleLblLayout.lblBackgroundColor, titleLblLayout.lblBorderColor, titleLblLayout.lblBorderThickness);
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		titleLabel.setBorder(BorderFactory.createEmptyBorder(
				titleLblLayout.lblMarginTop, titleLblLayout.lblMarginLeft, titleLblLayout.lblMarginBottom, titleLblLayout.lblMarginRight));
		
		add("North", titleLabel);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(null);
		btnPanel.setPreferredSize(new Dimension(1000, 70));
		btnPanel.setBackground(Color.LIGHT_GRAY);
		
		for(int i = 0; i < menuBtnLayout.btnMenuTextList.length; i++) {
			btnList[i] = new ButtonElement(menuBtnLayout.btnMenuTextList[i], menuBtnLayout.btnWidth, menuBtnLayout.btnHeight, 
										menuBtnLayout.btnFontType, menuBtnLayout.btnFontStyle, menuBtnLayout.btnFontSize, 
										menuBtnLayout.btnBackgroundColor, menuBtnLayout.btnBorderColor, menuBtnLayout.btnBorderThickness);
			btnList[i].setLocation(70 + 220 * i, 20);
			
			btnPanel.add("Center", btnList[i]);
		}
		
		add("Center", btnPanel);
	}

}