package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import _main.Index;
import model.Timeline;

public class TimelineDAO {
	private TimelineDAO() {}
	private static TimelineDAO instance = new TimelineDAO();
	public static TimelineDAO getInstance() { return TimelineDAO.instance; }
	
//	멤버 변수
	ArrayList<Timeline> timelineList;
	int timelineSize;
	int[] numberList 				= new int[100];
	String[] medecineNumberList 	= new String[100];
	String[] timeClassficationList 	= new String[100];
	String[] time 					= new String[100];
	
//	JDBC연결용 변수
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void init() throws Exception {
		try {
			String jdbcUrl = "jdbc:mysql://localhost:3306/" + Index.database + "?serverTimezone=UTC&useSSL=false";
			String dbId = Index.dbId;
			String dbPw = Index.dbPw;
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
			
			String sql = " SELECT * FROM timeline ";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			int i = 0;
			while(rs.next()) {
				numberList[i] = rs.getInt(1);
				medecineNumberList[i] = rs.getString(2);
				timeClassficationList[i] = rs.getString(3);
				time[i] = rs.getString(4);
				
				i += 1;
			}
			
			timelineSize = i;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) { conn.close(); }
			if (pstmt != null) { pstmt.close(); }
			if (rs != null) { rs.close(); }
		}
		
		timelineList = new ArrayList<Timeline>();
		for(int i = 0; i < timelineSize; i++) {
			Timeline timeline = new Timeline();
			timeline.number = numberList[i];
			timeline.medecineNumber = medecineNumberList[i];
			timeline.timeClassfication = timeClassficationList[i];
			timeline.time = time[i];
			
			timelineList.add(timeline);
		}
	}
	
	public ArrayList<model.Timeline> getTimelineList() {
		ArrayList<Timeline> rTimelineList = new ArrayList<Timeline>();
		for(int i = 0; i < timelineSize; i++) {
			rTimelineList.add(timelineList.get(i));
		}
		
		return rTimelineList;
	}
	
}
