package lista01_2020;

public class CalculaPesoIdeal {
	
	private String sexo;
	private double altura;
	private double peso;
	
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		if(sexo.equals("m") || sexo.equals("M") || sexo.equals("f") || sexo.equals("F") ) {
			this.sexo = sexo;
		} else {
			System.out.println("Digite apenas 'm' ou 'f' na proxima vez");
		}
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double calculaPesoIdeal() {
		if(sexo == "m" || sexo == "M") {
			return (72.7 * altura) - 58;
		} else {
			return (62.1 * altura) - 44.7;
		}
	}

}
