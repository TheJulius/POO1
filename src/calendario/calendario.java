package calendario;

public class calendario {
	
	private int dia;
	private int mes;
	private int ano;
	
	public int getDia() {
		return dia;
	}
	public boolean setDia(int dia) {
		
		if (this.mes == 1 | this.mes == 3 | this.mes == 5 | this.mes == 7 | this.mes == 8 | this.mes == 10 | this.mes == 12 ) {
			
			if (this.dia < 0 | this.dia > 31) {
				
				return false;
				
			}
			
			
		} else if (this.mes == 4 | this.mes == 6 | this.mes == 9 | this.mes == 11) {
			
			if (this.dia < 0 | this.dia > 30) {
				
				return false;
				
			}
			
			
		} else if (this.mes == 2) {
			
			if (this.dia < 0 | this.dia > 28) {
				
				return false;
				
			}
			
			
		}
		
		return true;
	}
	
	public int getMes() {
		return mes;
	}
	
	public int setMes(int mes) {
		if(this.mes < 0 | this.mes > 12) {
			this.mes = 00;
			
		}else {
			
			return this.mes;
		
		}
		return this.mes;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public boolean setAno(int ano) {
		if (this.ano < 1900 | this.ano > 2100) {
			
			return false;
		}
		return true;
	}

	
	
	public String data (){
		
		StringBuilder builder = new StringBuilder();
		builder.append(dia);
		builder.append("/");
		builder.append(mes);
		builder.append("/");
		builder.append(ano);
		
		return builder.toString();
		
	}
	
}
