package repeticao;
import java.util.Scanner;



public class For {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas vezes voce quer mostrar a mensagem Ola Mundo?");
		int total = entrada.nextInt();
		
		for (int i =0; i < total; i++) {
			System.out.println("Ola Mundo");
		}
		
		//FOR MOSTRANDO A CONTAGEM DE VARIAVEL ''i'' forma crescente
		System.out.println("\n Ordem Crescente");
		for (int i = 0; i< total; i++) {
			System.out.println(i);
		}

	}

}
