package heranca;

public class PessoaMain {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Julio", "Rua 2");
		
		System.out.println(p);
		
		
		
		Pessoa p1 = new Pessoa ("Julio Cesar de Sousa", "Rua 3");

		System.out.println(p1);
		
		
		
		PessoaFisica pf = new PessoaFisica(null, null);
		
		pf.setNome("Julio Cesar");
		pf.setEndereco("Rua 2");
		pf.setCPF("12345678910");
		pf.setEstadoCivil("game over");
		
		System.out.println(pf);
	}

}
