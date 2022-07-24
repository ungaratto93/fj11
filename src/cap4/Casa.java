package cap4;

public class Casa {

	private String cor;
	public Porta porta1;
	public Porta porta2;
	public Porta porta3;

	public void pintar(String cor) {
		this.setCor(cor);
	}

	private void setCor(String cor) {
		this.cor = cor;
	}

	public String consultarCor() {
		return this.getCor();
	}
	
	private String getCor() {
		return this.cor;
	}

	public String quantasPortasEstaoAbertas() {
		int aberta1 = porta1.estaAberta() ? 1 : 0;
		int aberta2 = porta2.estaAberta() ? 1 : 0;
		int aberta3 = porta2.estaAberta() ? 1 : 0;
		Integer quantas = aberta1 + aberta2 + aberta3;
		return quantas.toString();
	}
}
