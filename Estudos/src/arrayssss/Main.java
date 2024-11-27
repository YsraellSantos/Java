package arrayssss;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> numero = new ArrayList<Integer>();
		numero.add(12);
		numero.add(4);
		numero.add(5);
		numero.add(14);
		numero.add(58);
		numero.add(58);
		numero.add(87);
		numero.add(25);
		numero.add(58);
		numero.add(36);
		numero.add(85);
		numero.add(23);

		Collections.sort(numero);
		for (Integer integer : numero) {
			System.out.println("Orden crecente  " + integer);
		}

		System.out.println("\n");
		Collections.reverse(numero);

		for (Integer numeroo : numero) {
			System.out.println("Ornde decrecente  " + numeroo);
		}

		ArrayList<String> nome = new ArrayList<String>();
		nome.add("Cachorro");
		nome.add("Abelha");
		nome.add("Formiga");
		nome.add("Murisoca");
		nome.add("Vaca");
		nome.add("Cavalo");
		nome.add("tatu");
		nome.add("Zebra");

		Collections.sort(nome);

		for (String animal : nome) {
			System.out.println("Orden Crescente -> " + animal);
		}

		ArrayList<String> OrdenDecrecente = new ArrayList<String>();
		OrdenDecrecente.add("Cachorro");
		OrdenDecrecente.add("Abelha");
		OrdenDecrecente.add("Formiga");
		OrdenDecrecente.add("Murisoca");
		OrdenDecrecente.add("Vaca");
		OrdenDecrecente.add("Cavalo");
		OrdenDecrecente.add("tatu");
		OrdenDecrecente.add("Zebra");

		System.out.println("\n");
		Collections.reverse(OrdenDecrecente);
		for (String OrdenCrescente : OrdenDecrecente) {
			System.out.println("Orden Decrescente -> " + OrdenCrescente);
		}
	}
}
