package LoopsJava;

import java.util.Scanner;

public class Idades {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0;
		
		while (idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = ler.nextInt();
			
			if (idade < 21) {
				menos21 += 1;
			} else if (idade > 50) {
				mais50 += 1;
			}
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menos21);
		System.out.println("Total de pessoas maiores de 50 anos: " + mais50);

	}

}
