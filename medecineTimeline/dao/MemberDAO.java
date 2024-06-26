package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Member;

public class MemberDAO {
	private MemberDAO() {}
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() { return MemberDAO.instance; }

//	멤버 변수
	ArrayList<Member> memberList;
	int memberSize;
	int[] numberList 			= new int[100]; 
	String[] idList 			= new String[100];
	String[] firstNameList 		= new String[100];
	String[] lastNameList 		= new String[100];
	String[] pwList				= new String[100];
	String[] emailList			= new String[100];
	String[] phoneNumberList 	= new String[100];
	
//	JDBC연결용 변수
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void init() throws Exception {
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/" + _main.MainFrame.database + "?serverTimezone=UTC&useSSL=false";
			String dbId = _main.MainFrame.dbId;
			String dbPw = _main.MainFrame.dbPw;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = " SELECT * FROM member ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int i = 0;
			while(rs.next()) {
				numberList[i] = rs.getInt(1);
				idList[i] = rs.getString(2);
				firstNameList[i] = rs.getString(3);
				lastNameList[i] = rs.getString(4);
				pwList[i] = rs.getString(5);
				emailList[i] = rs.getString(6);
				phoneNumberList[i] = rs.getString(7);
				
				i += 1;
			}
			
			memberSize = i;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) { conn.close(); }
			if (pstmt != null) { pstmt.close(); }
			if (rs != null) { rs.close(); }
		}
		
		memberList = new ArrayList<Member>();
		for(int i = 0; i < memberSize; i++) {
			Member member = new Member();
			member.number = numberList[i];
			member.id = idList[i];
			member.firstName = firstNameList[i];
			member.lastName = lastNameList[i];
			member.pw = pwList[i];
			member.email = emailList[i];
			member.phoneNumber = phoneNumberList[i];
		}
	}
}
