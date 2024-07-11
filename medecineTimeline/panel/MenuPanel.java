package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import element.ButtonElement;
import element.LabelElement;

import layout.TitleLblLayout;
import layout.UserLblLayout;
import layout.LoginBtnLayout;
import layout.MenuBtnLayout;

public class MenuPanel {
	
	public static JPanel menuPanel;

	public static ButtonElement insertBtn, viewBtn, deleteBtn, updateBtn, logoutBtn;
	LabelElement titleLbl, userLbl;
	
	String[] menuBtnList = new String[]{"데이터 조회", "데이터 추가", "데이터 삭제", "데이터 갱신"};
	
	TitleLblLayout titleLblLayout;
	UserLblLayout userLblLayout;
	MenuBtnLayout insertBtnLayout, viewBtnLayout, deleteBtnLayout, updateBtnLayout;
	LoginBtnLayout logoutBtnLayout;

	public MenuPanel() {
		
		menuPanel = new JPanel();
		
		menuPanel.setLayout(new BorderLayout(70, 0));

		titleLblLayout = new TitleLblLayout("복약타임라인");
		titleLblLayout.setLblFontSize(40);
		titleLbl = new LabelElement(titleLblLayout);
		titleLbl.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
		titleLbl.setHorizontalAlignment(JLabel.CENTER);
		menuPanel.add("North", titleLbl);

		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(null);
		btnPanel.setPreferredSize(new Dimension(1000, 70));
		btnPanel.setBackground(Color.LIGHT_GRAY);
		btnPanel.setBackground(Color.white);

		insertBtnLayout = new MenuBtnLayout("데이터 추가");
		insertBtn = new ButtonElement(insertBtnLayout);
		insertBtn.setLocation(70, 20);
		btnPanel.add(insertBtn);
		
		viewBtnLayout = new MenuBtnLayout("데이터 조회");
		viewBtn = new ButtonElement(viewBtnLayout);
		viewBtn.setLocation(290, 20);
		btnPanel.add(viewBtn);
		
		deleteBtnLayout = new MenuBtnLayout("데이터 삭제");
		deleteBtn = new ButtonElement(deleteBtnLayout);
		deleteBtn.setLocation(510, 20);
		btnPanel.add(deleteBtn);
		
		updateBtnLayout = new MenuBtnLayout("데이터 갱신");
		updateBtn = new ButtonElement(updateBtnLayout);
		updateBtn.setLocation(730, 20);
		btnPanel.add(updateBtn);
		
		menuPanel.add("Center", btnPanel);
		
		JPanel statusPanel = new JPanel();
		statusPanel.setLayout(null);
		statusPanel.setPreferredSize(new Dimension(0, 30));
		statusPanel.setBackground(Color.white);
		
		userLblLayout = new UserLblLayout();
		userLbl = new LabelElement(userLblLayout);
		userLbl.setLocation(600, 0);
		userLbl.setHorizontalAlignment(JLabel.RIGHT);
		statusPanel.add(userLbl);
		
		logoutBtnLayout = new LoginBtnLayout("로그아웃");
		logoutBtn = new ButtonElement(logoutBtnLayout);
		logoutBtn.setLocation(850, 0);
		statusPanel.add(logoutBtn);
		
		menuPanel.add("South", statusPanel);
	}

}