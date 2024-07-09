package _main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import panel.MenuPanel;
import panel.ViewPanel;
import panel.InsertPanel;
import panel.DeletePanel;
import panel.UpdatePanel;

public class MainFrame implements ActionListener {

	public static final int FRAME_WIDTH = 1000;
	public static final int FRAME_HEIGHT = 1000;

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
		mainFrame.setLayout(new BorderLayout(0, 0));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuPanel = new MenuPanel();
		MenuPanel.insertBtn.addActionListener(this);
		MenuPanel.viewBtn.addActionListener(this);
		MenuPanel.deleteBtn.addActionListener(this);
		MenuPanel.updateBtn.addActionListener(this);
		MenuPanel.logoutBtn.addActionListener(this);

		viewPanel = new ViewPanel();

		mainFrame.add("North", menuPanel);
		mainFrame.add("Center", viewPanel);

		mainFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == MenuPanel.logoutBtn) {
			logout();
			MtoL();
		}

		if (e.getSource() == MenuPanel.insertBtn) {
			removePanel();
			insertPanel = new InsertPanel();
			mainFrame.add("Center", insertPanel);
			mainFrame.revalidate();
		}

		if (e.getSource() == MenuPanel.viewBtn) {
			removePanel();
			try {
				viewPanel = new ViewPanel();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			mainFrame.add("Center", viewPanel);
			mainFrame.revalidate();

		}

		if (e.getSource() == MenuPanel.deleteBtn) {
			removePanel();
			deletePanel = new DeletePanel();
			mainFrame.add("Center", deletePanel);
			mainFrame.revalidate();

		}

		if (e.getSource() == MenuPanel.updateBtn) {
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
	
	public void logout() {
		Index.log = -1;
		Index.userId = null;
	}

}
