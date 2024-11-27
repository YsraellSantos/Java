package herançaClasses;

public class Princioal {
	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		
		cachorro.comer();
		cachorro.beber();
		cachorro.latir();
		cachorro.lamber();
		
		System.out.println("\n");
		
		Gato gato = new Gato();
		gato.setNome("Snowbel ");
		gato.beber();
		gato.comer();
		gato.miar();
		
		System.out.println("\n");
		
		
		
		Dragao dragao = new Dragao();
		dragao.setNome("Rhaegal ");
		dragao.comer();
		dragao.soltaFogo();
		dragao.voar();
		
		System.out.println("\n");
		
		Pombo pombo = new Pombo();

		pombo.enviarCastas();
		pombo.setNome("Nome: Columba livia");
		pombo.comer();
		pombo.beber();
		pombo.voar();
		pombo.fazerpruh();
		pombo.enviarCastas();
		
	
		
		
		
		
		
		
		
		
		
	}
}
