package cap5;

public class TestaIdentificador {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Eduardo");
		System.out.println(c1.getIdentificador());
	
		Conta c2 = new Conta("Camila");
		System.out.println(c2.getIdentificador());
		
		Conta c3 = new Conta();
		System.out.println(c3.getIdentificador());
	
		Conta c4 = new Conta();
		System.out.println(c4.getIdentificador());
		
	}
	
}
