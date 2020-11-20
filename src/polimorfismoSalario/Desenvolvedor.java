package polimorfismoSalario;

public class Desenvolvedor extends FolhaDePagamento {
	
	private double adiciona = 1.1;

	public double getAdiciona() {
		return adiciona;
	}

	public void setAdiciona(double adiciona) {
		this.adiciona = adiciona;
	}

	public double salarioDesenvolvedor() {
		
		return calculoSalario()*adiciona;
	}
	

}
