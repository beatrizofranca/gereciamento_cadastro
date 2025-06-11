package br.com.beatriz;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login {
	
	public Login() {}
	
	public void sceneLogin() {
		Frame frame = new Frame();
		frame.setTitle("Login");
		
		Label userNameLabel = new Label("Usuário:");
		userNameLabel.setBounds(50, 50, 100, 30);
		
		TextField userNameTextField = new TextField();
		userNameTextField.setBounds(50, userNameLabel.getLocation().y + 30, 150, 30);
		
		Label userPasswordLabel = new Label("Senha:");
		userPasswordLabel.setBounds(50, userNameTextField.getLocation().y + 50, 100, 30);
		
		TextField userPasswordTextField = new TextField();
		userPasswordTextField.setEchoChar('*');
		userPasswordTextField.setBounds(50, userPasswordLabel.getLocation().y + 30, 150, 30);
		
		Button loginButton = new Button("Login");
		loginButton.setBounds(50, userPasswordTextField.getLocation().y + 50, 150, 42);
		loginButton.addActionListener((ActionEvent e) -> {
                    String userName = userNameTextField.getText();
                    String userPassword = userPasswordTextField.getText();
                    
                    System.out.printf("Usuário: %s\nSenha: %s", userName, userPassword);
                    Dashboard dashboard = new Dashboard();
                    dashboard.sceneDashboard(userName);
                    frame.setVisible(false);
                });
		
		frame.addWindowListener(new WindowListener());
		
		frame.add(userNameLabel);
		frame.add(userNameTextField);
		frame.add(userPasswordLabel);
		frame.add(userPasswordTextField);
		frame.add(loginButton);
		
		frame.setLayout(null);
		frame.setBounds(400, 400, 400, 600);
		frame.setVisible(true);
	}
	
	protected final class WindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
