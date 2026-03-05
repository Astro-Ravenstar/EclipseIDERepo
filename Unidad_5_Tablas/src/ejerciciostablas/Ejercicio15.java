package ejerciciostablas;

import java.util.Arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int [] numeritos = {0, 2, 6, 8, 10, 0,};
		insercion(numeritos, 4);
		System.out.println(Arrays.toString(numeritos));

	}
	
	public static void insercion(int[]numeros, int valor) {
		int pos = Arrays.binarySearch(numeros, valor);
		int indiceInsercion = -pos -1;
		for(int i = numeros.length - 1; i > indiceInsercion; i--) {
			numeros[i] = numeros[i-1];
		}
		numeros[indiceInsercion] = valor;
	}
}
