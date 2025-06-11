package br.com.beatriz;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Welcome {

	public Welcome() {
	}
	
	public void sceneWelcome() {
		Frame frame = new Frame();
		
		frame.setTitle("Welcome");
		
		Label titleLabel = new Label("Welcome");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 26));
		titleLabel.setBounds(50, 50, 200, 30);
		
		Button loginButton = new Button("Login");
		loginButton.setBackground(Color.gray);
		loginButton.setBounds(50, titleLabel.getLocation().y + 50, 200, 42);
		
		Button registerButton = new Button("Cadastrar");
		registerButton.setBounds(50, loginButton.getLocation().y + 50, 200, 42);
		
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				login.sceneLogin();
				
				frame.setVisible(false);
			}
		});
		
		registerButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Register register = new Register();
				register.sceneRegister();
				
				frame.setVisible(false);
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
		  @Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(titleLabel);
		frame.add(loginButton);
		frame.add(registerButton);
		
		frame.setLayout(null);
		frame.setBounds(300, 300, 300, 300);
		frame.setVisible(true);
	}
}

