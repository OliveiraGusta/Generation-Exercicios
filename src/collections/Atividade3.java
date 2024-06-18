package collections;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Atividade3 {

	public static void main(String[] args) {
		int numeroEscolhido = 0;
		Scanner ler = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<Integer>();

		System.out.println("\nListar dados pelo Set");
		System.out.println("10 valores inteiros não repetidos");

		for (int i = 0; i < 10; i++) {
			System.out.printf("\nDigite o %dº número para adicionar lista: ", i + 1);
			numeroEscolhido = ler.nextInt();
			setNumeros.add(numeroEscolhido);
			System.out.println("Lista: " + setNumeros);

		}

		System.out.println("\nListar dados do Set:");
		Iterator<Integer> isetNumeros = setNumeros.iterator();

		while (isetNumeros.hasNext()) {
			System.out.println(isetNumeros.next());
		}

	}

}
