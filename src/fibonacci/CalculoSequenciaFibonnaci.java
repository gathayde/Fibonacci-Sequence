package fibonacci;

public class CalculoSequenciaFibonnaci {

	public static void main(String[] args) {

		long valorA = 0;
		long valorB = 1;

//		A sucessão de Fibonacci é uma sequência de números inteiros iniciados por zero e um, no qual cada termo subsequente corresponde a soma dos dois números anteriores;

		long valorC = valorA + valorB;
		int contador = 1;
		long valorE = 22;

		for (valorA = 0; valorC < valorE; contador++) {

			valorC = valorA + valorB;
			valorA = valorB;
			valorB = valorC;
			
//			System.out.println("VLC " + valorC);
//			System.out.println("Cont." + contador);

		}
		
		if (valorC == valorE) {
			System.out.println("Esse numero FAZ parte da sequência Fibonacci.");
			System.out.println("E ocupa a posição: " + contador);
//			System.out.println("VLC " + valorC);
//			System.out.println("VLA " + valorA);
//			System.out.println("VLB " + valorB);
//			System.out.println("Cont." + contador);
			
		} else {
			System.out.println("Esse numero NÃO FAZ parte da sequência Fibonacci.");
//			System.out.println("VLC " + valorC);
//			System.out.println("VLA " + valorA);
//			System.out.println("VLB " + valorB);
//			System.out.println("Cont." + contador);
		}

	}

}