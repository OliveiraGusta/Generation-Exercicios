package entrada_saida_operadores;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		float salarioBruto = 0, adicionalNoturno = 0, horasExtras = 0, descontos = 0, salarioLiquido = 0;
		Scanner leitura = new Scanner(System.in);

		System.out.println("Calculo do seu salario liquido");
		System.out.println("Digite seu salario bruto:");
		salarioBruto = leitura.nextFloat();
		System.out.println("Digite o valor do adicional noturno:");
		adicionalNoturno = leitura.nextFloat();
		System.out.println("Digite o valor das horas extras:");
		horasExtras = leitura.nextFloat();
		System.out.println("Digite o valor dos descontos:");
		descontos = leitura.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras  * 5 ) - descontos;
		
		System.out.printf("\nSeu salario liquido: %.2f", salarioLiquido);
	}
}
