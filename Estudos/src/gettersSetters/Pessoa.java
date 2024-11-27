package gettersSetters;

public class Pessoa {
	
	private String nome = "João";
	private int idade = 20;
	private double altura = 120;
	private double largura;
	
	public String alteraNome() {
		return nome;
	}
	
	public void  alterar(String nome) {
		this.nome = nome;
	}
	
	public int  alterarIdade(int idade) {
		return idade;
	}
	
	public void pegarIdade(int idade) {
		this.idade = idade;
	}
	
	public double alterarAltura(double altura) {
		return altura;
	}
	
	public void pegarAltura(double altura) {
		this.altura = altura;
	}
	
}
