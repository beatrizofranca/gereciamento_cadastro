package br.com.beatriz;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Dashboard {
	
	public Dashboard() {
	}
	
	public void sceneDashboard(String userName) {
		Frame frame = new Frame();
		
		frame.setTitle("Dashboard");
		Label titleLabel = new Label("Dashboard");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
		titleLabel.setBounds(50, 50, 250, 30);
		
		Label userNameLabel = new Label(userName);
		userNameLabel.setBounds(50, titleLabel.getLocation().y + 60, 200, 30);
		
		frame.addWindowListener(new WindowListener());
		
		frame.add(titleLabel);
		frame.add(userNameLabel);

		
		frame.setLayout(null);
		frame.setBounds(400, 400, 600, 400);
		frame.setVisible(true);
	}
	
	protected final class WindowListener extends WindowAdapter {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
