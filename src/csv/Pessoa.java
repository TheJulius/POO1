package csv;

public class Pessoa {
	
	private int codigo;
	private String nome;
	private String email;
	private double telefone;
	private String DataNascimento;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getTelefone() {
		return telefone;
	}
	public void setTelefone(double telefone) {
		this.telefone = telefone;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String string) {
		DataNascimento = string;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", email=");
		builder.append(email);
		builder.append(", telefone=");
		builder.append(telefone);
		builder.append(", DataNascimento=");
		builder.append(DataNascimento);
		builder.append("]");
		return builder.toString();
	}
	
}
