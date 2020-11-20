package calendario;

public class CalendarioMain {

	public static void main(String[] args) {
		
		calendario c = new calendario();
		
		c.setAno(2019);
		c.setMes(10);
		c.setDia(10);
		
		System.out.println(c.data());
		

	}

}
