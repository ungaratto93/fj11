package banco;

public class TestaConta {
	public static void main(String[] args) {

		Conta c = new Conta();
		c.deposita(100);
		c.saca(25);
		System.out.println(c.getSaldo());
		
	}
}
