package CondicionaisJava;

import java.util.Scanner;

public class ReajusteDeSalario {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int codigo;
		float salario, reajuste = 0, novoSalario;
		String nome, cargo = null;
		
		System.out.print("Nome do colaborador: ");
		nome = ler.next();
		System.out.print("Código do cargo: ");
		codigo = ler.nextInt();
		System.out.print("Salário atual: ");
		salario = ler.nextFloat();
		
		switch (codigo) {
		case 1:
			cargo = "Gerente";
			reajuste = 1.10F;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 1.07F;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 1.09F;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 1.06F;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 1.05F;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 1.08F;
			break;
		}
		
		novoSalario = salario * reajuste;
		
		System.out.println("\nNome do colaborador: " + nome);
		System.out.println("Cargo do colaborador: " + cargo);
		System.out.printf("Salário reajustado: R$%.2f\n", novoSalario);
	}
}
