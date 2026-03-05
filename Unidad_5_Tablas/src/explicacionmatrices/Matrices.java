package explicacionmatrices;

public class Matrices {

	public static void main(String[] args) {	//INCIO MAIN
		
		float [][] alumnosNotas;
		alumnosNotas = new float [5][3];	//4 alumnos (filas) y 3 notas(columnas).
		
		rellenarMatriz2(alumnosNotas);
		mostrarMatriz(alumnosNotas);
		mediaClase(alumnosNotas);
		
		int selectColumna = 0;
		
		valoresDeColumna(alumnosNotas, selectColumna);
		
		String [] nombres = new String[alumnosNotas.length];
		nombres[0] = "Javi";
		nombres[1] = "Pepe";	
		nombres[2] = "Mar";
		nombres[3] = "Juan";
		nombres[4] = "Pepa";
		
//		String [] nombres = {"Javi", "Pepe", "Mar", "Juan"};	//Forma alternativa de insertar valores.
		
		mostrarMediaAlumnos(alumnosNotas, nombres);
		
		
	}	// FIN MAIN - INICIO FUNCIONES

	public static void mostrarMediaAlumnos(float[][] alumnosNotas, String[] nombres) {
		float notaMediaAlumno;
		for(int i = 0; i < alumnosNotas.length; i++) {
			notaMediaAlumno = mediaAlumno(alumnosNotas[i]);
			System.out.println("Alumno: " + nombres[i] + ". Nota media: " + notaMediaAlumno );
			notaMediaAlumno = 0;
		}
	}
	
	public static float mediaAlumno(float[]notas) {
		float acum = 0;
		for(int i = 0; i < notas.length; i++) {
			acum += notas[i];
		}
		return acum/notas.length;
	}

	public static void valoresDeColumna(float[][] alumnosNotas, int selectColumna) {
		for (int i = 0; i < alumnosNotas.length; i++) {
			System.out.println("Fila " + i + ", columna: " + selectColumna + ", valor: " + alumnosNotas[i][selectColumna]);		
		}
	}

	public static void mediaClase(float[][] alumnosNotas) {
		float acumAlu = 0, acumClase = 0, mediaAlumno = 0;
		for(int filas = 0; filas < alumnosNotas.length; filas++) {
			for(int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				acumAlu += alumnosNotas [filas][columnas];
			}
			mediaAlumno = acumAlu/alumnosNotas[filas].length;
			System.out.println("La nota media del alumno " + filas + "es: " + mediaAlumno);
			acumClase += mediaAlumno;
			acumAlu = 0;
		}
		System.out.println("La nota media de la clase es: " + acumClase / alumnosNotas.length);
	}

	public static void mostrarMatriz(float[][] alumnosNotas) {
		for(int filas = 0; filas < alumnosNotas.length; filas++) {
			for (int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				System.out.print(alumnosNotas[filas][columnas] + ", ");
			}
			System.out.println();
		}
	}
	
	public static void rellenarMatriz2(float[][] alumnosNotas) {
		for(int filas = 0; filas < alumnosNotas.length; filas++) {
			for (int columnas = 0; columnas < alumnosNotas[filas].length; columnas++) {
				alumnosNotas[filas][columnas] = (float)Math.random()*10;
			}
		}
	}
	
	public static void rellenarVector(float [] vector) {
		
		for(int i = 0; i < vector.length; i++) {
			vector[i] = (float)Math.random()*10;
		}
	}
	
	public static void rellenarMatriz(float[][] alumnosNotas) {
		for(int i = 0; i < alumnosNotas.length; i++) {
			rellenarVector(alumnosNotas[i]);
		}
	}
	
	public static float mediaNotas(float[]notasFuncion) {
		
		float acumulador = 0;
		for(int i = 0; i < notasFuncion.length; i++) {
			acumulador += notasFuncion[i];
		}
		
		float mediaNota = acumulador/notasFuncion.length;
		return mediaNota;
	}
}	
