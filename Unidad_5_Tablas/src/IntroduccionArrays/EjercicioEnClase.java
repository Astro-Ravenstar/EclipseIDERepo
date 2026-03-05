package IntroduccionArrays;
import java.util.Scanner;
public class EjercicioEnClase {

	public static void main(String[]args){
		
		float [] notas = new float [12];
		
		//Definir notas al azar:
		
		azarNotas(notas);
		
		//Media de notas:
		
/*		mediaNotas(notas);
		
		//Nota máxima:
		
		maximaNota(notas);
		
		//Nota mínima:
		
		minimaNota(notas);
		
		float aux;
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas.length - 1; j++) {
				if(notas[j] > notas[j+1]) {
					aux = notas[j];
					notas[j] = notas[j+1];
					notas[j+1] = aux;
				}
			}
		}
*/		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
			


	
	public static void azarNotas(float[]notasFuncion) {
		
		for(int i = 0; i < notasFuncion.length; i++) {
			notasFuncion[i] = (float)(Math.random()*(10-1)+1);
		}
	}
	
	public static void mediaNotas(float[]notasFuncion) {
		
		float acumulador = 0;
		for(int i = 0; i < notasFuncion.length; i++) {
			acumulador += notasFuncion[i];
		}
		
		float mediaNota = acumulador/notasFuncion.length;
		System.out.println("Nota media: " + mediaNota);
	}
	
	public static void maximaNota (float[]notasFuncion) {
		
		float tempMax = -1;
		for(int i = 0; i < notasFuncion.length - 1; i++) {
			if (notasFuncion[i] > tempMax) {
				tempMax = notasFuncion[i]; 
			}
		}
	}
	
	public static void minimaNota (float[]notasFuncion) {
		
		float tempMin = 11;
		for(int i = 0; i < notasFuncion.length - 1; i++) {
			if (notasFuncion[i] < tempMin) {
				tempMin = notasFuncion[i]; 
			}
		}
	}
}
