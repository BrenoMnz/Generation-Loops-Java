package CondicionaisJava;

import java.util.Scanner;

public class ItemComprado {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int codigo, qtComprada;
		float preco = 0, valorTotal;
		String produto = null;
		
		System.out.print("Código do produto: ");
		codigo = ler.nextInt();
		System.out.print("Quantidade comprada: ");
		qtComprada = ler.nextInt();
		
		switch (codigo) {
		case 1:
			produto = "Cachorro Quente";
			preco = 10.00F;
			break;
		case 2:
			produto = "X-salada";
			preco = 15.00F;
			break;
		case 3:
			produto = "X-bacon";
			preco = 18.00F;
			break;
		case 4:
			produto = "Bauru";
			preco = 12.00F;
			break;
		case 5:
			produto = "Refrigerante";
			preco = 8.00F;
			break;
		case 6:
			produto = "Suco de laranja";
			preco = 13.00F;
			break;
		}
		
		valorTotal = preco * qtComprada;
		
		System.out.println("\nProduto: " + produto);
		System.out.printf("Valor total: R$%.2f\n",valorTotal);
	}
}
