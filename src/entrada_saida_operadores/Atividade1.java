package entrada_saida_operadores;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		float salario = 0, abono = 0, novoSalario = 0;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Calculo de Novo Salario");
		System.out.println("Digite o Salário:");
		salario = leitura.nextFloat();
		System.out.println("Digite o Abono:");
		abono = leitura.nextFloat();
		novoSalario = salario + abono;
		System.out.printf("\nSeu Salario: %.2f", novoSalario);
		
	}
}
