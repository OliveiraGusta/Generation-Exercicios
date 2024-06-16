package vetores_matrizes;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		int[][] matrizInteiros = new int[3][3];
		int somaDiagonalPrincipal = 0, somaDiagonalSecundario = 0;
		Scanner ler = new Scanner(System.in);

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Digite um valor para a posição [%d][%d]: ", linha, coluna);
				matrizInteiros[linha][coluna] = ler.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Elementos da Diagonal Principal: ");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if(linha == 0 && coluna == 0 || linha == 1 && coluna == 1 || linha == 2 && coluna == 2) {
					System.out.printf(" %d ", matrizInteiros[linha][coluna]);
					somaDiagonalPrincipal += matrizInteiros[linha][coluna];
				}
					
			}
		}
		System.out.println();
		
		System.out.println("Elementos da Diagonal Secundária ");
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				if(linha == 0 && coluna == 2 || linha == 1 && coluna == 1 || linha == 2 && coluna == 0) {
					System.out.printf(" %d ", matrizInteiros[linha][coluna]);
					somaDiagonalSecundario += matrizInteiros[linha][coluna];
				}
					
			}
		}
		
		System.out.println();
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);

		System.out.println();
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundario);

	}

}
