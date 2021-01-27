package lista03_2020_exc_2;

public class Main {

	public static void main(String[] args) {
		
		Item i = new Item(1, "descricao 1");
		
		Livro l = new Livro(2, "descricao 2", "Julio");
		
		Midia m = new Midia(3, "descricao 3", "Andrey Productions", 120);
		
		Cd c = new Cd(4, "descricao 4", "Nicole Productions", 65, 10, "Gustavo", "album 1");
		
		Vhs v = new Vhs(5, "descricao 5", "Patricia Productions", 145, "Testando Construtor");
		
		System.out.println(i);
		System.out.println();
		System.out.println(l);
		System.out.println();
		System.out.println(m);
		System.out.println();
		System.out.println(c);
		System.out.println();
		System.out.println(v);

	}

}
