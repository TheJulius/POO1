package lista03_2020_exc_3;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new Conta("Santander", 1, 123, 1500.00);
		
		ContaEspecial ce = new ContaEspecial("Itau", 2, 124, 15000.00, 5, 2300.00);
		
		ContaSimples cs = new ContaSimples("Caixa", 3, 125, 1600.00, 2000.00);
		
		System.out.println(c);
		System.out.println();
		System.out.println(ce);
		System.out.println();
		System.out.println(cs);
	}

}
