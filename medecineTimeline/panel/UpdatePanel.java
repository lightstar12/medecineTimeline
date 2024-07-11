package panel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpdatePanel {
	
	public static JPanel updatePanel;

	public UpdatePanel() {
		
		updatePanel = new JPanel();
		
		updatePanel.setLayout(null);
		updatePanel.setPreferredSize(new Dimension(0, 100));
		
		JLabel testLbl = new JLabel("데이터 갱신 패널");
		testLbl.setSize(100, 50);
		testLbl.setLocation(0, 0);
		updatePanel.add(testLbl);
	}
}
