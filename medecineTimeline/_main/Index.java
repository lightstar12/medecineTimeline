package _main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import dao.MemberDAO;
import dao.TimelineDAO;

public class Index extends JFrame {

	public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // 전체 화면 사이즈
	public static final int SCREEN_WIDTH = screenSize.width;
	public static final int SCREEN_HEIGHT = screenSize.height;
		
	public static final String database = "timeline_db";	// DB명
	public static final String dbId = "root";							// DB id
	public static final String dbPw = "root";							// DB pw

	public static void main(String[] args) throws Exception {

		MemberDAO.getInstance().init();
		TimelineDAO.getInstance().init();
		
		LoginFrame loginFrmae = new LoginFrame(); // 로그인 화면
		MainFrame mainFrame; // 메인 화면
		
	}

}
