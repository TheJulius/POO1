package votacao;

public class Candidato {

	protected Usuario usuario;
	
	public Candidato() {
		usuario = new Usuario();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Candidato [usuario=");
		builder.append(usuario);
		builder.append("]");
		return builder.toString();
	}
	
}
