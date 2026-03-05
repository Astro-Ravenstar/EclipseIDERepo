package actividadesaplicacion;

import java.util.Scanner;

public class ActividadAplicacion612 {

	public static void main(String[] args) {
			
		System.out.println("Introduzca la palabra secreta:");
		String palabraSecreta = "aramasa";					//new Scanner(System.in).nextLine();
		int intentos = 7;
		int contador = 0;
		
		char[] palabraGuiones = palabraSecreta.toCharArray();
		char[] palabraCheck = palabraSecreta.toCharArray();

		
		for(int i = 0; i < palabraGuiones.length; i++) {
			palabraGuiones[i] = '_' ;
		}
		System.out.println(palabraGuiones);
		
		
		
		do {
			System.out.println("ESCRIBE");
			char letra = new Scanner(System.in).nextLine().charAt(0);
			
			for(int i = 0; i < palabraCheck.length; i++) {
				if (palabraCheck[i] == letra) {
					palabraGuiones[i] = letra;
				}
				else {contador++ ;}
			}
			if(contador == 0){
				intentos--;
			}
			System.out.println(palabraGuiones);
			System.out.println(intentos);
			
		}while(intentos >= 0);
		
		//palabraGuiones[palabraSecreta.indexOf(letra)] = letra;
		
		
	}

}
