package LoopsJava;

import java.util.Scanner;

public class SomaDePositivos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int num = 0, total = 0;
		
		do {
			System.out.print("Insira um número: ");
			num = ler.nextInt();
			
			if (num > 0) {
				total += num;
			}
		} while (num != 0);
		
		System.out.println("\nSoma dos números positivos: " + total);
	}

}
