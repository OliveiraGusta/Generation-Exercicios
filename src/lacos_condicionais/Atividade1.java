package lacos_condicionais;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		int numeroA = 0, numeroB = 0, numeroC = 0;
		String condicao = "";
		
		Scanner leitura = new Scanner(System.in);

		System.out.println("A soma de A e B é maior, menor ou igual a C?");
		System.out.println("Digite o número A: ");
		numeroA = leitura.nextInt();
		System.out.println("Digite o número B: ");
		numeroB = leitura.nextInt();
		System.out.println("Digite o número C: ");
		numeroC = leitura.nextInt();
		
		if((numeroA + numeroB) > numeroC) 
			condicao = "Maior do que";
		else if ((numeroA + numeroB) < numeroC) 
			condicao = "Menor do que";
		else
			condicao = "Igual a";
	
		System.out.printf("A Soma de A(%d) + B(%d) é %s C(%d)", numeroA, numeroB, condicao, numeroC );

	}

}
