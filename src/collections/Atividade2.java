package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int numeroEscolhido = 0;
		Scanner ler = new Scanner(System.in);
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

		listaDeNumeros.add(2);
		listaDeNumeros.add(5);
		listaDeNumeros.add(1);
		listaDeNumeros.add(3);
		listaDeNumeros.add(4);
		listaDeNumeros.add(9);
		listaDeNumeros.add(7);
		listaDeNumeros.add(8);
		listaDeNumeros.add(10);
		listaDeNumeros.add(6);
		
		System.out.println("Pesquisar posição pelo numero");
		System.out.println("\nLista de números: " + listaDeNumeros);
		System.out.printf("\nDigite o número que você deseja encontrar: ");
		numeroEscolhido = ler.nextInt();
		
		if(listaDeNumeros.contains(numeroEscolhido)) {
			for(int i = 0; i < listaDeNumeros.size(); i++ ) {
				if(listaDeNumeros.get(i) == numeroEscolhido) {
					System.out.println("O número " + numeroEscolhido + " está localizado na posição: " + i );
				}
			}
		}else {
			System.out.println("O número " + numeroEscolhido + " não foi encontrado!");
		}
		
		

	}

}
