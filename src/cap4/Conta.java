package cap4;

public class Conta {
	String nomeTitular;
	int numero;
	String agencia;
	double saldo;
	Data dataAbertura = new Data();

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
		String dados = "\nTitular: " + this.nomeTitular;
		
		dados += "\nNumero: " + this.numero +
				"\nAgencia: " + this.agencia + 
				"\nSaldo: " + this.saldo + 
				"\nData Abertura: " + 
				"\n\tDia: " + this.dataAbertura.dia +
				"\n\tMes: " + this.dataAbertura.mes + 
				"\n\tAno: " + this.dataAbertura.ano;
		return dados;
	};
}
