package _main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import panel.MenuPanel;
import panel.ViewPanel;
import panel.InsertPanel;
import panel.DeletePanel;
import panel.UpdatePanel;

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
		mainFrame.setLayout(new BorderLayout(0, 0));
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		new MenuPanel();
		MenuPanel.insertBtn.addActionListener(this);
		MenuPanel.viewBtn.addActionListener(this);
		MenuPanel.deleteBtn.addActionListener(this);
		MenuPanel.updateBtn.addActionListener(this);
		MenuPanel.logoutBtn.addActionListener(this);

		new ViewPanel();

		mainFrame.add("North", MenuPanel.menuPanel);
		mainFrame.add("Center", ViewPanel.viewPanel);

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
			new InsertPanel();
			mainFrame.add("Center", InsertPanel.insertPanel);
			mainFrame.revalidate();
			
		}

		if (e.getSource() == MenuPanel.viewBtn) {
			removePanel();
			try {
				new ViewPanel();
				mainFrame.add("Center", ViewPanel.viewPanel);
				mainFrame.revalidate();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
		}

		if (e.getSource() == MenuPanel.deleteBtn) {
			removePanel();
			new DeletePanel();
			mainFrame.add("Center", DeletePanel.deletePanel);
			mainFrame.revalidate();

		}

		if (e.getSource() == MenuPanel.updateBtn) {
			removePanel();
			new UpdatePanel();
			mainFrame.add("Center", UpdatePanel.updatePanel);
			mainFrame.revalidate();

		}

	}
	
	public void removePanel() {
		
		if (viewPanel != null) {
			mainFrame.remove(ViewPanel.viewPanel);
			viewPanel = null;
		} else if (insertPanel != null) {
			mainFrame.remove(InsertPanel.insertPanel);
			insertPanel = null;
		} else if (deletePanel != null) {
			mainFrame.remove(DeletePanel.deletePanel);
			deletePanel = null;
		} else if (updatePanel != null) {
			mainFrame.remove(UpdatePanel.updatePanel);
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
