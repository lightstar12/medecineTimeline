package _main;

import javax.swing.JFrame;

import dao.MemberDAO;
import dao.TimelineDAO;

public class Index extends JFrame {
		
	private static final long serialVersionUID = 1L;
	
	public static final String database = "timeline_db";	// DB명
	public static final String dbId = "root";							// DB id
	public static final String dbPw = "root";							// DB pw
	
	public static String userId;
	public static int log = -1;

	public static void main(String[] args) throws Exception {

		MemberDAO.getInstance().init();
		TimelineDAO.getInstance().init();
		
		LoginFrame loginFrmae = new LoginFrame(); // 로그인 화면
		
	}

}
