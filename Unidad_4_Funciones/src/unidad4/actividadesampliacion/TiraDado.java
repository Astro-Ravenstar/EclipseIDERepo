package unidad4.actividadesampliacion;
import java.util.Scanner;
public class TiraDado {

	public static void main(String[] args) {
		
		int check, rondas, resultadoJ1, resultadoJ2;
		String checkEmpate = "Empate";
		System.out.println("Programa de dados: ON-LINE");
		System.out.println("Eliga las rondas.");
		rondas = new Scanner(System.in).nextInt();
		for(int i = 1; i <= rondas; i++) {
			do {
				System.out.println("Jugador 1, presione [1] para lanzar su dado");
				check = new Scanner(System.in).nextInt();
				resultadoJ1 = tirarDado();
				System.out.println("Jugador 2, presione [2] para lanzar su dado");
				check = new Scanner(System.in).nextInt();
				resultadoJ2 = tirarDado();
				checkEmpate = compararResultado(resultadoJ1, resultadoJ2);
				System.out.println(checkEmpate);
			} while (checkEmpate.equals("Empate, volveremos a tirar"));
		} 
		System.out.println("Fin del juego.");
	}

	public static int tirarDado(){
		int tiradaDado = (int)(Math.random()*6);
		System.out.println("Resultado de la tirada: " + tiradaDado);
		return tiradaDado;
	}
	
	public static String compararResultado(int j1, int j2){
		String resultado;
		if (j1 > j2) {resultado = "Victoria del jugador 1";}
		else if (j1 < j2) {resultado = "Victoria del jugador 2";}
		else {resultado = "Empate, volveremos a tirar";}
		return resultado;
	}
}
