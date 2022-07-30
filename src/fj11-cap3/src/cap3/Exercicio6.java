package cap3;

public class Exercicio6 {
	public static void main(String[] args) {
		int index = 0;
		while(index <= 100) {
			System.out.println(Math.abs(sequence(index)));
			index++;
		}
	}

	private static final long sequence(int n) {
		long seq = 0;
		int sum = 0;
		int n1 = 0;
		int n2 = 1;

		while (seq < n - 1) {

			sum = n1 + n2;
			if (seq % 2 == 0) {
				n1 = sum;
			} else {
				n2 = sum;
			}

			seq++;
		}

		return sum;
	}
}
