package heranca;

public class PessoaFisica extends Pessoa {
	
	public PessoaFisica(String nome, String endereco) {
		super(nome, endereco);
	}

	private String CPF;
	private String estadoCivil;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String CPF) {
		if (CPF.length() > 9)
		this.CPF = CPF;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		if (estadoCivil.length() > 1)
		this.estadoCivil = estadoCivil;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaFisica [CPF=");
		builder.append(CPF);
		builder.append(", estadoCivil=");
		builder.append(estadoCivil);
		builder.append("]");
		builder.append(super.toString());
		return builder.toString();
	}

}
