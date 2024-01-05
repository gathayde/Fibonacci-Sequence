package fibonacci;

public class CalculoPosicaoFibonnaci {

	public static void main(String[] args) {

		long valorA = 0;
		long valorB = 1;

//		A sucessão de Fibonacci é uma sequência de números inteiros iniciados por zero e um, no qual cada termo subsequente corresponde a soma dos dois números anteriores;

		long valorC = valorA + valorB;
		int contador = 1;
		int contadorE = 7;
		
		

		for (valorA = 0; contador < contadorE; valorC = valorA + valorB) {

			valorA = valorB;
			valorB = valorC;
			contador++;
			
//			System.out.println(valorC);
//			System.out.println(contador);

		}
			System.out.println("O numero que você procura é: " + valorC);
//			System.out.println(valorC);
//			System.out.println(contador);
	

	}

}
