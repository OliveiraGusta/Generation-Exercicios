package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		String corEscolhida = "";
		Scanner ler = new Scanner(System.in);
 		ArrayList<String> cores = new ArrayList<String>();
		
 		System.out.println("Ordenando por ordem alfabetica");
 		
 		while(!corEscolhida.equals("0")) {
 			System.out.println("\nDigite o nome da cor");
 			System.out.println("ou 0 para sair: ");
 	 		corEscolhida = ler.nextLine();
 	 		
 	 		if(corEscolhida.equals("0"))
 	 			break;
 	 		
 	 		cores.add(corEscolhida);
 		}
 		
		System.out.println("\nListar todas as cores:\n");
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);
		System.out.println("\nOrdenar as cores:\n");
		for(String cor : cores) {
			System.out.println(cor);
		}
 			
 			

 
 	
	}

}
