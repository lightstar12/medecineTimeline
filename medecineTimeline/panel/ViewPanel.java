package panel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import _main.LoginFrame;
import element.*;
import layout.ViewPanelLogoutBtnLayout;
import layout.ViewPanelUserLblLayout;

public class ViewPanel extends JPanel{
	
	LabelElement userLabel;
	public static ButtonElement btnLogout;
	

	final String[] header = { "번호", "구분", "시간" };
	String[][] contents;
	int contentSize;
	
	int log = LoginFrame.log;
	
	ViewPanelUserLblLayout userLblLayout = new ViewPanelUserLblLayout();
	ViewPanelLogoutBtnLayout logoutBtnLayout = new ViewPanelLogoutBtnLayout();

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ViewPanel() {
		
		setLayout(new BorderLayout(70, 20));
		
		JPanel statusPanel = new JPanel();
		statusPanel.setLayout(null);
		statusPanel.setPreferredSize(new Dimension(0, 30));
		userLabel = new LabelElement(userLblLayout.lblText, userLblLayout.lblWidth, userLblLayout.lblHeight, 
									 userLblLayout.lblFontType, userLblLayout.lblFontStyle, userLblLayout.lblFontSize, 
									 userLblLayout.lblBackgroundColor, userLblLayout.lblBorderColor, userLblLayout.lblBorderThickness);
		userLabel.setLocation(600, 0);
		userLabel.setHorizontalAlignment(JLabel.RIGHT);
		statusPanel.add(userLabel);
		
		btnLogout = new ButtonElement(logoutBtnLayout.btnText, logoutBtnLayout.btnWidth, logoutBtnLayout.btnHeight, 
									  logoutBtnLayout.btnFontType, logoutBtnLayout.btnFontStyle, logoutBtnLayout.btnFontSize, 
									  logoutBtnLayout.btnBackgroundColor, logoutBtnLayout.btnBorderColor, logoutBtnLayout.btnBorderThickness);
		btnLogout.setLocation(850, 0);
		statusPanel.add(btnLogout);
		
		add("North", statusPanel);
		
//		-------------------------------------------------------------------------------------------------------------------------
		
//		try {
//			
//			String jdbcUrl = "jdbc:mysql://localhost:3306/timeline_db?serverTimezone=UTC&useSSL=false";
//			String dbId = "root";
//			String dbPw = "root";
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
//			
//			String sql = " SELECT COUNT(*) FROM (SELECT * FROM timeline WHERE number = " + log + ") sub ";
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				contentSize = rs.getInt(1);
//			}
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(conn != null) { conn.close(); }
//			if(pstmt != null) { pstmt.close(); }
//			if(rs != null) { rs.close(); }
//		}
//		
//		contents = new String[contentSize][header.length];
//		
//		try {
//			
//			String jdbcUrl = "jdbc:mysql://localhost:3306/timeline_db?serverTimezone=UTC&useSSL=false";
//			String dbId = "root";
//			String dbPw = "root";
//			
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			conn = DriverManager.getConnection(jdbcUrl, dbId, dbPw);
//			
//			String sql = " SELECT medecine_number, time_classfication, time FROM timeline WHERE number = " + log;
//			pstmt = conn.prepareStatement(sql);
//			rs = pstmt.executeQuery();
//			
//			int i = 0;
//			while(rs.next()) {
//				contents[i][0] = rs.getString(1);
//				contents[i][1] = rs.getString(2);
//				contents[i][2] = rs.getString(3);
//				
//				i += 1;
//			}
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			if(conn != null) { conn.close(); }
//			if(pstmt != null) { pstmt.close(); }
//			if(rs != null) { rs.close(); }
//		}
//		
//		JPanel viewDataPanel = new JPanel();
//		viewDataPanel.setLayout(null);
//		viewDataPanel.setSize(0, 850);
//		
////		테이블 생성
//		JTable table = new JTable(contents, header);
//		JScrollPane scrollpane = new JScrollPane(table);
//		
////		테이블 설정
//		table.setFillsViewportHeight(true);	// 테이블이 지정한 부분 전체 사용
//		table.setFont(new Font("", Font.PLAIN, 20)); // 데이터의 폰트
//		
//		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
//		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
//		
////		칼럼 간격 설정
//		table.getColumn("번호").setPreferredWidth(160);
//		table.getColumn("구분").setPreferredWidth(200);
//		table.getColumn("시간").setPreferredWidth(500);
//		
////		칼럼 가운데 정렬
//		for(int i = 0; i < header.length; i++) {
//			table.getColumn(header[i]).setCellRenderer(celAlignCenter);
//		}
//		
////		칼럼 높이 설정
//		table.setRowHeight(70);
//		
////		칼럼 헤더 정
//		table.getTableHeader().setFont(new Font("", Font.BOLD, 25));
//		table.getTableHeader().setPreferredSize(new Dimension(0, 60));
//		
//		scrollpane.setSize(new Dimension(860, 650));
//		scrollpane.setLocation(70, 0);
//		viewDataPanel.add(scrollpane);
//		
//		add("Center", viewDataPanel);
		
	}
}
