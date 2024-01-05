package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entradaPergunta = new Scanner(System.in);
		Scanner entradaValor = new Scanner(System.in);

		long valorE = 0;
		String entradaP;

		System.out.println("Sequência Fibonacci v2024 by Gabriel Athayde\n");

		System.out.println("Gostaria de verificar um número? (S/N)");
		entradaP = entradaPergunta.next();

		if (entradaP.contains("S")) {
			System.out.println("Digite o número: ");
			valorE = entradaValor.nextLong();

			System.out.println(valorE);
		}

		System.out.println("Gostaria de saber qual o numero na sequência com base na sua posição? (S/N)");
		entradaP = entradaPergunta.next();

		if (entradaP.contains("S")) {
			System.out.println("Digite em qual posição você quer saber o numero: ");
			valorE = entradaValor.nextLong();
			
			System.out.println(valorE);
		}

		System.out.println("Deseja SAIR? (S/N)");
		entradaP = entradaPergunta.next();

		if (entradaP.contains("S")) {
			System.out.println("Até logo!");
		}else {
			
		}

		System.out.println("FIM");

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
		entradaPergunta.close();

	}

}
