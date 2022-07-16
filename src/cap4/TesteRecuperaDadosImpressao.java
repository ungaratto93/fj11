package cap4;

public class TesteRecuperaDadosImpressao {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.titular = "Eduardo";
		c1.numero = 1;
		c1.agencia = "0001";
		c1.saldo = 100;
		c1.dataAbertura = new Data();
		System.out.println(c1.recuperaDadosParaImpressao());
	}
}
