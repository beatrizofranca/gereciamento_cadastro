package br.com.beatriz;

import java.awt.Button;
import java.awt.FlowLayout;
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
        
        frame.setLayout(new FlowLayout()); 
        
        Label userNameLabel = new Label("Usuário:");
        
        TextField userNameTextField = new TextField(20);
        
        Label userPasswordLabel = new Label("Senha:");
        
        TextField userPasswordTextField = new TextField(20);
        userPasswordTextField.setEchoChar('*');
        
        Button loginButton = new Button("Login");
        
        loginButton.addActionListener((ActionEvent e) -> {
            String userName = userNameTextField.getText();
            String userPassword = userPasswordTextField.getText();
            
            System.out.printf("Usuário: %s\nSenha: %s%n", userName, userPassword);
            
            // É crucial que a classe Dashboard exista e esteja acessível
            // Se Dashboard também usa AWT Frame, o método deve ser sceneDashboard
            // Certifique-se de que Dashboard.java está no pacote br.com.beatriz
            // ou importado corretamente se estiver em outro pacote.
            Dashboard dashboard = new Dashboard();
            dashboard.sceneDashboard(userName);
            frame.setVisible(false); // Esconde a tela de login
            frame.dispose(); // Libera os recursos da tela de login
        });
        
        frame.addWindowListener(new WindowListener());
        
        frame.add(userNameLabel);
        frame.add(userNameTextField);
        frame.add(userPasswordLabel);
        frame.add(userPasswordTextField);
        frame.add(loginButton);
        
        frame.setBounds(400, 400, 300, 200);
        frame.setVisible(true);
    }
    
    protected final class WindowListener extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    // --- NOVO: Adicionado método main para que você possa executar esta classe diretamente ---
    public static void main(String[] args) {
        Login loginApp = new Login();
        loginApp.sceneLogin(); // Chama o método que configura e mostra a tela de login
    }
}