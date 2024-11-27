package trayCatch;

import java.time.chrono.Era;
import java.util.ArrayList;

public class TryCatch {
	public static void main(String[] args) {
		
		ArrayList<Integer> numero =  new ArrayList<Integer>();		
	
		try {
			numero.add(1);
			numero.add(2);
			numero.add(3);
			numero.add(4);
			numero.add(5);
			numero.add(6);
			System.out.println(numero.get(4));
			
		} catch (Exception erro) {
			System.out.println(erro);
		} finally {
			System.out.println("O codigo continua");			
		}
		
	}
	

}
