package cap4;

public class Pessoa {

	private String nome = "Jose";
	private int idade = 18;
	
	public void fazAniversario() {
		this.idade++;
	}
	
	public String exibeDados() {
		return "O " + this.nome + " tem " + this.idade;
	}
	
}
