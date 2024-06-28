package _main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import dao.MemberDAO;
import dao.TimelineDAO;
import panel.MenuPanel;
import panel.ViewPanel;

public class MainFrame{
	
	public static final int FRAME_WIDTH = 1000;
	public static final int FRAME_HEIGHT = 1000;
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	public static Dimension screenSize = tk.getScreenSize();
	public static final int LOCATION_X = screenSize.width / 2 - FRAME_WIDTH / 2;
	public static final int LOCATION_Y = screenSize.height / 2 - FRAME_HEIGHT / 2;
	
	public static final String database = "timeline_db"; 
	public static final String dbId = "root";
	public static final String dbPw = "root";
	
	
	public MainFrame() throws Exception {
		JFrame mainFrame = new JFrame();
		
		mainFrame.setTitle("복약 타임라인");
		mainFrame.setBounds(LOCATION_X, LOCATION_Y, FRAME_WIDTH, FRAME_HEIGHT);
		mainFrame.setLayout(new BorderLayout(0, 20));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MenuPanel myPanel = new MenuPanel();
		ViewPanel viewPanel = new ViewPanel();
		
		mainFrame.add("North", myPanel);
		mainFrame.add("Center", viewPanel);
		
		mainFrame.setVisible(true);
	}

	public static void main(String[] args) throws Exception {

//		DAO들을 데이터베이스와 동기화
		MemberDAO.getInstance().init();
		TimelineDAO.getInstance().init();
		
//		MainFrame 실행
		new MainFrame();
		
	}

}
