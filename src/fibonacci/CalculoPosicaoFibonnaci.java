package fibonacci;

public class CalculoPosicaoFibonnaci {

	public void CalculoPosicaoFibonnaci(int contadorEnt) {

		long valorA = 0;
		long valorB = 1;

//		A sucessão de Fibonacci é uma sequência de números inteiros iniciados por zero e um, no qual cada termo subsequente corresponde a soma dos dois números anteriores;

		long valorC = valorA + valorB;
		int contador = 1;
		int contadorE = contadorEnt;

		for (valorA = 0; contador < contadorE; contador++) {

			valorC = valorA + valorB;
			valorA = valorB;
			valorB = valorC;

		}

		System.out.println("O numero que você procura na " + contadorEnt + "ª é: " + valorC + ".\n");

	}

}