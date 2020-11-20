package lista03;

public class OperacoesBasicas {
	
	private float a;
	private float b;
	
	
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}

	public float adicao() {
		return a + b;
	}
	
	public float subtracao() {
		return a - b;
	}
	
	public float multiplicacao() {
		return a * b;
	}
	
	public float divisao() {
		return a / b;
	}
}
