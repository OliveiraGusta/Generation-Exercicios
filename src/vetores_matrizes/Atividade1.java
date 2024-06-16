package vetores_matrizes;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		int numeroEscolhido = 0, numerosInteiros[] = {2,5,1,3,4,9,7,8,10,6};
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Pesquisar Numero pela posição");
		System.out.printf("Lista de Numeros: {");
		for(int indice = 0; indice < numerosInteiros.length; indice++ ) {
			System.out.printf(" %d ", numerosInteiros[indice]);
		}
		System.out.println("}");
		System.out.printf("Digite o número que você deseja encontrar: ");
		numeroEscolhido = ler.nextInt();
		
		for(int indice = 0; indice < numerosInteiros.length; indice++ ) {
			if(numerosInteiros[indice] == numeroEscolhido) {
				System.out.printf("\nO número %d está localizado na posição: %d", numeroEscolhido, indice);
			}
		}
		
		
		

	}

}
