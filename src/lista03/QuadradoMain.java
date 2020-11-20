package lista03;

import java.util.Scanner;

public class QuadradoMain {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		Quadrado q = new Quadrado();
		
		System.out.println("Informe o lado do quadrado: ");
		q.setLado(in.nextFloat());
		
		System.out.println("Area do Quadrado: " + q.getLado());
		
		in.close();
	}

}
