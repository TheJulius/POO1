package Excs;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String usuario;
		String senha;
		do {
		
		System.out.println("O usu�rio tem que ser diferente da senha\n");
			
		System.out.println("Informe seu usu�rio\n");
		usuario = entrada.nextLine();
		
		System.out.println("Informe sua senha");
		senha = entrada.nextLine();
		} while (usuario == senha);
		

	}

}
