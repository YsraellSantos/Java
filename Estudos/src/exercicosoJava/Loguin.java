package exercicosoJava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Loguin {
	Scanner teclado = new Scanner(System.in);
	
	// Atributos
	private String usuario;
	private String senha;
	
	// Construtor
	
	
	public Loguin(String usuario, String senha) {
		JOptionPane.showMessageDialog(null, "Bem Vindo");
		this.usuario = usuario;
		this.senha = senha;
		mostraStatus();
	}
	
	// metodos especificos
	
	private void mostraStatus() {
		
		 String usuario = JOptionPane.showInputDialog(null, "Usuário", "Login", JOptionPane.PLAIN_MESSAGE);
	     String senha = JOptionPane.showInputDialog(null, "Senha", "Login", JOptionPane.PLAIN_MESSAGE);

		
		if (usuario != null && usuario.endsWith("@gmail.com")) {
            
            if (senha != null && senha.length() >= 6) {
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Senha inválida! A senha deve ter mais de 6 caracteres.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuário inválido! O e-mail deve terminar com @gmail.com.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

	// Get set
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Scanner getTeclado() {
		return teclado;
	}

	public void setTeclado(Scanner teclado) {
		this.teclado = teclado;
	}

	
	
	
}
