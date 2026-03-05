package EjercicioPiedraPapelTijera;
import java.util.Scanner;
public class PiedraPapelTijera {

	public static void main(String[] args) throws InterruptedException 
	{
		//DECLARAR VARIABLES
		
		Scanner sc = new Scanner(System.in);
		boolean isPlayer, isNotOver = false;
		int j1, j2, decision, ciclo, rondas, mejorDeX, victorias1, victorias2;
		String resultado = "";
		System.out.println("Bienvenido al juego de Piedra, Papel, Tijera");
		
		do //DEFINIR VALORES
		{
			//DEFINIR JUGADOR O CPU
			System.out.println("Eliga la modalidad de juego: Presione [1] para Jugador VS CPU, o [2] para CPU vs CPU");
			decision = sc.nextInt();
			isPlayer = switch (decision) 
			{
				case 1 -> {yield true;}
				default -> {yield false;}
			};
			
			//DEFINIR NUNMERO RONDAS / MEJOR DE X
			System.out.println("Eliga un número de rondas impar");
			do{
				rondas = sc.nextInt();
				if (rondas % 2 != 0) break;
				System.out.println("Ese número es par, pecador. Introduzca un número válido.");
			}while (rondas % 2 == 0);
			
			mejorDeX = (rondas + 1) / 2;
			
			//ESTABLECER / REINICIAR RONDAS
			victorias1 = 0 ;victorias2 = 0;
			
				do //JUEGO
				{
					//CPU 1
					System.out.println("Jugador 1 (CPU), está eligiendo.");
					j1 = 1 + (int)(Math.random() * (3));
					Thread.sleep(500);
					if (j1 == 1) {resultado = "Piedra";} else if (j1 == 2) {resultado = "Papel";} else {resultado = "Tijera";}
					if (!isPlayer) {System.out.println("Jugador 1 ha elegido: " + resultado); Thread.sleep(500);}
					
					//JUGADOR
					if (isPlayer)
					{
						System.out.println("Jugador 2, introduzca su jugada: Piedra = 1, Papel = 2, Tijera = 3");
						j2 = sc.nextInt();
					}
					
					//CPU 2
					else 
					{ 
						System.out.println("Jugador 1 (CPU), está eligiendo.");
						j2 = 1 + (int)(Math.random() * (3)); 
						Thread.sleep(500);
						if (j2 == 1) {resultado = "Piedra";} else if (j2 == 2) {resultado = "Papel";} else {resultado = "Tijera";}
						System.out.println("Jugador 2 ha elegido: " + resultado);
						Thread.sleep(500);
					} 
					
					ciclo = (j1 - j2);
					
					if		(j1 == j2) 					{resultado = "Empate, se repetirá la ronda";		 }
					else if (ciclo == 1 || ciclo == -2) {resultado = "Victoria del jugador 1"; victorias1++	;}
					else 								{resultado = "Victoria del jugador 2"; victorias2++	;}
					
					System.out.println(resultado);
					System.out.println("Puntos del jugador 1: " + victorias1);
					System.out.println("Puntos del jugador 2: " + victorias2);
					
				}while(victorias1 != mejorDeX && victorias2 != mejorDeX);
				
			//¿QUIEN GANA?
			System.out.println(victorias1 == mejorDeX ? "Victoria total del jugador 1" : "Victoria total del jugador 2");
			
			//REPETIR JUEGO ¿?
			System.out.println("¿Desea jugar de nuevo? Presione [1] para continuar, o [2] para finalizar");
			decision = sc.nextInt();
			isNotOver = switch (decision) 
			{
				case 1 -> {yield true;}
				default -> {yield false;}
			};
			
		}while(isNotOver);
		
		sc.close();
		System.out.println("Fin de la partida");
		}
}
