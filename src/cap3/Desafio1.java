package cap3;


public class Desafio1 {
	public static void main(String[] args) {
		for (int indexador = 1; indexador <= 40; indexador++ ) {
			calculaFatorial(indexador);
		}
	}
	
	private static void calculaFatorial(int fator) {
		long aux = fator;
		for (int index = fator; index > 1; index--) {
			aux = (aux * ( index - 1));
		}
		exibeResultado(fator, aux);
	}

	private static void exibeResultado(int fator, long resultado) {
		System.out.println("O fatorial de " + fator + " é " + resultado);
	}
}
