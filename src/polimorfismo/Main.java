package polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal ();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		Pato pato = new Pato();
		
		Animal [] animais = new Animal [4];
		
		animais[0] = animal;
		animais[1] = pato;
		animais[2] = cachorro;
		animais[3] = gato;
		// TODO Auto-generated method stub
		
		for ( int x = 0; x < 4; x++) {
			
			System.out.println(animais[x].falar());
			
		}

	}

}
