package CondicionaisJava;

import java.util.Scanner;

public class DoacaoDeSangue {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean jaDoou;
		
		System.out.print("Qual é o seu nome: ");
		nome = ler.next();
		System.out.print("Qual a sua idade: ");
		idade = ler.nextInt();
		System.out.print("Primeira doação de sangue?(true ou false): ");
		jaDoou = ler.nextBoolean();
		
		if (idade >= 18 && idade <= 69) {
			if ((idade >= 60 && jaDoou == false) || idade < 60) {
				System.out.print(nome + " está apto(a) a doar sangue.");
			} else { 
				System.out.print(nome + " não está apto(a) a doar sangue.");
			}
		} else {
			System.out.print(nome + " não está apto(a) a doar sangue.");
		}

	}

}
