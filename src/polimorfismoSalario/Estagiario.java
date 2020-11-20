package polimorfismoSalario;

public class Estagiario extends FolhaDePagamento{
	
	private double adiciona = 1.2;

	public double getAdiciona() {
		return adiciona;
	}

	public void setAdiciona(double adiciona) {
		this.adiciona = adiciona;
	}

	public double salarioEstagiario() {
		
		return calculoSalario()*adiciona;
	}
	
}
