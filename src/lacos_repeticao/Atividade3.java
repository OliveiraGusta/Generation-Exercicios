package lacos_repeticao;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		int idade = 0, menoresQue21 = 0, maioresQue50 = 0;
		 
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Contador de Pares e Impares");
		
		while (idade >= 0) {
            System.out.printf("Digite uma idade: ");
            idade = leitura.nextInt();
            
            if(idade < 21 || idade > 50 ) {
            	if (idade < 21)
            		menoresQue21++;
            	else
            		maioresQue50++;
            }
        }
		
		System.out.println();
		System.out.println("Total de pessoas menores de 21 anos:" + menoresQue21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + maioresQue50);
	}
}
