package ejerciciostablas;

import java.util.Arrays;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int [] numeros = {2, 6, 9, 8};
		int [] numerosCopia = new int [numeros.length + 1];
		
		for(int i = 0; i < numeros.length; i++){
			numerosCopia[i] = numeros[i];
		}

		System.out.println(Arrays.toString(numerosCopia));
		
		int [] numerosCopia2 = Arrays.copyOf(numeros, numeros.length + 1);
		
		System.out.println(Arrays.toString(numerosCopia2));
	}
}
