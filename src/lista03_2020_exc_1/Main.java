package lista03_2020_exc_1;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Julio", "Rio do Sul");
		
		PessoaFisica pf = new PessoaFisica("Andrey", "Fundo Canoas", "001.001.001-1", "namorando");
		PessoaJuridica pj = new PessoaJuridica("Teixeirinha Pedra e Papel", "Taboao", "002.002.002-01/0001", "MEI");
		
		System.out.println(p);
		System.out.println();
		System.out.println(pf);
		System.out.println();
		System.out.println(pj);

	}

}
