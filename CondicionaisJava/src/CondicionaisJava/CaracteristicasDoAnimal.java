package CondicionaisJava;

import java.util.Scanner;

public class CaracteristicasDoAnimal {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		String vertebra, classe, alimentacao, animal;
		
		System.out.print("Vertebrado ou invertebrado: ");
		vertebra = ler.next();
		System.out.print("Classe do animal: ");
		classe = ler.next();
		System.out.print("Alimentação do anima: ");
		alimentacao = ler.next();
		
		if (vertebra.equalsIgnoreCase("vertebrado")) {
			
			if (classe.equalsIgnoreCase("ave")) {
				
				if (alimentacao.equalsIgnoreCase("carnívoro")) {
					
					animal = "é a águia";
				} else if (alimentacao.equalsIgnoreCase("onívoro")) {
					
					animal = "é a pomba";
				} else {
					
					animal = "não existe no banco de dados";
				}
			} else if (classe.equalsIgnoreCase("mamífero")) {
				
				if (alimentacao.equalsIgnoreCase("herbívoro")) {
					
					animal = "é a vaca";
				} else if (alimentacao.equalsIgnoreCase("onívoro")) {
					
					animal = "é o homem";
				} else {
					
					animal = "não existe no banco de dados";
				}
			} else {
				animal = "não existe no banco de dados";
			}
		} else if (vertebra.equalsIgnoreCase("invertebrado")) {
			
			if (classe.equalsIgnoreCase("inseto")) {
				
				if (alimentacao.equalsIgnoreCase("hematófago")) {
					
					animal = "é a pulga";
				} else if (alimentacao.equalsIgnoreCase("herbívoro")) {
					
					animal = "é a lagarta";
				} else {
					
					animal = "não existe no banco de dados";
				}
			} else if (classe.equalsIgnoreCase("anelídeo")) {
				
				if (alimentacao.equalsIgnoreCase("hematófago")) {
					
					animal = "é a sanguessuga";
				} else if (alimentacao.equalsIgnoreCase("onívoro")) {
					
					animal = "é a minhoca";
				} else {
					
					animal = "não existe no banco de dados";
				}
			} else {
				animal = "não existe no banco de dados";
			}
		} else {
			animal = "não existe no banco de dados";
		}
		
		System.out.print("\nEsse animal " + animal);
	}

}
