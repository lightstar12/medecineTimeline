package dao;

import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.Statement;

import model.Member;

public class MemberDAO {

	private MemberDAO() {
	}

	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return MemberDAO.instance;
	}

//	멤버 변수
	ArrayList<Member> memberList;
	int memberSize;
	int[] numberList = new int[100];
	String[] idList = new String[100];
	String[] firstNameList = new String[100];
	String[] lastNameList = new String[100];
	String[] pwList = new String[100];
	String[] emailList = new String[100];
	String[] phoneNumberList = new String[100];

	public void init() throws Exception {

		String sql = " SELECT * FROM member ";

		try (DbConnect dbco = new DbConnect();
				Statement stmt = dbco.getStatement();
				ResultSet rs = stmt.executeQuery(sql);) {

			int i = 0;
			while (rs.next()) {

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
		}

		memberList = new ArrayList<Member>();
		for (int i = 0; i < memberSize; i++) {
			
			Member member = new Member();
			member.number = numberList[i];
			member.id = idList[i];
			member.firstName = firstNameList[i];
			member.lastName = lastNameList[i];
			member.pw = pwList[i];
			member.email = emailList[i];
			member.phoneNumber = phoneNumberList[i];

			memberList.add(member);

		}
	}

	public ArrayList<model.Member> getMemberList() {
		ArrayList<Member> rMemberList = new ArrayList<Member>();
		for (int i = 0; i < memberSize; i++) {
			rMemberList.add(memberList.get(i));
		}

		return rMemberList;
	}
}
