package panel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TestPanel extends JPanel{
	public TestPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(0, 100));
		
		JLabel testLbl = new JLabel("테스트 패널");
		testLbl.setSize(100, 50);
		testLbl.setLocation(0, 0);
		add(testLbl);
	}
}
