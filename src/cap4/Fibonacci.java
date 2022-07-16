package cap4;

public class Fibonacci {
	private int n1 = 0;
	private int n2 = 1;

	private int sum1() {
		n1 = n1 + n2;
		return n1;
	}
	
	private int sum2() {
		n2 = n1 + n2;
		return n2;
	}
	
	public int calculaFibonnaci(int i) {
		return (i % 2 == 0 )  ? sum1() : sum2();
	}
}