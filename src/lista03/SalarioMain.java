package lista03;

import java.util.Scanner;

public class SalarioMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Salario s = new Salario();
		
		System.out.println("Quantas horas voce trabalha em um m�s?");
		s.setQtthoras(in.nextFloat());
		
		System.out.println("Quanto voce ganha por hora?");
		s.setVlrhoras(in.nextFloat());
		
		System.out.println(" + Sal�rio Bruto: R$" + s.salarioBruto());
		System.out.println(" - IR: R$" + s.IR());
		System.out.println(" - INSS: R$" + s.INSS());
		System.out.println(" - Sindicato: R$" + s.Sindicato());
		System.out.println(" = Sal�rio Liquido: R$" + s.salarioLiquido());
		
		in.close();
		

	}

}
