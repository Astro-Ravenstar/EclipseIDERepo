package unidad4.actividadesampliacion;
import	java.util.Scanner;
public class Penaltis {

	public static void main(String[] args) {
		
			int contador = 5, puntosJ = 0, puntosCPU = 0;
			System.out.println("¿Preparado para unos penaltis contra la CPU?");
			System.out.println("¿Cada uno tiene 5 disparos.");
			
			for (int i = 1; i <= 5; i++) {
				
				for(int j = 1; j <= 2; j++) {
					if (j % 2 != 0) {
						System.out.println("Lanza el jugador.");	
						puntosJ += lanzarPenalti();
					} else {
						System.out.println("Lanza la CPU.");
						puntosCPU += lanzarPenalti();
					}
					mostrarMarcador(puntosJ, puntosCPU);
				}
				
				contador--;
				System.out.println("Rondas restantes: " + contador);	
			}
			decidirGanador(puntosJ, puntosCPU);
	}
	
	public static void mostrarMarcador(int jugador, int cpu) {
		System.out.println("JUGADOR: " + jugador + " CPU: " + cpu);
	}
	
	public static void decidirGanador(int jugador, int cpu) {
		if(jugador > cpu){System.out.println("Gana el jugador.");}
		else if (jugador < cpu){System.out.println("Gana la CPU.");}
		else{System.out.println("Empate.");}
	}
	
	public static int lanzarPenalti() {
		
		int resultado;
		
		System.out.println("Eliga su posición: 1 = izquierda, 2 = centro, 3 = derecha");
		int jugador = new Scanner(System.in).nextInt();
		String jugadorS = traduccion(jugador);
		
		int cpu = (int)(Math.random()*3);
		String cpuS = traduccion(cpu);
	
		System.out.println("JUGADOR: " + jugadorS + " CPU: " + cpuS);
		
		if(jugador == cpu) {resultado = 0;}
		else {resultado = 1;}
		return resultado;
	}
	
	public static String traduccion(int value) {
		String traduccion = switch (value) {
		case 1 -> "Izquierda";
		case 2 -> "Centro";
		default -> "Derecha";
		};
		return traduccion;
	}
}
