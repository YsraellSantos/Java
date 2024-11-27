package arrayDinamicoEstatico;

import java.util.ArrayList;


public class ArrayEtatico {
	public static void main(String[] args) {
		
	//	<tipo>[] nome new <tipo>[tamaho do array] Estatico
		
		String[] pessoas = new String[5];
		pessoas[0] = "1";
		pessoas[1] = "2";
		pessoas[2] = "3";
		pessoas[3] = "4";
		pessoas[4] = "5";
		
		System.out.println("Array Estatico");
		System.err.println("Selecinado " + pessoas[4]);
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println(pessoas[i]);
		}
		
	//	ArrayList<Tipo> nome = new ArrayList<Tipo>();
		
		ArrayList<String> arrayDinamico = new ArrayList<String>();
		arrayDinamico.add("Bob Esponja");
		arrayDinamico.add("Marvel");
		arrayDinamico.add("Maney");
		arrayDinamico.add("Israel");
		arrayDinamico.add("Bit");
		arrayDinamico.add("Bred");
		
		System.out.println("Array Dinamico");
		System.err.println("Selecinado " +  arrayDinamico.get(4));
		
		for (int i = 0; i < arrayDinamico.size(); i++) {
			System.out.println(arrayDinamico.get(i));	
		
		}
		
		/*
		 Tipos Primitivos 	-> Wrapper  Class
								
		 int 					Integer	
		 float 					Float
		 double					Double
		 char					Charcter
		*/

		
		ArrayList<Integer> NumeroInteiro = new ArrayList<Integer>();	
		NumeroInteiro.add(1+0);
		NumeroInteiro.add(1+1);
		NumeroInteiro.add(1+2);
		NumeroInteiro.add(1+3);
		NumeroInteiro.add(1+4);
		NumeroInteiro.add(1+5);
		NumeroInteiro.add(1+6);
		NumeroInteiro.add(1+7);
		NumeroInteiro.add(1+8);
		NumeroInteiro.add(1+9);
		

		System.out.println(NumeroInteiro.get(3));
			
	
		for (Integer integer : NumeroInteiro) {
			System.out.println(NumeroInteiro.get(integer));
		}
		
		

	
		
		
	}
}
