package panel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class View_Panel extends JPanel{

	static final int PANEL_SIZE_WIDTH = 1000;
	static final int PANEL_SIZE_HEIGHT = 880;

	final String[] ATTRIVUTELIST = { "번호", "구분", "시간" };
	final int[] size = {200, 200, 460};
	JButton btn;
	JLabel[] AttributeLabel;
	JLabel[] ViewDataLabel;

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public View_Panel() {
		
		setLayout(null);
		
		int totalSize = 0;
		AttributeLabel = new JLabel[ATTRIVUTELIST.length];
		for(int i = 0; i < ATTRIVUTELIST.length; i++) {
			AttributeLabel[i] = new JLabel();
			AttributeLabel[i].setText(ATTRIVUTELIST[i]);
			AttributeLabel[i].setSize(size[i], 50);
			AttributeLabel[i].setLocation(70 + totalSize, 70);
			totalSize += size[i]; 
			AttributeLabel[i].setHorizontalAlignment(JLabel.CENTER);
			AttributeLabel[i].setBorder(new LineBorder(Color.black, 1, true));
			add(AttributeLabel[i]);
		}
		
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		MainFrame.frame.setContentPane(new MyPanel());
//		MainFrame.frame.revalidate();
//	}
}
