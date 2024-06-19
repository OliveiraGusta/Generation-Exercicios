package collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {
		int number = 0;
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		Set<Integer> setRandomNumbers = new HashSet<Integer>();
		
		System.out.println("Eu pensei em 10 números de 0 a 30");
		System.out.println("Você tem 1 chance para adivinhar apenas 1 número entre eles");
		
		for(int i = 0; i < 10; i++) {
			setRandomNumbers.add(random.nextInt(31));
		}
		
		System.out.printf("Digite algum número que você acha que pensei: ");
		number = scanner.nextInt();
		
		if(setRandomNumbers.contains(number))
			System.out.printf("\nO número %d foi encontrado!\n", number);
		else
			System.out.printf("\nO número %d não foi encontrado!\n", number);
		
		System.out.println("Esses foram os números pensados:");
		System.out.println(setRandomNumbers);
	
	}

}
