package polimorfismoSalario;

public class Analista extends FolhaDePagamento {
	
	private double adiciona = 1.05;

	public double getAdiciona() {
		return adiciona;
	}

	public void setAdiciona(double adiciona) {
		this.adiciona = adiciona;
	}

	public double salarioAnalista() {
		
		return calculoSalario()*adiciona;
	}
	

}
