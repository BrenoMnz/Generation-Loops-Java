package LoopsJava;

import java.util.Scanner;

public class MediaMultiplosDeTres {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num = 0;
		float totalMultiplos3 = 0, contMultiplos3 = 0;
		
		do {
			System.out.print("Digite um número: ");
			num = ler.nextInt();
			
			if (num % 3 == 0) {
				totalMultiplos3 += num;
				contMultiplos3 += 1;
			}
		} while (num != 0);
		
		System.out.println("\nMédia de todos os números múltiplos de 3: " + (totalMultiplos3 / (contMultiplos3 - 1)));

	}

}
