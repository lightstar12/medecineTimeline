package _main;

import javax.swing.JFrame;

import dao.MemberDAO;
import dao.TimelineDAO;

public class Index {
	
	public static final String database = "timeline_db";	// DB명
	public static final String dbId = "root";							// DB id
	public static final String dbPw = "root";							// DB pw
	
	public static String userId;
	public static int log = -1;
	
	public static JFrame index;

	public static void main(String[] args) throws Exception {
		
		index = new JFrame();

		MemberDAO.getInstance().init();
		TimelineDAO.getInstance().init();
		
		new LoginFrame(); // 로그인 화면
		
	}

}
