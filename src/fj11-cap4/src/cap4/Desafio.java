package cap4;

public class Desafio {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 1; i <= 6; i++) {
			int resultado = fibonacci.calculaFibonnaci(i);
			System.out.println(resultado);
		}
	}
}
