package poo;

public class Quadrado {
	
	private int lado; //variavel global
	
	
	
	public void setLado(int lado) {
		
		if (lado > 0) 	
			
			this.lado = lado; //a variavel global (this.lado) recebe essa daqui ( = lado )
	}
	

	public int getLado() {
		
		return lado;
	}
	
	public float area() {
		
		return lado * lado;
	}
}
