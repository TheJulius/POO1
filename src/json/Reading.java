package json;

import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.io.FileReader;
import java.util.ArrayList;

public class Reading {
	
	
	public static void main(String[] args) throws IOException {
		Gson Json = new Gson();
		Type arrayal = new TypeToken<ArrayList<Integer>>() {}.getType();
		FileReader reader = new FileReader("C:\\Users\\Julio\\IFC\\POO1\\reading.json");
		ArrayList<Integer> valores = Json.fromJson(reader, arrayal);
		System.out.println(valores);
	}
	
	

}
