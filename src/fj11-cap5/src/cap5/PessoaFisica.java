package cap5;

public class PessoaFisica {

	private String cpf;
	
	public PessoaFisica(String cpf) throws CpfInvalidoException {
		if(PessoaFisica.validaCpf(cpf)) {
			this.setCpf(cpf);
		} else {
			throw new CpfInvalidoException();
		}
	}
	
	private static boolean validaCpf(String cpf) {
		return false;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
