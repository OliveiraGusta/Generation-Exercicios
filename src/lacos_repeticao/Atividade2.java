package lacos_repeticao;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		int contador = 0, numero = 0, quantidadePar = 0, quantidadeImpar = 0;
		 
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Contador de Pares e Impares");
		for (contador = 1; contador < 11; contador++) {
            System.out.printf("Digite o %dº número: ", contador);
            numero = leitura.nextInt();
            
            if((numero % 2) != 0) {
            	quantidadeImpar++;
            }else {
            	quantidadePar++;
            }
            	
        }
		
		System.out.println();
		System.out.println("Total de números pares: " + quantidadePar );
		System.out.println("\nTotal de números ímpares: " + quantidadeImpar);
	}
}
