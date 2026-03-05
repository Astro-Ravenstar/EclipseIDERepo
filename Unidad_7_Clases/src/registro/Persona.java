package registro;

import java.util.Scanner;

public class Persona {
	
	String dni;
	String nombre;	
	static Persona [] viajeros = new Persona[1];
	
	Persona(String dni, String nombre){
		setDni(dni);
		setNombre(nombre);
	}
	
	//GETSET DNI
	String getDni(){
		return this.dni;
	}
	void setDni(String dni) {
		if (dni.toCharArray().length == 9) {
			this.dni = dni;
		}
		else {
			this.dni = "ERROR";
		}
	}
	//GETSET NOMBRE
	String getNombre(){
		return this.nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	static void buscarDni() {
		System.out.println("Introduzca el DNI completo en MAYUSCULA");
		String dni = new Scanner(System.in).nextLine();
		for(int i = 0; i < viajeros.length; i++ ) {
			if(viajeros[i].getDni().contains(dni)){
				System.out.println("DNI: " + viajeros[i].dni + " | NOMBRE: " + viajeros[i].nombre);
			}	
		}
	}
	
	static void buscarNombre() {
		System.out.println("Introduzca el nombre completo en MAYUSCULA, respetando los espacios:");
		String nombre = new Scanner(System.in).nextLine();
		for(int i = 0; i < viajeros.length; i++ ) {
			if(viajeros[i].getNombre().contains(nombre)){
				System.out.println("DNI: " + viajeros[i].dni + " | NOMBRE: " + viajeros[i].nombre);
			}	
		}
	}
	
	static void mostrarDatos() {
		for(int i = 0; i < viajeros.length; i++ ) {
			System.out.println("DNI: " + viajeros[i].dni + " | NOMBRE: " + viajeros[i].nombre);
		}
		
	}
	
	static void insertar() {
		incrementarArray(viajeros);
		System.out.println("Introduzca todas las letras en MAYUSCULA:");
		System.out.println("Introduzca el DNI:");
		String dni = new Scanner(System.in).nextLine();
		System.out.println("Introduzca el nombre:");
		String nombre = new Scanner(System.in).nextLine();
		viajeros[viajeros.length-1] = new Persona(dni, nombre);
		System.out.println("Registro creado.");
	}
	
	static void incrementarArray(Persona[] viajeros) {
		Persona [] copia = new Persona[viajeros.length+1];
		for(int i = 0; i < viajeros.length; i++) {
			copia[i] = viajeros[i];
		}
		viajeros = copia;
	}
}
