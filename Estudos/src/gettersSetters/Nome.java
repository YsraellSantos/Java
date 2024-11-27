package gettersSetters;

public class Nome {
 public static void main(String[] args) {
	Pessoa pessoa = new Pessoa();
	
	pessoa.alterar("Israel");
	
	String nome = pessoa.alteraNome();
	System.out.println(nome);
 
 
 }
}
