package lista02_2020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		Vetor v = new Vetor();
		
		int verificaValor;
		
		do {
			
			System.out.println("Qual o tamanho do array gostaria? (Informe um valor maior que 0)");
		    verificaValor = in.nextInt();
			
		} while(verificaValor <= 0);
		
		if(verificaValor > 0) {
			v.setArraySize(verificaValor);
		}
	
		System.out.println("Array Gerado: ");
		
		for (int i = 0; i < v.getArrayRandom().length; i++) {
	
			System.out.println(v.getArrayRandom()[i]);
			
		}
		
		System.out.println("");
		System.out.println("Soma: " + v.retornaSoma());
		
		System.out.println("");
		System.out.println("Media: " + v.retornaMedia());
		
		System.out.println("");
		System.out.println("Moda: " +v.retornaModa());
		
		System.out.println("");
		System.out.println("Mediana: " +v.retornaMediana());
		
		System.out.println("");
		System.out.println("Variancia: " +v.retornaVariancia());

		System.out.println("");
		System.out.println("Desvio Padrao: " +v.retornaDesvioPadrao());
		
		System.out.println("");
		System.out.println("Maior Numero: " +v.retornaMaiorNumero());
		
		System.out.println("");
		System.out.println("Menor Numero: " +v.retornaMenorNumero());
	
		System.out.println("");
		System.out.println("Numeros Pares: ");
		
		for (int i = 0; i < v.getArrayRandom().length; i++) {
	
			System.out.println(v.retornaNumerosPares()[i]);
			
		}
		
		System.out.println("");
		System.out.println("Numeros Impares: ");
		
		for (int i = 0; i < v.getArrayRandom().length; i++) {
	
			System.out.println(v.retornaNumerosImpares()[i]);
			
		}
		
		System.out.println("");
		System.out.println("Numeros Primos: ");
		
		for (int i = 0; i < v.getArrayRandom().length; i++) {
	
			System.out.println(v.retornaNumerosPrimos()[i]);
			
		}
		
		in.close();

	}

}
