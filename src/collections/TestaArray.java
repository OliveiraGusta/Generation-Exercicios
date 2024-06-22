package collections;

import java.util.ArrayList;
import java.util.Collections;
public class TestaArray {
	public static void main(String[] args) {
		
		ArrayList<Double> notas = new ArrayList<>();
		
		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		
		// Mostra na tela as notas inseridas
		System.out.println("\nNotas Cadastradas: " + notas.toString());
		
		// Mostra uma determinada nota se existir na lista
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));
		
		// Altera informações da lista (indice, valor)
		notas.set(1, 6.0d);
		System.out.println("\nA nota 5 foi alterada para 6: " + notas.toString());

		// Remove um item da lista pelo indice
		notas.remove(1);
		System.out.println("\nA nota 4 foi apagada " + notas.toString());
		
		// Checa se a lista esta vazia
		System.out.println("\nA lista esta vazia? " + notas.isEmpty());
	
		// Exibe o tamanho da lista
		System.out.println("\nO tamanho da lista é " + notas.size());
		
		// Exibe o maior valor da lista
		System.out.println("\nA maior nota da lista é " + Collections.max(notas));
	
		// Exibe o menor valor da lista
		System.out.println("\nO menor nota da lista é " + Collections.min(notas));
	
		// Limpa a Lista
		notas.clear();
		System.out.println("\nA lista esta vazia? " + notas.isEmpty());
	}

}





