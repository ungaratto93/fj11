package cap4;

public class TesteRecuperaDadosImpressao {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.nomeTitular = "Eduardo";
		c1.numero = 1;
		c1.agencia = "0001";
		c1.saldo = 100;
		c1.dataAbertura = "20/01/2002";
		System.out.println(c1.recuperaDadosParaImpressao());
	}
}
