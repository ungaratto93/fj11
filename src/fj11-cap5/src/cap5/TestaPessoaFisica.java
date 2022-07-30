package cap5;

public class TestaPessoaFisica {

	public static void main(String[] args) {
		
		PessoaFisica p;
		try {
			p = new PessoaFisica("1");
			System.out.println(p);
		} catch (CpfInvalidoException e) {
			e.printStackTrace();
		}
		
	}
	
}
