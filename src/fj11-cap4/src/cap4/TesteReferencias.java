package cap4;

public class TesteReferencias {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Danilo";
		c1.saldo = 100.00;
		
		Conta c2 = new Conta();
		c2.titular = "Danilo";
		c2.saldo = 100.00;
	
		Conta c3 = new Conta();
		c3.titular = "Danilo";
		c3.saldo = 100.00;
		
		Conta c4 = c3;
		
		if (c4 == c3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}
	}
}
