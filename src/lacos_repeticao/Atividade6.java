package lacos_repeticao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		float numero = 0, somaPositivos = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Soma dos números positivos");
		
		  do{
			  System.out.printf("Digite um número: ");
	          numero = leitura.nextInt();
	          
	          if(numero > 0) {
	        	  somaPositivos += numero; 
	          }
	          
	     
	        } while (numero != 0);
		  
		System.out.printf("A soma dos números positivos é: %.0f",  somaPositivos);
	}
}
