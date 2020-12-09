package cone_2020;

public class Cone {
	
	private double raioCirculo;
	private double lateralCone;
	private int tipoDeTinta;
	
	public Cone(double raioCirculo, double lateralCone, int tipoDeTinta){
		setRaioCirculo(raioCirculo);
		setLateralCone(lateralCone);
		setTipoDeTinta(tipoDeTinta);
	}

	public int getTipoDeTinta() {
		return tipoDeTinta;
	}
	public void setTipoDeTinta(int tipoDeTinta) {
		this.tipoDeTinta = tipoDeTinta;
	}
	public double getRaioCirculo() {
		return raioCirculo;
	}
	public void setRaioCirculo(double raioCirculo) {
		this.raioCirculo = raioCirculo;
	}
	public double getLateralCone() {
		return lateralCone;
	}
	public void setLateralCone(double lateralCone) {
		this.lateralCone = lateralCone;
	}
	
	public double calcularGeratriz() {
		return Math.sqrt((raioCirculo*raioCirculo)+(lateralCone*lateralCone));
	}
	
	public double calcularAreaCone() {
		return 3.14 * getRaioCirculo() * calcularGeratriz();
	}
	
	public double calcularAreaCirculo() {
		return (3.14 * (getRaioCirculo() * getRaioCirculo()));
	}
	
	public double calcularAreaTotal() {
		return calcularAreaCirculo() + calcularAreaCone();
	}
	
	public double calcularLitrosDeTinta() {
		return calcularAreaTotal() * 3.45;
	}
	
	public double latas() {
		return Math.ceil(calcularLitrosDeTinta()/18);
	}
	
	public double preco() {
		double valor = 0;
		if(tipoDeTinta == 1) {
			valor = latas()*238.90;
		}
		else if (tipoDeTinta == 2) {
			return latas()*467.98;
		} else if (tipoDeTinta == 3) {
			return latas()*758.34;
		}
		return valor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n Cone [ \n raioCirculo = ");
		builder.append(raioCirculo);
		builder.append(", \n lateralCone = ");
		builder.append(lateralCone);
		builder.append(", \n tipoDeTinta = ");
		builder.append(tipoDeTinta);
		builder.append(", \n calcularGeratriz() = ");
		builder.append(calcularGeratriz());
		builder.append(", \n calcularAreaCone() = ");
		builder.append(calcularAreaCone());
		builder.append(", \n calcularAreaCirculo() = ");
		builder.append(calcularAreaCirculo());
		builder.append(", \n calcularAreaTotal() = ");
		builder.append(calcularAreaTotal());
		builder.append(", \n calcularLitrosDeTinta() = ");
		builder.append(calcularLitrosDeTinta());
		builder.append(", \n latas() = ");
		builder.append(latas());
		builder.append(", \n preco() = ");
		builder.append(preco());
		builder.append("\n ]");
		return builder.toString();
	}
}
