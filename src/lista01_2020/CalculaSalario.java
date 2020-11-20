package lista01_2020;

public class CalculaSalario {
	
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumentoSalario() {
		if (salario <= 280) {
			return salario * 1.20;
		} else if (salario > 280 && salario <= 700 ) {
			return salario * 1.15;
		} else if (salario > 700 && salario <= 1500) {
			return salario *1.10;
		} else {
			return salario *1.05;
		}
	}
	
	public double valorAumento() {
		if (salario <= 280) {
			return salario * 0.20;
		} else if (salario > 280 && salario <= 700 ) {
			return salario * 0.15;
		} else if (salario > 700 && salario <= 1500) {
			return salario *0.10;
		} else {
			return salario *0.05;
		}
	}

}
