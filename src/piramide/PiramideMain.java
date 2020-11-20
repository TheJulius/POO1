package piramide;

import java.util.Scanner;

public class PiramideMain {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Piramide p = new Piramide();
		
		System.out.println("Informe o AB");
		p.setAb(in.nextDouble());
		
		System.out.println("Informe o H");
		p.setH(in.nextDouble());
		
		System.out.println("Informe o tipo de tinta (1 - Tipo 1) (2 - Tipo 2) (3 - Tipo 3)");
		p.setTipoDeTinta(in.nextInt());
		
		System.out.println("Ab: " + p.getAb());
		System.out.println("h: " + p.getH());
		System.out.println("a1: " + p.a1());
		System.out.println("Area Triangulo: " + p.areaTriangulo());
		System.out.println("Area Quadrado: " + p.areaQuadrado());
		System.out.println("Area Total: " + p.areaTotal());
		System.out.println("Tipo de Tinta: " + p.getTipoDeTinta());
		System.out.println("Litros: " + p.litrosDeTinta());
		System.out.println("Latas: " + p.latas());
		System.out.println("Preço: " + p.preco());
		System.out.println("Volume: " + p.volume());
		
		in.close();
	}

}
