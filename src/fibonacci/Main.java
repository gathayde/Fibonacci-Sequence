package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entradaValor = new Scanner(System.in);
		

		System.out.println("Sequência Fibonacci v2024 by Gabriel Athayde\n");

//		System.out.println("Gostaria de verificar um número? (S/N)");

		System.out.println("Digite o número:");
		
		CalculoSequenciaFibonnaci valorE = new CalculoSequenciaFibonnaci();
		
		valorE.CalculoSequencialFibonnaci(entradaValor.nextLong());
		
//		System.out.println("Gostaria de saber qual o numero na sequência com base na sua posição? (S/N)");

//		System.out.println("Deseja SAIR? (S/N)");

//		System.out.println("FIM");

		/* Sequência Fibonacci v2024 
		 * Gostaria de verificar um número? 
		 * Digite o número:
		 * Esse numero FAZ/NÃO FAZ parte da sequência Fibonacci. 
		 * E ocupa a posição:
		 * Gostaria de saber qual numero antecede e sucede a ele? 
		 * O antecessor é: 
		 * O sucessor é: 
		 * Gostaria de saber qual o numero na sequência com base na sua posição? 
		 * Digite em qual posição você quer saber o numero: 
		 * O numero que você procura é: 
		 * Deseja sair?
		 */

		entradaValor.close();

	}

}
