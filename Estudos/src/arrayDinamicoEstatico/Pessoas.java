package arrayDinamicoEstatico;

import java.util.Scanner;

public class Pessoas {
	
	Scanner teclado = new Scanner(System.in);

	private String nome;
	private String sobrenome;
	private String telelone;

	public Pessoas(String nome, String sobrenome, String telelone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telelone = telelone;	
	}

	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getTelelone() {
		return telelone;
	}

	public void setTelelone(String telelone) {
		this.telelone = telelone;
	}


}
