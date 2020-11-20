package lista03;

public class Salario {
	
	public float qtthoras;
	public float vlrhoras;
	
	public float getQtthoras() {
		return qtthoras;
	}
	public void setQtthoras(float qtthoras) {
		this.qtthoras = qtthoras;
	}
	public float getVlrhoras() {
		return vlrhoras;
	}
	public void setVlrhoras(float vlrhoras) {
		this.vlrhoras = vlrhoras;
	}

	public float salarioBruto() {
		return qtthoras * vlrhoras;
	}
	
	public float INSS() {
		return (float) (salarioBruto() *0.08);
	}
	
	public float IR() {
		return (float) (salarioBruto() *0.11);
	}
	
	public float Sindicato() {
		return (float) (salarioBruto() *0.05);
	}
	
	public float salarioLiquido() {
		return (float) (salarioBruto() - INSS() - IR() - Sindicato());
	}
	
	
}
