package cap3;


public class Desafio1 {
	public static void main(String[] args) {
		int index = 0;
		while(index <= 100) {
			System.out.println(Math.abs(sequence(index)));
			index++;
		}
	}

	private static final long sequence(int n) {
		int n1 = 0;
		int n2 = 1;

		long seq = 0;
		while (seq < n - 1) {
			if (seq % 2 == 0) {
				n1 = n1 + n2;
			} else {
				n2 = n1 + n2;
			}
			seq++;
		}

		return n1 + n2;
	}
}
