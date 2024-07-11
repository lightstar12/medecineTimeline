package panel;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DeletePanel {

	public static JPanel deletePanel;

	public DeletePanel() {
		
		deletePanel = new JPanel();
		
		deletePanel.setLayout(null);
		deletePanel.setPreferredSize(new Dimension(0, 100));
		
		JLabel testLbl = new JLabel("데이터 삭제 패널");
		testLbl.setSize(100, 50);
		testLbl.setLocation(0, 0);
		deletePanel.add(testLbl);
	}
}
