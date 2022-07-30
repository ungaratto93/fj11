package cap4;

public class TestaRendimento {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.saldo = 100.00;
		
		double rendimento = c1.calculaRendimento();
		if (rendimento == 10.00) {
			System.out.println("rendeu");
		}
		
	}
}
