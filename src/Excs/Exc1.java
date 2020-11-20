package Excs;

import java.util.Scanner;

public class Exc1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		do {
		
		System.out.println("Insira um nota entre 0 a 10");
		nota = entrada.nextInt();
		
		} while (nota <2 && nota>10);
		}
	


	}


