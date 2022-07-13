package cap4;

public class TesteDeposita {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 100.00;
		c1.depositar(50);
		if(c1.saldo == 150.00) {
			System.out.println("deposito efetuado");
		}
	}
}
