package entrada_saida_operadores;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		float numero1 = 0, numero2 = 0, numero3 = 0, numero4 = 0, diferenca = 0;
		Scanner leitura = new Scanner(System.in);

		System.out.println("Calculo da Diferenca de 4 numeros");
		System.out.println("Digite o 1º numero:");
		numero1 = leitura.nextFloat();
		System.out.println("Digite o 2º numero:");
		numero2 = leitura.nextFloat();
		System.out.println("Digite o 3º numero:");
		numero3 = leitura.nextFloat();
		System.out.println("Digite o 4º numero:");
		numero4 = leitura.nextFloat();
		
		diferenca = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.printf("\nCalculo: (%f X %f) - (%f X %f)",numero1, numero2, numero3, numero4);
		System.out.printf("\nResultado da Diferença: %.1f",  diferenca);
	
	}

}
