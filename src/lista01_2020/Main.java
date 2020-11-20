package lista01_2020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
// Exc 1		
//		CalculaSalario s = new CalculaSalario();
//		
//		System.out.println("Informe seu salario, jovi");
//		s.setSalario(in.nextDouble());
//		
//		System.out.println("Salario antes do ajuste: " + s.getSalario());
//		System.out.println("Salario Atual: " + s.aumentoSalario());
//		System.out.println("O valor do seu aumento foi de: " + s.valorAumento());
//		
//		if(s.getSalario() <= 280) {
//			System.out.println("Voce teve um aumento de 20% (Troque de profissao, urgentemente)");
//		} else if (s.getSalario() > 280 && s.getSalario() <= 700) {
//			System.out.println("Voce teve um aumento de 15% (Troque de profissao, urgentemente)");
//		} else if (s.getSalario() > 700 && s.getSalario() <= 1500) {
//			System.out.println("Voce teve um aumento de 10% (Troque de profissao, urgentemente)");
//		} else {
//			System.out.println("Voce teve um aumento de 5% (Ainda nao ta bom, mas ta sobrevivendo)");
//		}
		
//Exc 2
//		CalculaPesoIdeal c = new CalculaPesoIdeal();
//		
//		System.out.println("Informe o seu sexo com 'm' para masculino e 'f' para feminino");
//		c.setSexo(in.nextLine());
//		System.out.println("Digite a sua Altura");
//		c.setAltura(in.nextDouble());
//		System.out.println("Digite o seu Peso");
//		c.setPeso(in.nextDouble());
//		
//		System.out.println("Altura: " + c.getAltura());
//		System.out.println("Peso Atual: " + c.getPeso());
//		System.out.println("Peso Ideal: " + c.calculaPesoIdeal());
//		
//		if(c.getSexo().equals("m") || c.getSexo().equals("M") ) {
//			System.out.println("Sexo: Masculino");
//		} else if (c.getSexo() == "f" || c.getSexo() == "F"){
//			System.out.println("Sexo: Feminino");
//		} else {
//			System.out.println("Sexo:" + c.getSexo());
//		}
//		
//		if(c.getPeso() > c.calculaPesoIdeal()) {
//			System.out.println("Voce esta acima de seu peso ideal !");
//		}else if(c.getPeso() < c.calculaPesoIdeal()) {
//			System.out.println("Voce esta abaixo de seu peso ideal");
//		} else {
//			System.out.println("Voce esta exatamente com seu peso ideal");
//		}

//Exc 3
		CalculaNotas cn = new CalculaNotas();
		
		System.out.print("Informe o valor a ser sacado entre R$10.00 e R$ 600.00 : ");
		cn.setValorASerSacado(in.nextInt());
		
		if(cn.getValorASerSacado() < 10 || cn.getValorASerSacado() > 600) {
			System.out.println("Valor Invalido. Informe um valor entre R$10.00 e R$600.00");
		} else {
			System.out.println(cn.calculaNotas());
		}
		
		in.close();
	}
	
}
