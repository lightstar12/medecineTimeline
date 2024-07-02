package dao;

import java.util.ArrayList;

import _main.Index;

import java.sql.ResultSet;
import java.sql.Statement;

import model.Timeline;

public class TimelineDAO {
	private TimelineDAO() {
	}

	private static TimelineDAO instance = new TimelineDAO();

	public static TimelineDAO getInstance() {
		return TimelineDAO.instance;
	}

//	멤버 변수
	ArrayList<Timeline> timelineList;
	int timelineSize;
	int[] numberList = new int[100];
	String[] medecineNumberList = new String[100];
	String[] timeClassficationList = new String[100];
	String[] time = new String[100];

	public void init() throws Exception {

		String sql;
		if(Index.log == -1 ) {
			sql = " SELECT * FROM timeline ";
		} else {
			sql = " SELECT * FROM timeline WHERE number=" + Index.log;
		}

		try (DbConnect dbco = new DbConnect();
				Statement stmt = dbco.getStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			int i = 0;
			while (rs.next()) {

				numberList[i] = rs.getInt(1);
				medecineNumberList[i] = rs.getString(2);
				timeClassficationList[i] = rs.getString(3);
				time[i] = rs.getString(4);

				i += 1;

			}

			timelineSize = i;

		} catch (Exception e) {
			e.printStackTrace();
		}

		timelineList = new ArrayList<Timeline>();
		for (int i = 0; i < timelineSize; i++) {

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
		for (int i = 0; i < timelineSize; i++) {
			rTimelineList.add(timelineList.get(i));
		}

		return rTimelineList;
	}

}
