package gettersSetters;

public class Cadrasto {
	
	private String nome = "Israel";
	private String sobrenome = "Santos";
	private String profissao = "Dev";
	private int idade = 24;
	private int anonascimento = 2000;
	private double salario = 1400;
	private float altura = 1.78f;
	
	// Modificar set + nome da variavel
	// Pegar get + nome da variavel
	
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
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getAnonascimento() {
		return anonascimento;
	}
	public void setAnonascimento(int anonascimento) {
		this.anonascimento = anonascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
