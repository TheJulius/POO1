package Excs;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = null;
		String sexo;
		String estadoCivil;
		int idade;
		double salario;
		
		do {
			System.out.println("Digite seu nome");
			nome = entrada.nextLine();
		}while (nome.length()<= 3);
		
		do {
			System.out.println("Digite sua idade");
			idade = entrada.nextInt();
		}while (!(idade <0 && idade >150));
		
		do {
			System.out.println("informe seu salario");
			salario = entrada.nextDouble();
		} while (salario == 0);
		
		do {
			System.out.println("Digite seu sexo M para Masculino e F para Feminino");
			sexo = entrada.nextLine();
		} while(sexo.contentEquals("m") || sexo.contentEquals("f"));
			
	do {
		System.out.println("Digite seu estado civil: S para solteiro e C para casado");
		estadoCivil = entrada.nextLine();
	} while(sexo.contentEquals("s") || sexo.contentEquals("c"));
	
	}
}

