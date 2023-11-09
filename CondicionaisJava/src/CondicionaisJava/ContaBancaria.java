package CondicionaisJava;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int opCod;
		float saldo = 1000, movimento;
		
		System.out.println("Códigos de operação");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito\n");
		System.out.print("Insira sua operação: ");
		opCod = ler.nextInt();
		
		switch(opCod) {
		case 1:
			System.out.println("\nOperação - Saldo\n");
			System.out.println("Saldo: " + saldo);
			break;
		case 2:
			System.out.println("\nOperação - Saque\n");
			System.out.print("Insira o valor do saque: ");
			movimento = ler.nextFloat();
			
			System.out.println("\nOperação - Saque\n");
			if (movimento > saldo || movimento < 0) {
				System.out.println("Saldo insuficiente ou inválido!");
			} else {
				saldo -= movimento;
				System.out.println("Novo saldo: " + saldo);
			}
			break;
		case 3:
			System.out.println("\nOperação - Depósito\n");
			System.out.print("Insira o valor do depósito: ");
			movimento = ler.nextFloat();
			
			System.out.println("\\nOperação - Depósito\n");
			if (movimento < 0) {
				System.out.println("Depósito inválido!");
			} else {
				saldo += movimento;
				System.out.println("Novo saldo: " + saldo);
			}
			break;
		default:
			System.out.println("\nOperação inválida!");
			break;
		}
	}
}
