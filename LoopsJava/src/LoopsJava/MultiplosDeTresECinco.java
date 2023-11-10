package LoopsJava;

import java.util.Scanner;

public class MultiplosDeTresECinco {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.print("Primeiro número: ");
		n1 = ler.nextInt();
		System.out.print("Segundo número: ");
		n2 = ler.nextInt();
		
		System.out.println();
		
		if (n1 > n2) {
			System.out.println("Intervalo inválido");
		} else {
			for(int i = n1; i <= n2; i++) {
				if ((i % 3 == 0) && (i % 5 == 0)) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}

	}

}
