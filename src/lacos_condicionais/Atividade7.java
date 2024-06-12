package lacos_condicionais;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		float numero1 = 0, numero2 = 0, resultado = 0;
		int operacao = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println("Digite o 1º número:");
		numero1 = leitura.nextFloat();
		System.out.println("Digite o 2º número:");
		numero2 = leitura.nextFloat();
		System.out.printf("""
				Digite o codigo da operação
				1 - Soma
				2 - Subtração
				3 - Multiplicação
				4 - Divisão
				""");
		operacao = leitura.nextInt();

		
		switch(operacao){
			case 1:
				resultado = numero1 + numero2;
				System.out.println("Soma");
				System.out.printf("%.1f + %.1f = %.1f", numero1, numero2, resultado);
				break;
			case 2:
				resultado = numero1 - numero2;
				System.out.println("Subtração");
				System.out.printf("%.1f - %.1f = %.1f", numero1, numero2, resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println("Multiplicação");
				System.out.printf("%.1f * %.1f = %.1f", numero1, numero2, resultado);
				break;
			case 4:
				resultado = numero1 / numero2;
				System.out.println("Divisão");
				System.out.printf("%.1f / %.1f = %.1f", numero1, numero2, resultado);
				break;
				
			default:
				System.out.println("Operação Inválida!");
		}
		
		
		
	}

}
