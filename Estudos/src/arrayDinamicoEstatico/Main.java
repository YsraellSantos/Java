package arrayDinamicoEstatico;

import java.util.ArrayList;
import java.util.Collection;import java.util.SortedMap;

public class Main {

	public static void main(String[] args) {
	
	    Pessoas maria = new Pessoas("Maria", "Santos" , "79998811791" );
	    Pessoas joao = new Pessoas("João", "Santana", " 79525492689");
	    Pessoas pedro = new Pessoas("Pedro", "Custodio", "57842396784");
	
		
	    ArrayList<Pessoas> status = new ArrayList<Pessoas>();
	    
	    status.add(pedro);
	    status.add(joao);
	    status.add(maria);
	    
	    for (Pessoas pessoas : status) {
			System.out.println(pessoas.getNome());
		}
	    
	    ArrayList<Pessoas> mostraInformacoes = new ArrayList<Pessoas>();
	    mostraInformacoes.add(new Pessoas("Pedro", "Custodio", "57842396784"));
	    mostraInformacoes.add(new Pessoas("Pedro", "Custodio", "57842396784"));
	    mostraInformacoes.add(new Pessoas("Maria", "Santos" , "79998811791" ));
	    
	    ArrayList<Integer> numero = new ArrayList<Integer>();
	    numero.add(20); 
	    numero.add(4); 
	    numero.add(8);
	    numero.add(5); 
	    numero.add(58);
	    numero.add(72); 
	    numero.add(86); 
	    numero.add(36); 

	}

}
