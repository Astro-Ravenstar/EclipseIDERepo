package ejerciciostablas;

import java.util.Arrays;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		String [] nombres = {"Zetha", "Delta", "Phi", "Beta", "Alpha"};
		
		String holder = "zzzz";
		
		for(int i = 0; i < nombres.length; i++) {
			for(int j = 0; j < nombres.length - 1; j++) {
				if (nombres[j].compareTo(nombres[j+1]) > 0) {
					holder = nombres[j];
					nombres[j] = nombres[j+1];
					nombres[j+1] = holder;
				}
			}
		}	
		System.out.println(Arrays.toString(nombres));
	}

}
