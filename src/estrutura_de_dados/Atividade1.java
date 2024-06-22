package estrutura_de_dados;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int option = 0;
		String name;
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.printf("""
					---------------------------------------------

					        Gerenciamento de Fila

					---------------------------------------------

						1 - Adicionar Cliente ao fim da Fila
						2 - Listar todos os Clientes
						3 - Remover o primeiro Cliente da Fila
					    	
						0 - Sair

					---------------------------------------------
					Digite uma opção: """);
			option = scanner.nextInt();
			
			if(option == 0) {
				scanner.close();
				System.exit(0);	
			}
			
			switch(option) {
			case 1: 
				System.out.println("Adicionar Cliente a fila");
				System.out.println("---------------------------------------------");
				System.out.printf("Digite o nome do Cliente: ");	
				scanner.skip("\\R?");
				name = scanner.nextLine();
				
				break;
			case 2:
				System.out.println("Lista de Todos os Clientes da Fila");
				System.out.println("---------------------------------------------");

				break;
			case 3:
				System.out.println("Remover o primeiro Cliente da Fila");
				System.out.println("---------------------------------------------");
				
				break;
			default:
				System.out.println("Opção Inválida");
				System.out.println("---------------------------------------------");
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA");
				
				break;
			}
			
			
				
				
			
		}
		
	}

}
