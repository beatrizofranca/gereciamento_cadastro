package br.com.beatriz;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Register {
	
	public Register() {
	}
	
	public void sceneRegister() {
		Frame frame = new Frame();
		
		frame.setTitle("Cadastro de Usuário");
		
		Label titleLabel = new Label("Cadastro de Usuário");
		titleLabel.setBounds(50, 50, 200, 30);
		
		Label userNameLabel = new Label("Nome Completo:");
		userNameLabel.setBounds(50, titleLabel.getLocation().y + 60, 150, 30);
		
		TextField userNameTextField = new TextField();
		userNameTextField.setBounds(50, userNameLabel.getLocation().y + 30, 200, 30);
		
		Label userEmailLabel = new Label("E-mail:");
		userEmailLabel.setBounds(50, userNameTextField.getLocation().y + 50, 100, 30);
		
		TextField userEmailTextField = new TextField();
		userEmailTextField.setBounds(50, userEmailLabel.getLocation().y + 30, 200, 30);
		
		Label userPasswordLabel = new Label("Senha:");
		userPasswordLabel.setBounds(50, userEmailTextField.getLocation().y + 50, 100, 30);
		
		TextField userPasswordTextField = new TextField();
		userPasswordTextField.setEchoChar('*');
		userPasswordTextField.setBounds(50, userPasswordLabel.getLocation().y + 30, 200, 30);
		
		Button loginButton = new Button("Cadastro");
		loginButton.setBounds(50, userPasswordTextField.getLocation().y + 50, 200, 42);
		loginButton.addActionListener((ActionEvent e) -> {
                    String userName = userNameTextField.getText();
                    String email = userEmailTextField.getText();
                    String userPassword = userPasswordTextField.getText();
                    
                    Dashboard dashboard = new Dashboard();
                    dashboard.sceneDashboard(userName);
                    
                    System.out.printf("Usuário: %s\nE-mail:%s\nSenha: %s", userName, email, userPassword);
                    
                    frame.setVisible(false);
                });
		
		frame.addWindowListener(new WindowListener());
		
		frame.add(titleLabel);
		frame.add(userNameLabel);
		frame.add(userNameTextField);
		frame.add(userEmailLabel);
		frame.add(userEmailTextField);
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
