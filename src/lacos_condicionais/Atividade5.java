package lacos_condicionais;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		int codigoProduto = 0, quantidadeProduto = 0;
		float valorTotal = 0, precoProduto = 0;
		String nomeProduto = "";
		Scanner leitura = new Scanner(System.in);
		
		System.out.printf("""
				Bem-Vindo a Switch
				=============================
				
				Digite o codigo do Produto
				1 - Cachorro Quente R$ 10.00
				2 - X-Salada R$ 15.00
				3 - X-Bacon R$ 18.00
				4 - Bauru R$ 12.00
				5 - Refrigerante R$ 8.00
				6 - Suco de laranja R$ 13.00
				
				""");
		codigoProduto = leitura.nextInt();
		
		if(codigoProduto >= 6) {
			System.out.println("Codigo não encontrado");
		}else {
			System.out.println("Digite a quantidade desejada:");
			quantidadeProduto = leitura.nextInt();
			
			switch(codigoProduto) {
				case 1:
					nomeProduto = "Cachorro Quente";
					precoProduto = 10;
					break;
				case 2:
					nomeProduto = "X-Salada";
					precoProduto = 15;
					break;
				case 3:
					nomeProduto = "X-Bacon";
					precoProduto = 18;
					break;
				case 4:
					nomeProduto = "Bauru";
					precoProduto = 12;
					break;
				case 5:
					nomeProduto = "Refrigerante";
					precoProduto = 8;
					break;
				case 6:
					nomeProduto = "Suco de laranja";
					precoProduto = 13;
					break;
			}
			
			valorTotal = quantidadeProduto * precoProduto; 
			
			System.out.printf(""" 
					
					Switch 
					=============================
					Produto(Cod.%d): %s
					Valor da Unidade: R$%.2f x %d
					
					Valor Total: R$%.2f
					
					Obrigado pela preferencia!
					""", codigoProduto, nomeProduto, precoProduto, quantidadeProduto, valorTotal);
			
		}
			
		
	}

}
