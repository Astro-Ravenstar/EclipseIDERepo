package ejerciciostablas;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) { 
		
		float [] notas = new float [5];
		System.out.println("Por favor, introduzca las notas de los alumnos.");
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Introduzca la nota del alumno " + i + ".");
			notas[i] = new Scanner(System.in).nextFloat();
		}
		float acumulador = 0;
		for(int i = 0; i < notas. length; i++) {
			acumulador += notas[i];
		}
		System.out.println("La nota media de los alumnos es: " + acumulador/notas.length + ".");
	}

}
