package estrutura_de_dados;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {

		Stack<String> stackBooks = new Stack<String>();
		Scanner scanner = new Scanner(System.in);
		String bookName;
		int option = 0;

		while (true) {
			System.out.printf("""

					---------------------------------------------

					        Gerenciamento de Livros
					---------------------------------------------

						1 - Adicionar Livro na Pilha
						2 - Listar todos os Livros
						3 - Retirar Livro da Pilha

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
				System.out.println("\nAdicionar um Livro ao topo da Pilha");
				System.out.println("---------------------------------------------");
				System.out.printf("Digite o nome do Livro: ");
				scanner.skip("\\R?");
				bookName = scanner.nextLine();

				stackBooks.push(bookName);
				System.out.println("\nLivro " + bookName + " adicionado ao começo da Pilha");

				break;
			case 2:
				System.out.println("\nLista de Todos os Livros");
				System.out.println("---------------------------------------------");

				if (!stackBooks.isEmpty()) {
					System.out.println("Pilha(" + stackBooks.size() + ")");
					for (int i = stackBooks.size() - 1; i >= 0; i--) {
					    System.out.println(stackBooks.get(i));
					}
				} else
					System.out.println("A Pilha está vazia");

				break;
			case 3:
				System.out.println("\nRemover um Livro do topo");
				System.out.println("---------------------------------------------");

				if (!stackBooks.isEmpty()) {
					System.out.println("Livro " + stackBooks.pop() + " retirado da pilha");

				} else
					System.out.println("A Pilha está vazia");

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
