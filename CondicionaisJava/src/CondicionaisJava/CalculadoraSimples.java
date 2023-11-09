package CondicionaisJava;

import java.util.Scanner;

public class CalculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float numero1, numero2, resultado;
		int codOp;
		
		System.out.print("Número 1: ");
		numero1 = ler.nextFloat();
		System.out.print("Número 2: ");
		numero2 = ler.nextFloat();
		System.out.println("Códigos de operação\n");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão\n");
		System.out.print("Insira o código da operação: ");
		codOp = ler.nextInt();
		
		switch(codOp) {
		case 1:
			System.out.println("Resultado: " + (numero1 + numero2));
			break;
		case 2:
			System.out.println("Resultado: " + (numero1 - numero2));
			break;
		case 3:
			System.out.println("Resultado: " + (numero1 * numero2));
			break;
		case 4:
			System.out.println("Resultado: " + (numero1 / numero2));
			break;
		default:
			System.out.println("\nOperação inválida!");
			break;
		}
	}
}
