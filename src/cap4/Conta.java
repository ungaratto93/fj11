package cap4;

public class Conta {
	String nomeTitular;
	int numero;
	String agencia;
	double saldo;
	String dataAbertura;

	public void sacar(double quantidade) {
		if (this.saldo > quantidade) {
			this.saldo = this.saldo - quantidade;
		} else {
			throw new IllegalArgumentException("Saldo insuficiente para completar a operacao");
		}
	};

	public void depositar(double quantidade) {
		this.saldo = this.saldo + quantidade;
	};

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		return "Titular:" + this.nomeTitular +
				" Numero: " + this.numero +
				" Agencia: " + this.agencia + 
				" Saldo: " + this.saldo + 
				" Data Abertura: " + this.dataAbertura;
	};
}
