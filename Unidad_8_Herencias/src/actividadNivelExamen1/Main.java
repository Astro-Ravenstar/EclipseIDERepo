package actividadNivelExamen1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Alumno [] alumnos = new Alumno[50];
		Profesor [] profesores = new Profesor[50];
		Asignatura [] asignaturas = new Asignatura[50];
			
		menuPrincipal();
		
	}
	
	static void menuPrincipal() {
		boolean salir = false;
		do {
			System.out.println("Introduzca la opción que desea realizar \n 1: Menú alumnos \n 2: Menú asignaturas \n 3: Menú profesores \n 4: Salir");
			int option = new Scanner(System.in).nextInt();
			switch(option) {
				case 1 -> {
					menuAlumnos();
				}
				case 2 -> {
					menuAsignaturas();
				}
				case 3 -> {
					menuProfesores();
				}
				case 4 -> {
					System.out.println("Saliendo...");
					salir = true;
				}
				default -> {
					System.out.println("Valor inválido");
				}
			}
			
		}while(!salir);
	}
	
	static void menuAlumnos() {
		do {
			System.out.println("Menú Alumnos: \n 1: Mostrar alumnos \n 2: Añadir alumnos \n 3: Mostrar asignaturas del alumno \n 4: Mostrar asignaturas del alumno para el año \n 5: Matricular alumno a la asignatura \n 6: Volver al menú principal");
			int option = new Scanner(System.in).nextInt();
			switch(option) {
				case 1 -> {
					
				}
				case 2 -> {

				}
				case 3 -> {
	
				}
				case 4 -> {
					
				}
				default -> {
				}
			}
			
		}while(true);
	}
	
	static void menuAsignaturas() {
		
	}

	static void menuProfesores() {
	
}
	
}
