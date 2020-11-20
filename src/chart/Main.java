package chart;

	import java.io.IOException;
	import java.util.Scanner;
	
	public class Main {
		private static Scanner entrada = new Scanner(System.in);
		public static void main(String[] args) {
			
			Grafico g = new Grafico();
			g.setVetor(vetor());
			
			try {
				Html.html(g.getVetor());
			} catch (IOException k) {
				k.printStackTrace();
			}
			

		}
		public static int[] vetor() {
			System.out.println("Informe o número de partidas");
			int qtt = entrada.nextInt();
			int vet[] = new int[qtt];

			for (int i = 0; i < qtt; i++) {
				System.out.println("Informe a quantidade kills da sessao");
				vet[i] = entrada.nextInt();
			}
			System.out.println("Kill Confirmed.");
			entrada.close();

			return vet;

		}

}
