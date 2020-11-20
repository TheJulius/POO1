package votacao;

import java.util.ArrayList;
import java.util.List;


public class Votacao {
	protected List<Candidato> candidatos;
	protected List<Usuario> votantes;
	protected Usuario admin;
	protected List<Usuario> podeVotar;
	
	public Votacao() {
		candidatos = new ArrayList<Candidato>();
		votantes = new ArrayList<Usuario>();
		podeVotar = new ArrayList<Usuario>();
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public List<Usuario> getVotantes() {
		return votantes;
	}

	public void setVotantes(List<Usuario> votantes) {
		this.votantes = votantes;
	}

	public Usuario getAdmin() {
		return admin;
	}

	public void setAdmin(Usuario admin) {
		this.admin = admin;
	}

	public List<Usuario> getPodeVotar() {
		return podeVotar;
	}

	public void setPodeVotar(List<Usuario> podeVotar) {
		this.podeVotar = podeVotar;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Votacao [candidatos=");
		builder.append(candidatos);
		builder.append(", votantes=");
		builder.append(votantes);
		builder.append(", admin=");
		builder.append(admin);
		builder.append(", podeVotar=");
		builder.append(podeVotar);
		builder.append("]");
		return builder.toString();
	}
	
	
}
