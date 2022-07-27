package cap5;

public class TesteSacaSucesso {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.depositar(100.00);
		c1.sacar(50);
		
		if (c1.getSaldo() == 50.00) {
			System.out.println("saque efetuado");
		} else {
			System.out.println(c1.getSaldo());
		}
		
	}
}

