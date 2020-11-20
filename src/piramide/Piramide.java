package piramide;

public class Piramide {
	
	private double ab;
	private double h;
	private int tipoDeTinta;

	
	public double getAb() {
		return ab;
	}
	public void setAb(double ab) {
		this.ab = ab;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public int getTipoDeTinta() {
		return tipoDeTinta;
	}
	public void setTipoDeTinta(int tipoDeTinta) {
		this.tipoDeTinta = tipoDeTinta;
	}
	
	public double a1(){
		return Math.sqrt((h*h)+(ab*ab));
	}
	
	public double areaTriangulo() {
		return ((ab+ab)*a1())/2;
	}
	
	public double areaQuadrado() {
		return (ab+ab) * (ab+ab);	
	}
	
	public double areaTotal() {
		return (areaTriangulo()*4) + areaQuadrado();
	}
	
	public double volume() {
		return (areaQuadrado()/3)*h;
	}
	
	public double litrosDeTinta() {
		
		return areaTotal()/4.76;		
	}
	
	public double latas() {
		return Math.ceil(litrosDeTinta()/18);
	}
	
	public double preco() {
		double valor = 0;
		if(tipoDeTinta == 1) {
			valor = latas()*127.90;
		}
		else if (tipoDeTinta == 2) {
			return latas()*258.98;
		} else if (tipoDeTinta == 3) {
			return latas()*344.34;
		}
		return valor;
	}
}
