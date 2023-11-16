package LoopsJava;

import java.util.Scanner;

public class ColaboradoresDesenvolvimento {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int idade, genero, cargo, contador = 0;
		int qtdBack = 0, qtdMulherFront = 0, qtdHomemMobile40 = 0, qtdNBinFull30 = 0;
		float mediaIdade = 0;
		char continua = 's';
		
		while (continua != 'n') {
			System.out.println("Colaborador n°" + contador);
			System.out.print("Idade: ");
			idade = ler.nextInt();
			System.out.println("Identidade de gênero");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			System.out.print("Insira a identidade: ");
			genero = ler.nextInt();
			System.out.println("Cargo do colaborador");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			System.out.print("Insira o cargo: ");
			cargo = ler.nextInt();
			System.out.print("Deseja continua(S/N): ");
			continua = ler.next().charAt(0);
			
			if (cargo == 1) {
				qtdBack += 1;
			}
			if ((genero == 1 || genero == 4) && cargo == 2) {
				qtdMulherFront += 1;
			}
			if ((genero == 2 || genero == 5) && cargo == 3 && idade > 40) {
				qtdHomemMobile40 += 1;
			}
			if (genero == 3 && cargo == 4 && idade < 30) {
				qtdNBinFull30 += 1;
			}
			contador += 1;
			mediaIdade += idade;
			
		}
		
		System.out.println("\nPessoas Desenvolvedoras Backend: " + qtdBack);
		System.out.println("Mulheres cis e trans desenvolvedoras Frontend: " + qtdMulherFront);
		System.out.println("Homens cis e trans desenvolvedores Mobile maiores que 40 anos: " + qtdHomemMobile40);
		System.out.println("Não binários desenvolvedores Fullstack menores de 30 anos: " + qtdNBinFull30);
		System.out.println("Total de pessoas que responderam a pesquisa: " + contador);
		System.out.println("Média de idade das pessoas que responderam a pesquisa: " + mediaIdade/contador);

	}

}
