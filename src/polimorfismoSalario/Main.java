package polimorfismoSalario;

public class Main {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("unused")
		FolhaDePagamento fp = new FolhaDePagamento();
		Estagiario e = new Estagiario();
		Desenvolvedor d = new Desenvolvedor();
		Analista a = new Analista();
		GerenteDeProjeto gp = new GerenteDeProjeto();
		
		e.setSalario(1000);
		e.setDesconto(100);
		d.setSalario(1000);
		d.setDesconto(100);
		a.setSalario(1000);
		a.setDesconto(100);
		gp.setSalario(1000);
		gp.setDesconto(100);
		
		
		System.out.println("Estagiario: " + e.salarioEstagiario());
		System.out.println("Desenvolvedor: " + d.salarioDesenvolvedor());
		System.out.println("Analista: " + a.salarioAnalista());
		System.out.println("Gerente de Projeto: " + gp.salarioGerenteDeProjeto());
		
		

	}

}
