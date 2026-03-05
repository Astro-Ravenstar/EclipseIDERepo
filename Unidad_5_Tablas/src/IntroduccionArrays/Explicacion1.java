package IntroduccionArrays;
import java.util.Scanner;
public class Explicacion1 {

	public static void main(String [] args) {
		
		float[]notas;
		notas = new float [12];	//Length.
//		notas[0] = 7.5F;
//		notas[1] = 5;
//		notas[2] = 6.25F;
		
		//System.out.println(notas);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Introduce la nota: ["+ i +"]");
		//	notas[i] = new Scanner(System.in).nextFloat();
			notas[i] = i+1;
		}
		
		//Crear/Actualizar:
		crearNotaArray(notas);
		
		//Borrar:
		eliminarNotaArray(notas);
		
		//Leer:
		leerNotaArray(notas);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
	
	public static void crearNotaArray (float[]notasFuncion){
		//Crear/Actualizar:
		System.out.println("¿Qué nota quieres cear o actualizar?");
		int indice = new Scanner(System.in).nextInt();
		System.out.println("¿Qué valor quieres ponerle?");
		notasFuncion[indice] = new Scanner(System.in).nextInt();
	}
	public static void eliminarNotaArray (float[]notasFuncion){
		//Borrar:
		System.out.println("¿Qué nota quieres eliminar?");
		int indice = new Scanner(System.in).nextInt();
		notasFuncion[indice] = -1;
	}
	public static float leerNotaArray (float[]notasFuncion) {
		System.out.println("¿Qué nota quieres consultar?");
		int indice = new Scanner(System.in).nextInt();
		float notaLeida = notasFuncion[indice];
		return notaLeida;
	}
}
