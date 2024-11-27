package construtuoress;

public class Pessoa {

	private String nome = "Israel";
	private String sobrenome = "Santos";
	private int idade = 24;
	
	// Costrutor <Modificador <Name the class>>
	public Pessoa(String nome, String sobrenome , int idade) {
		System.out.println("Uma pessa acabade nascer Parabens!!");
		this.nome = nome;
		sobrenome = "Esponja";
		idade = 5;
		
		ImprimindoDados(); // Chama o metodo
		}
	
	private void ImprimindoDados() {
		System.out.format("Nome: %s Sobrenome: %s Idade: %d ",
			nome,
			sobrenome,
			idade
				);
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

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
