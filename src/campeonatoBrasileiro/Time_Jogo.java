package campeonatoBrasileiro;

public class Time_Jogo extends Time {
	
	private int gol;

	public int getGol() {
		return gol;
	}

	public void setGol(int gol) {
		this.gol = gol;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Time_Jogo [gol=");
		builder.append(gol);
		builder.append("]");
		return builder.toString();
	}

	
}
