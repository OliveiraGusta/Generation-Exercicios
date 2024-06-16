package vetores_matrizes;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		int numerosEscolhidos[] = new int[10], somaDosNumeros = 0;
		float mediaFinal = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Informações da sua Lista");
		
		for(int i = 0; i < numerosEscolhidos.length; i++) {
			System.out.printf("Digite o %dº número da lista: ", i + 1);
			numerosEscolhidos[i] = ler.nextInt();
			somaDosNumeros += numerosEscolhidos[i];

		}
		
		System.out.println("\nElementos nos índices ímpares:");
		 for (int i = 0; i < numerosEscolhidos.length; i++) {
			 if(numerosEscolhidos[i] % 2 != 0)
				 System.out.printf("%d ", numerosEscolhidos[i]);
	      }   
		System.out.println();
		
		System.out.println("\nElementos pares:");
		for (int i = 0; i < numerosEscolhidos.length; i++) {
			 if(numerosEscolhidos[i] % 2 == 0)
				 System.out.printf("%d ", numerosEscolhidos[i]);
	      } 
		System.out.println();
		
		System.out.printf("\nSoma: %d", somaDosNumeros);
		System.out.println();
		
		mediaFinal = somaDosNumeros / numerosEscolhidos.length;
        System.out.printf("\nMédia: %.2f", mediaFinal );

		
		
		
	}
}
