package lista02_2020;

import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;

public class Vetor {
	
	private int arraySize;
	private int[] arrayRandom;
	
	public int getArraySize() {
		return arraySize;
	}

	public void setArraySize(int arraySize) {
		this.arraySize = arraySize;
	}
	
	public int[] setArrayRandom() { 
		
		int array [] = new int [arraySize];
		
		Random gerador = new Random();
		
		for(int i = 0; i < array.length; i++) {
			
			array[i] = gerador.nextInt(5000);
		}
		
		//ordenando e setando o arrayRandom
		
		Arrays.sort(array);
		
		this.arrayRandom = array; // acho que isso nao esta certo, pois nao esta passando o valor do array para a variavel!
		
		return array;
	}
	
	public double retornaSoma() {
		
		int[] array = arrayRandom;
		
		int soma = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			soma += array[i];
			
		}
		
		return soma;
	
	}
	
	public double retornaMedia() {
		
		int media = 0;
		
		for (int i = 0; i < arrayRandom.length; i++) {
			
			media += arrayRandom[i];
			
		}
		
		return media / arrayRandom.length;
	
	}
	
	public double retornaModa() {
		
		HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		Integer i;
		Double moda = 0.0;
		Integer numAtual, numMaior = 0;
		
		for (int count = 0; count < arrayRandom.length; count++) {
		i = (Integer) map.get(new Double(arrayRandom[count]));
			if (i == null) {
				map.put(new Double(arrayRandom[count]), new Integer(1));
			} else {
				map.put(new Double(arrayRandom[count]), new Integer(i.intValue() + 1));
				numAtual = i.intValue() + 1;
				if (numAtual > numMaior) {
					numMaior = numAtual;
					moda = new Double(arrayRandom[count]);
				}
			}
		}
		
		return moda;
	}
	
	public int retornaMediana() {
		
		int mediana;
		
		if(arrayRandom.length % 2 == 0) {
			
			mediana = arrayRandom.length/2 - 1;
	
		} else {
			mediana = arrayRandom.length/2;
		}
		
		return arrayRandom[mediana]; 
	}
	

	
	public double retornaSomaAoQuadrado() {
		
		int[] array = arrayRandom;
		
		double somaQuadrada = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			somaQuadrada += (array[i]*array[i]);
			
		}
		
		return somaQuadrada;	
		
	}
	
	// Variância Amostral
	public double retornaVariancia() {
		
		double p1 = 1 / Double.valueOf(arrayRandom.length - 1);
		double p2 = retornaSomaAoQuadrado()
			
		- (Math.pow(retornaSoma(), 2) / Double
		.valueOf(arrayRandom.length));
	
		return p1 * p2;
	}
	
	public double retornaDesvioPadrao() {
		
		return Math.sqrt(retornaVariancia());
	}
	
	public double retornaMaiorNumero() {
		
		int maiorNumero = 0;
		
		for (int i = 0; i < arrayRandom.length; i++) {
			
			if(arrayRandom[i] > maiorNumero) {
				maiorNumero = arrayRandom[i];
			}
			
		}
		
		return maiorNumero;
	}
	
	public double retornaMenorNumero() {
		
		int menorNumero = arrayRandom[0];
		
		for (int i = 0; i < arrayRandom.length; i++) {
			
			if(arrayRandom[i] < menorNumero) {
				menorNumero = arrayRandom[i];
			}
			
		}
		
		return menorNumero;
	}
	
	public int[] retornaNumerosPares() {
		
		int[] pares = new int [arraySize];
		
		for (int i = 0; i < arrayRandom.length; i++) {
			
			if(arrayRandom[i] % 2 == 0) {
				pares[i] = arrayRandom[i];
			}
			
		}
		
		return pares;
	}
	
	public int[] retornaNumerosImpares() {
		
		int[] impares = new int [arraySize];
		
		for (int i = 0; i < arrayRandom.length; i++) {
			
			if(arrayRandom[i] % 2 != 0) {
				impares[i] = arrayRandom[i];
			}
			
		}
		
		return impares;
	}
	
	//revisar calculos nao fecharam 100%
	public int[] retornaNumerosPrimos() {
		int[] primos = new int [arraySize];
		
		for (int i = 2; i < arrayRandom[i]; i++) {
			
			if(arrayRandom[i] % i != 0) {
				primos[i] = arrayRandom[i];
			}
			
		}
		
		return primos;
	}
}
