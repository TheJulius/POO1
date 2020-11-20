package campeonatoBrasileiro;

import java.util.List;

public class Time {
	
	private int nome;
	protected Tecnico tecnico;
	protected List<Jogador> jogadores;

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Time [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	

}
