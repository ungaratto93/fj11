package cap3;


public class Exercicio5 {
	public static void main(String[] args) {
		for (int indexador = 1; indexador <= 40; indexador++ ) {
			calculaFatorial(indexador);
		}
	}
	
	private static void calculaFatorial(int fator) {
		int fatorial = fator;
		long aux = 1;
		aux = fatorial;
		for (int index = fatorial; index > 1; index--) {
			aux = (aux * ( index - 1));
		}
		System.out.println("O fatorial de " + fatorial + " é " + aux);
	}
}
