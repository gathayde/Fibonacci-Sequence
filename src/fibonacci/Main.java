package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entradaValor = new Scanner(System.in);
		Scanner entradaResposta = new Scanner(System.in);

		String resposta = "";

		System.out.println("Sequência Fibonacci v2024 by Gabriel Athayde\n");

		boolean execusao = true;

		while (execusao == true) {

			System.out.println("Gostaria de verificar um número? (S/N)");
			resposta = entradaResposta.next();

			if (resposta.contains("S")) {

				System.out.println("Digite o número: ");

				CalculoSequenciaFibonnaci valorE = new CalculoSequenciaFibonnaci();

				valorE.CalculoSequencialFibonnaci(entradaValor.nextLong());
				
				resposta = "N";

			}

			if (resposta.contains("N")) {

				System.out.println("Gostaria de saber qual o numero na sequência com base na sua posição? (S/N)");

				resposta = entradaResposta.next();

				if (resposta.contains("S")) {
					System.out.println("Digite em qual posição você quer saber o numero: ");

					CalculoPosicaoFibonnaci contadorE = new CalculoPosicaoFibonnaci();

					contadorE.CalculoPosicaoFibonnaci(entradaValor.nextInt());
					
					resposta = "N";
				}
			}

			if (resposta.contains("N")) {
				System.out.println("Deseja sair? (S/N)");

				resposta = entradaResposta.next();

				if (resposta.contains("S")) {
					System.out.println("Até logo!");
					System.exit(0);

				} else if (resposta.contains("N")) {
					System.out.println("Vamos tentar novamente...\n");
				}
			}
		}

//		  Gostaria de saber qual numero antecede e sucede a ele? (S/N)
//		  O antecessor é: 
//		  O sucessor é:

		entradaValor.close();
		entradaResposta.close();

	}

}
