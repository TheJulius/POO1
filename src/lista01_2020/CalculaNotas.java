package lista01_2020;

public class CalculaNotas {
	
	private int valorASerSacado;

	public int getValorASerSacado() {
		return valorASerSacado;
	}

	public void setValorASerSacado(int valorASerSacado) {
		this.valorASerSacado = valorASerSacado;
	}
	
	public String calculaNotas() {
		
		int notasDeCem = valorASerSacado / 100;
		int notasDeCinquenta = 0;
		int notasDeVinte = 0;
		int notasDeDez = 0;
		int notasDeUm = 0;
		
		//sei que esse codigo esta criminoso, desculpa
		
		if(valorASerSacado % 100 != 0) {
			notasDeCinquenta = (valorASerSacado % 100) / 50;
			
			if(((valorASerSacado % 100) % 50) != 0) {
				notasDeVinte = ((valorASerSacado % 100) % 50) / 20;
				
				if((((valorASerSacado % 100) % 50) % 20) != 0) {
					notasDeDez = (((valorASerSacado % 100) % 50) % 20) / 10;
					
					if(((((valorASerSacado % 100) % 50) % 20) % 10) != 0) {
						notasDeUm = ((((valorASerSacado % 100) % 50) % 20) % 10) / 1;
					}
				}
			}
		}
		
		//retornando um sysout no back, crime puro
		
		return "Notas de 100: " + notasDeCem + "\n" + 
			   "Notas de 50: " + notasDeCinquenta + "\n" +
			   "Notas de 20: " + notasDeVinte + "\n" +
			   "Notas de 10" + notasDeDez + "\n" +
			   "Notas de 1: " + notasDeUm;
	}

}
