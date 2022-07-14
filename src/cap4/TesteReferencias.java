package cap4;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nomeTitular = "Danilo";
		c1.saldo = 100.00;
		
		Conta c2 = new Conta();
		c2.nomeTitular = "Danilo";
		c2.saldo = 100.00;
	
		if (c1 == c2) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
}
