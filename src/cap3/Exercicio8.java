package cap3;

public class Exercicio8 {

	public static void main(String[] args) {
		int number = 4;

		for (int x = 1; x <= number; x++) {
			if (x == 1) {
				System.out.println(x);
			}
			if ((x * 2) / 2 == 2 ) {
				System.out.println(x + " " + x * 2 + " ");
			} 
			for (int y = x; y < x + 1; ++y) {
				if (y == number) {
					System.out.println(x + " " + x * 2 + " " + y * 3 + " " + x * x);
				} else {
					if ((x * 2) / 2 == 2 || (y * 3) / 3 == 3) {
						if ((y * 3) / 3 == 3) {
							System.out.println(x + " " + x * 2 + " " + y * 3);
						}
					}
				}
			}
		}
	}
}
