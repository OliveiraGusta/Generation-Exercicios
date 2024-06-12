package entrada_saida_operadores;

import java.util.Scanner;

public class Atividade2 {
	public static void main(String[] args) {
		float nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;
		Scanner leitura = new Scanner(System.in);

		System.out.println("Calculo da sua Media");
		System.out.println("Digite sua 1º Nota:");
		nota1 = leitura.nextFloat();
		System.out.println("Digite sua 2º Nota:");
		nota2 = leitura.nextFloat();
		System.out.println("Digite sua 3º Nota:");
		nota3 = leitura.nextFloat();
		System.out.println("Digite sua 4º Nota:");
		nota4 = leitura.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nMedia da sua notas: %.1f", media);
		
	}
}
