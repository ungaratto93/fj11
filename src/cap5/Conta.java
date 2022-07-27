package cap5;

import cap4.Data;

public class Conta {
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data dataAbertura = new Data();

	public Conta(String titular) {
		this.titular = titular;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getDataAbertura() {
		return this.dataAbertura.formatada();
	}
	
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

	public double getRendimento() {
		return this.getSaldo() * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "\nTitular: " + this.titular;
		dados += "\nNumero: " + this.numero +
				"\nAgencia: " + this.agencia + 
				"\nSaldo: " + this.saldo + 
				"\nData Abertura: " + this.dataAbertura.formatada();
		return dados;
	};
}
