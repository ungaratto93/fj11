package cap4;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.fazAniversario();
		String dados = p.exibeDados();
		System.out.println(dados.equalsIgnoreCase("O Jose tem 19"));
	}
	
}
