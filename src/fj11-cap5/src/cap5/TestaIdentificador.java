package cap5;

public class TestaIdentificador {

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Eduardo");
		System.out.println(c1.getIdentificador());
		System.out.println(c1.getDataAbertura());

		
		Conta c2 = new Conta("Camila");
		System.out.println(c2.getIdentificador());
		System.out.println(c2.getDataAbertura());

		Conta c3 = new Conta();
		System.out.println(c3.getIdentificador());
		System.out.println(c3.getDataAbertura());
	
		Conta c4 = new Conta();
		System.out.println(c4.getIdentificador());
		System.out.println(c4.getDataAbertura());

		
	}
	
}
