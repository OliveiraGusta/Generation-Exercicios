package lacos_condicionais;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int numero = 0;
		String parOuImpar = "par", negativoOuPositivo = "neutro";
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("Par ou Impar? Positivo ou Negativo?");
		System.out.println("Digite um número: ");
		numero = leitura.nextInt();
		
		if(numero > 0) 
			negativoOuPositivo = "positivo";
		else if(numero < 0)
			negativoOuPositivo = "negativo";
		
		if((numero % 2) != 0)
			parOuImpar = "impar";
			
		
		System.out.printf("O Número %d é %s e %s!", numero, parOuImpar, negativoOuPositivo);

	}

}
