package campeonatoBrasileiro;

import java.util.Date;

public class Jogo {
	
	private Date data;
	protected Serie serie;
	protected Estadio estadio;
	protected Time_Jogo mandante;
	protected Time_Jogo visitante;
	
public Jogo() {
		
		serie = new Serie();
		estadio = new Estadio();
		mandante = new Time_Jogo();
		visitante = new Time_Jogo();
		
	}
	
	public String VerificaJogo () {
		
		if (mandante.getGol() == visitante.getGol()) {
			return "Empate" ;
		} else if (mandante.getGol() > visitante.getGol()) {
			return mandante.getNome() + "ganhou";
			
		} else if (mandante.getGol() < visitante.getGol()) {
			return visitante.getNome() + "ganhou";
		}
		
		return "";
		
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jogo [data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
	

}
