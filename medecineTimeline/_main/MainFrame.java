package _main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import dao.TimelineDAO;
import panel.MenuPanel;
import panel.ViewPanel;

public class MainFrame extends JFrame implements ActionListener {

	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;
	private static final int LOCATION_X = Index.SCREEN_WIDTH / 2 - FRAME_WIDTH / 2; // 프레임 위치 x축
	private static final int LOCATION_Y = Index.SCREEN_HEIGHT / 2 - FRAME_HEIGHT / 2; // 프레임 위치 y축
	

	ArrayList<model.Timeline> TimelineList;

	public MainFrame() {

		setTitle("복약 타임라인");
		setBounds(LOCATION_X, LOCATION_Y, FRAME_WIDTH, FRAME_HEIGHT);
		setLayout(new BorderLayout(0, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		MenuPanel menuPanel = new MenuPanel();
		ViewPanel viewPanel = new ViewPanel();
		ViewPanel.btnLogout.addActionListener(this);

		add("North", menuPanel);
		add("Center", viewPanel);

		setVisible(true);
		
		TimelineList = TimelineDAO.getInstance().getTimelineList();
		System.out.println(TimelineList.get(0).medecineNumber);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == ViewPanel.btnLogout) {
			MtoL();
		}
		
	}

	public void MtoL(){
		dispose();
		new LoginFrame();
	}

}
