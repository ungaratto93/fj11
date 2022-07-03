package cap3;


public class Exercicio4 {
	public static void main(String[] args) {
		for (int indexador = 1; indexador <= 10; indexador++ ) {
			calculaFatorial(indexador);
		}
	}
	
	private static void calculaFatorial(int fator) {
		int fatorial = fator;
		int aux = 1;
		aux = fatorial;
		for (int index = fatorial; index > 1; index--) {
			aux = (aux * ( index - 1));
		}
		System.out.println("O fatorial de " + fatorial + " é " + aux);
	}
}
