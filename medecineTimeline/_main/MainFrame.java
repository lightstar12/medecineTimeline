package _main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import panel.DeletePanel;
import panel.InsertPanel;
import panel.MenuPanel;
import panel.UpdatePanel;
import panel.ViewPanel;

public class MainFrame implements ActionListener {

	private static final int FRAME_WIDTH = 1000;
	private static final int FRAME_HEIGHT = 1000;

	JFrame mainFrame;
	MenuPanel menuPanel;
	ViewPanel viewPanel;
	InsertPanel insertPanel;
	DeletePanel deletePanel;
	UpdatePanel updatePanel;

	public MainFrame() throws Exception {
		mainFrame = new JFrame();

		mainFrame.setTitle("복약 타임라인");
		mainFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setLayout(new BorderLayout(0, 20));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuPanel = new MenuPanel();
		for (int i = 0; i < 4; i++) {

			MenuPanel.btnList[i].addActionListener(this);
		}

		viewPanel = new ViewPanel();
		ViewPanel.logoutBtn.addActionListener(this);

		mainFrame.add("North", menuPanel);
		mainFrame.add("Center", viewPanel);

		mainFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ViewPanel.logoutBtn) {
			ViewPanel.logout();
			MtoL();
		}

		if (e.getSource() == MenuPanel.btnList[0]) {
			removePanel();
			insertPanel = new InsertPanel();
			mainFrame.add("Center", insertPanel);
			mainFrame.revalidate();
		}

		if (e.getSource() == MenuPanel.btnList[1]) {
			removePanel();
			try {
				viewPanel = new ViewPanel();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			mainFrame.add("Center", viewPanel);
			mainFrame.revalidate();

		}

		if (e.getSource() == MenuPanel.btnList[2]) {
			removePanel();
			deletePanel = new DeletePanel();
			mainFrame.add("Center", deletePanel);
			mainFrame.revalidate();

		}

		if (e.getSource() == MenuPanel.btnList[3]) {
			removePanel();
			updatePanel = new UpdatePanel();
			mainFrame.add("Center", updatePanel);
			mainFrame.revalidate();

		}

	}
	
	public void removePanel() {
		
		if (viewPanel != null) {
			mainFrame.remove(viewPanel);
			viewPanel = null;
		} else if (insertPanel != null) {
			mainFrame.remove(insertPanel);
			insertPanel = null;
		} else if (deletePanel != null) {
			mainFrame.remove(deletePanel);
			deletePanel = null;
		} else if (updatePanel != null) {
			mainFrame.remove(updatePanel);
			updatePanel = null;
		}
		
	}

	public void MtoL() {
		mainFrame.dispose();
		new LoginFrame();
	}

}
