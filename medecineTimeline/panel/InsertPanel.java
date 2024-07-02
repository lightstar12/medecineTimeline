package panel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class InsertPanel extends JPanel{
	public InsertPanel() {
		setLayout(null);
		setPreferredSize(new Dimension(0, 100));
		
		JLabel testLbl = new JLabel("데이터 추가 패널");
		testLbl.setSize(100, 50);
		testLbl.setLocation(0, 0);
		add(testLbl);
	}
}
