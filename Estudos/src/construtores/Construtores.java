package construtores;

public class Construtores {

	public static void main(String[] args) {
		// Construtor padrão
		Produtos p1 = new Produtos();
		p1.nome = "Caneta Preta";
		p1.modelo = "Bic";
		p1.valor = 1.50f;
		
		
		// Construtor com dois objetos
		Produtos p2 = new Produtos("Caneta Vermelha", "Faber");
		p2.valor = 140f;
		
		//Construtor com com tres objetos
		Produtos p3 = new Produtos("Borracha", "Mercure", 189f);
		
		System.out.println("Nome: " + p1.nome + " Modelo: " + p1.modelo + " Valor: " + p1.valor);
		System.out.println("Nome: " + p2.nome + " Modelo: " + p2.modelo + " Valor: " + p2.valor);
		System.out.println("Nome: " + p3.nome + " Modelo: " + p3.modelo + " Valor: " + p3.valor);
	}

}
