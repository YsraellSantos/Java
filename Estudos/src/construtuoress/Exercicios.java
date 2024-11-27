package construtuoress;
import java.util.Scanner;

public class Exercicios {
	
	Scanner teclado = new Scanner(System.in);
	 
		// Atributos da classe
		private String nome = "Israel";
		private String cidade = "egito";
		private String bairro = "Marrocos";
		private int anoNascimento;
		private int anoAtual;
		
		// Metodo Construtor
	public	Exercicios(String nome, String cidade,String bairro ) {
		nome= nome;
		this.cidade = cidade;
		this.bairro = bairro;
		this.anoNascimento = 2000;
		anoNascimento = anoNascimento - anoAtual  ;
		imprimirDados();
	}
	
	// Metodo Especificos
	private void imprimirDados() {
		System.out.format("Nome: %s Cidade: %s Bairro: \n ", nome, cidade, bairro);
		System.out.println(" Você nasceu em " + anoNascimento);

	}
	
	
		//Metodos  Get e set
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getBairo() {
		return bairro;
	}
	
	public void setBairo(String bairo) {
		this.bairro = bairo;
	}
	
}
