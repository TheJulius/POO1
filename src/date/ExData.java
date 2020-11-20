package date;

import java.util.Date;
import java.util.Calendar;


public class ExData {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		calendario.set(Calendar.DAY_OF_MONTH, 15);
		calendario.set(Calendar.MONTH, 1);
		calendario.set(Calendar.YEAR, 1997);
		calendario.set(Calendar.HOUR_OF_DAY, 13);
		calendario.set(Calendar.MINUTE, 50);
		calendario.set(Calendar.SECOND, 59);
		
		Date dt = calendario.getTime();
		System.out.println("Julio nasceu em" + dt);
		

	}

}
