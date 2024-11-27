package gettersSetters;

public class Dev {
	
	public static void main(String[] args) {
		
		Cadrasto cad = new Cadrasto();
		
		
		cad.setNome("Israel");
		System.out.println("Nome: " + cad.getNome());
		
		cad.setSobrenome("Custodio");
		System.out.println("Sobrenome: "+ cad.getSobrenome());
		
		cad.setProfissao("Analista de sistema");
		System.out.println("Profissão: " + cad.getProfissao());
		
		cad.setIdade(24);
		System.out.println("Idade: " + cad.getIdade());
		
		cad.setAnonascimento(2000);
		System.out.println("Ano Nascimento: " + cad.getAnonascimento());
		
		cad.setSalario(3000);
		System.out.println("Salario: " + cad.getSalario());
		
		cad.setAltura(2.00f);
		System.out.println("Metros: " + cad.getAltura());
		
	}
	
}
