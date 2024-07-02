package panel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class UpdatePanel extends JPanel{
	public UpdatePanel() {
		setLayout(null);
		setPreferredSize(new Dimension(0, 100));
		
		JLabel testLbl = new JLabel("데이터 갱신 패널");
		testLbl.setSize(100, 50);
		testLbl.setLocation(0, 0);
		add(testLbl);
	}
}
