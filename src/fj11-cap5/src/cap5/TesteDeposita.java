package cap5;

public class TesteDeposita {

	public static void main(String[] args) {
		Conta c = new Conta();
		c.depositar(150);
		if(c.getSaldo() == 150.00) {
			System.out.println("deposito efetuado");
		}
		
	}
	
}
