package lista03;

import java.util.Scanner;

public class OperacoesBasicasMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		OperacoesBasicas op = new OperacoesBasicas();
		
		System.out.println("Informe um numero, que não seja zero");
		op.setA(in.nextFloat());
		
		if (op.getA() == 0) {
			
			System.out.println("Informe um numero, que não seja zero");
			op.setA(in.nextFloat());
			
		}
		
		System.out.println("Informe um outro numero, que não seja zero");
		op.setB(in.nextFloat());
		
		if (op.getB() == 0) {
			
			System.out.println("Informe um outro numero, que não seja zero");
			op.setB(in.nextFloat());
			
		}
		
		System.out.println("Adicao: " + op.adicao());
		System.out.println("Subtracao: " + op.subtracao());
		System.out.println("Multiplicacao: " + op.multiplicacao());
		System.out.println("Divisao: " + op.divisao());
		
		in.close();
		

	}

}
