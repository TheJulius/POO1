package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		List<Pessoa> Lista = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa ();
		p1.setCodigo(1);
		p1.setNome("Rodrigo");
		p1.setEmail("Rodrigo@gmail.com");
		p1.setTelefone(988887777);
		p1.setDataNascimento("05/05/1970");
		Lista.add(p1);
		
		Pessoa p2 = new Pessoa ();
		p2.setCodigo(2);
		p2.setNome("Julio");
		p2.setEmail("Julio@hotmail.com");
		p2.setTelefone(955554444);
		Lista.add(p2);
		
		Scanner ler = new Scanner(System.in);
		FileWriter arq = new FileWriter("agenda csv");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		for (Pessoa pessoa : Lista) {
			
			gravarArq.printf("%d;%s", pessoa.getCodigo(), pessoa.getNome());
			
		}
		
		arq.close();
		
		try {
			FileReader arq1 = new FileReader ("agenda csv");
			BufferedReader lerArq = new BufferedReader(arq1);
			String linha = lerArq.readLine();
			Lista = new ArrayList<Pessoa>();
			
			while (linha != null) {
				
				String[] leitura = linha.split(";");
				
				p1 = new Pessoa();
				p2 = new Pessoa();
				
				p1.setCodigo(Integer.parseInt(leitura[0]));
				p1.setNome(leitura[1]);

				p2.setCodigo(Integer.parseInt(leitura[2]));
				p2.setNome(leitura[3]);
				
				Lista.add(p1);
				Lista.add(p2);
				
				linha = lerArq.readLine();
			}
			
			arq1.close();
			
		}catch(IOException e) {
			
			System.err.printf("Erro na abertura do arquivo %s \n", e.getMessage());
			
		}
		
		for (Pessoa pessoa : Lista) {
			System.out.println(pessoa);
		}
		
		ler.close();


		

	}

}
