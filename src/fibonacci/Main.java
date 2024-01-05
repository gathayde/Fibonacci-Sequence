package fibonacci;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entradaValor = new Scanner(System.in);
		
		CalculoSequenciaFibonnaci valorE;
		
		
		System.out.println("Sequência Fibonacci v2024\n");
		System.out.println("Gostaria de verificar um número?");
		System.out.println("Digite um número:\n");
		
		
		valorE = entradaValor.nextLong();
		
		
		
		System.out.println("Esse numero <saidaString> parte da sequência Fibonacci.");
		System.out.println("E ocupa a posição:");
		System.out.println("Gostaria de saber qual numero antecede e sucede a ele?");
		System.out.println("O antecessor é:");
		System.out.println("O sucessor é:");
		System.out.println("Gostaria de saber qual o numero na sequência com base na sua posição?");
		System.out.println("Digite em qual posição você quer saber o numero:");
		System.out.println("O numero que você procura é:");
		System.out.println("Gostaria de saber qual numero antecede e sucede a ele?");
		System.out.println("O antecessor é:");
		System.out.println("O sucessor é:");
		
		System.out.println("Deseja sair?");
		
		
		
		
		
		entradaValor.close();

	}

}
