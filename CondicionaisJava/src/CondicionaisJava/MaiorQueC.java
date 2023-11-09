package CondicionaisJava;

import java.util.Scanner;

public class MaiorQueC {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Insira o valor de A: ");
		a = ler.nextInt();
		System.out.print("Insira o valor de B: ");
		b = ler.nextInt();
		System.out.print("Insira o valor de C: ");
		c = ler.nextInt();
		
		if ((a + b) > c) {
			System.out.print("A soma de A + B é maior que C");
		} else if ((a + b) == c) {
			System.out.print("A soma de A + B é igual a C");
		} else if((a + b) < c){ 
			System.out.print("A soma de A + B é menos que C");
		}
	}
}
