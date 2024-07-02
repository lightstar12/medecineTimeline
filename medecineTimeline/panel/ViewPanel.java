package panel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import _main.Index;

import dao.TimelineDAO;

import element.LabelElement;
import element.ButtonElement;

import layout.ViewPanelUserLblLayout;
import layout.ViewPanelLogoutBtnLayout;

public class ViewPanel extends JPanel {
	
	LabelElement userLabel;
	public static ButtonElement logoutBtn;

	final String[] header = { "번호", "구분", "시간" };
	String[][] contents;
	int contentSize;
	
	int log = Index.log;
	
	ViewPanelUserLblLayout userLblLayout = new ViewPanelUserLblLayout();
	ViewPanelLogoutBtnLayout logoutBtnLayout = new ViewPanelLogoutBtnLayout();

	static ArrayList<model.Timeline> timelineList;

	public ViewPanel() throws Exception {
		
		TimelineDAO.getInstance().init();
		
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
		
		logoutBtn = new ButtonElement(logoutBtnLayout.btnText, logoutBtnLayout.btnWidth, logoutBtnLayout.btnHeight, 
									  logoutBtnLayout.btnFontType, logoutBtnLayout.btnFontStyle, logoutBtnLayout.btnFontSize, 
									  logoutBtnLayout.btnBackgroundColor, logoutBtnLayout.btnBorderColor, logoutBtnLayout.btnBorderThickness);
		logoutBtn.setLocation(850, 0);
		statusPanel.add(logoutBtn);
		
		add("North", statusPanel);
		
		loadData();
		
		JPanel viewDataPanel = new JPanel();
		viewDataPanel.setLayout(null);
		viewDataPanel.setSize(0, 850);
		
//		테이블 생성
		JTable table = new JTable(contents, header);
		JScrollPane scrollpane = new JScrollPane(table);
		
//		테이블 설정
		table.setFillsViewportHeight(true);	// 테이블이 지정한 부분 전체 사용
		table.setFont(new Font("", Font.PLAIN, 20)); // 데이터의 폰트
		
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
//		칼럼 간격 설정
		table.getColumn("번호").setPreferredWidth(160);
		table.getColumn("구분").setPreferredWidth(200);
		table.getColumn("시간").setPreferredWidth(500);
		
//		칼럼 가운데 정렬
		for(int i = 0; i < header.length; i++) {
			table.getColumn(header[i]).setCellRenderer(celAlignCenter);
		}
		
//		칼럼 높이 설정
		table.setRowHeight(70);
		
//		칼럼 헤더 정
		table.getTableHeader().setFont(new Font("", Font.BOLD, 25));
		table.getTableHeader().setPreferredSize(new Dimension(0, 60));
		
		scrollpane.setSize(new Dimension(860, 650));
		scrollpane.setLocation(70, 0);
		viewDataPanel.add(scrollpane);
		
		add("Center", viewDataPanel);
	}

	public void loadData() {
		
		contentSize = TimelineDAO.getInstance().getTimelineList().size();
		contents = new String[contentSize][header.length];
		
		for(int i = 0; i < contentSize; i++) {
			contents[i][0] = TimelineDAO.getInstance().getTimelineList().get(i).medecineNumber;
			contents[i][1] = TimelineDAO.getInstance().getTimelineList().get(i).timeClassfication;
			contents[i][2] = TimelineDAO.getInstance().getTimelineList().get(i).time;
		}
	}
	
	public static void logout() {
		Index.log = -1;
		Index.userId = null;
	}
}
