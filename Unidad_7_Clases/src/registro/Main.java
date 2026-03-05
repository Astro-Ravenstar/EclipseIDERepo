package registro;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Persona [] viajeros = new Persona[1];
		
		int exit = 0;
		
		
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1: Crear nuevo registro.");
			System.out.println("2: Mostrar datos de todos los registros.");
			System.out.println("3: Buscar por nombre.");
			System.out.println("4: Buscar por DNI.");
			System.out.println("5: Salir.");
			
			int opcion = new Scanner(System.in).nextInt();
			
			switch (opcion){
				case 1 -> {
					Persona.insertar();	
				}
				case 2 -> {
					Persona.mostrarDatos();
				}
				case 3 -> {
					Persona.buscarNombre();
				}
				case 4 -> {
					Persona.buscarDni();
					}
				default -> {
					System.out.println("Saliendo...");
					exit = 1;
				}
			};	
			System.out.println("");
		} while (exit != 1);
		
		System.out.println("Fin del programa.");
	}
}
