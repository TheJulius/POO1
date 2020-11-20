package json;

import java.util.Scanner;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class arrayal {
	
	
	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		System.out.print("Digite os valores: ");
		int valoress = entrada.nextInt();
		
		for (int i = 0; i < valoress; i++) {
			System.out.print("->");
			valores.add(entrada.nextInt());
		}
				Gson gson = new Gson ();
				String json = gson.toJson(valores);
			
				FileWriter writer = new FileWriter("C:\\Users\\Julio\\IFC\\POO1\\arrayal.json");
				writer.write(json);	
	}

}
