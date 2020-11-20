package repeticao;
import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int soma = 0;
		float media = 0;
		
		final int TAM = 5;
		
		int vetor [] = new int [TAM];
		
		for (int x = 0; x< TAM; x++) {
			System.out.println("--> ");
			vetor [x] = entrada.nextInt();
			soma = soma + vetor[x];
		}
		
		for (int x = 0; x < TAM; x++) {
			System.out.println(x + "-->" + vetor [x]);
		}
		
		media = soma / (float)TAM;
		
		System.out.println("Soma:" +soma);
		System.out.println("Media:"+ media);
		
		

	}

}
