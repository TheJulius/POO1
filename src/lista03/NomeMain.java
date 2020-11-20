package lista03;

import java.util.Scanner;

public class NomeMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Nome n = new Nome ();
		
		System.out.println("Informe o seu nome, por favor, jovem: ");
		n.setNome(in.next());
		
		System.out.println("Informe seu sobrenome, jovem: ");
		n.setSobrenome(in.next());
		
		System.out.println("Seu nome é: " + n.getNome() + " " + n.getSobrenome());
		
		in.close();
		

	}

}
