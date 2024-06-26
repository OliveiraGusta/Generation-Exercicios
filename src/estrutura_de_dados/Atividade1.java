package estrutura_de_dados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Queue<String> queueClients = new LinkedList<String>();
		Scanner scanner = new Scanner(System.in);
		String name;
		int option = 0;

		while (true) {
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

			if (option == 0) {
				System.out.println("\nSair");
				System.out.println("---------------------------------------------");
				System.out.printf("Programa Finalizado!");
				scanner.close();
				System.exit(0);
			}

			switch (option) {
			case 1:
				System.out.println("\nAdicionar Cliente a fila");
				System.out.println("---------------------------------------------");
				System.out.printf("Digite o nome do Cliente: ");
				scanner.skip("\\R?");
				name = scanner.nextLine();

				queueClients.add(name);
				System.out.println("\nCliente " + name + " adicionade ao fim da fila");

				break;
			case 2:
				System.out.println("\nLista de Todos Clientes da Fila");
				System.out.println("---------------------------------------------");

				if (!queueClients.isEmpty()) {
					System.out.println("Fila(" + queueClients.size() + ")");
					for (var client : queueClients) {
						System.out.println(client);
					}
				} else
					System.out.println("A Fila está vazia");

				break;
			case 3:
				System.out.println("\nRemover Cliente da Fila");
				System.out.println("---------------------------------------------");

				if (!queueClients.isEmpty()) {
					System.out.println("Cliente " + queueClients.poll() + " removide da fila");

				} else
					System.out.println("A Fila está vazia");

				break;
			default:
				System.out.println("\nOpção Inválida");
				System.out.println("---------------------------------------------");
				System.out.println("DIGITE UMA OPÇÃO VÁLIDA");

				break;
			}

		}

	}

}
