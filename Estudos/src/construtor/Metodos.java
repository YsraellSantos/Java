package construtor;

public class Metodos {
	public static void main(String[] args) {
		
		Classe cl = new Classe();
		
		cl.setNome("Israel");
		cl.setIdade(20);
		cl.setAltura(1.60f);
		
		System.out.format("Nome: %s Idade: %d Altura: %.2f" ,cl.getNome(), cl.getIdade(), cl.getAltura());
	}
}
