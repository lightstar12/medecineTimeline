package _main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import dao.MemberDAO;
import dao.TimelineDAO;
import panel.MyPanel;
import panel.View_Panel;

public class mainForm {
	
	public static JFrame frame = new JFrame();
	public static final int FRAME_WIDTH = 1000;
	public static final int FRAME_HEIGHT = 1300;
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	public static Dimension screenSize = tk.getScreenSize();
	
	public static final String database = "timeline_db"; 
	public static final String dbId = "root";
	public static final String dbPw = "root";
	

	public static void main(String[] args) throws Exception {
		
		MemberDAO.getInstance().init();
		TimelineDAO.getInstance().init();
		
		mainForm.frame.setTitle("복약 타임라인");
		mainForm.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainForm.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		mainForm.frame.setVisible(true);
		mainForm.frame.setLocation(screenSize.width/2 - FRAME_WIDTH/2, 100);

		MyPanel mp = new MyPanel();
		View_Panel vp = new View_Panel();
		frame.add(mp);
		frame.add(vp);
		
	}

}
