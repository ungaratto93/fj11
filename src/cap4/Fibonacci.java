package cap4;

public class Fibonacci {
	int n1 = 1;
	int n2 = -1;

	public int calculaFibonnaci(int i) {
		if (i % 2 == 0) {
			n1 = n1 + n2;
		} else {
			n2 = n1 + n2;
		}
		return n1 + n2;
	}
}