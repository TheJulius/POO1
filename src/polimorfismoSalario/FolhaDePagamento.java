package polimorfismoSalario;

public class FolhaDePagamento {
	
	private double salario;
	private double desconto;
	
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculoSalario() {
		
		return salario - desconto;
	}

}
