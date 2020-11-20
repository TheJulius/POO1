package polimorfismoSalario;

public class GerenteDeProjeto extends FolhaDePagamento {
	
	private double adiciona = 1.01;

	public double getAdiciona() {
		return adiciona;
	}

	public void setAdiciona(double adiciona) {
		this.adiciona = adiciona;
	}

	public double salarioGerenteDeProjeto() {
		
		return calculoSalario()*adiciona;
	}
	

}
