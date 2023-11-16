package LoopsJava;

import java.util.Scanner;

public class QtdParEImpar {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int num, qtdPar = 0, qtdImpar = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i+1) + "° número: ");
			num = ler.nextInt();
			
			if (num % 2 == 0) {
				qtdPar += 1;
			} else {
				qtdImpar += 1;
			}
		}
		
		System.out.println("\nQuantidade de números pares: " + qtdPar);
		System.out.println("Quantidade de número ímpares: " + qtdImpar);
	}

}
