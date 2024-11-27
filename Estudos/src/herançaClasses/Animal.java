package herançaClasses;

public class Animal {

	private String nome = "caramelo ";

	public void comer() {
		System.out.printf("%sComeu \n", nome);
	}

	public void beber() {
		System.out.printf("%sBebeu \n", nome);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		
	}
}
