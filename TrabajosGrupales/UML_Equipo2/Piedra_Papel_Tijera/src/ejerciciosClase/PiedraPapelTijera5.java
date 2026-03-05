package ejerciciosClase;
import java.util.Scanner;
public class PiedraPapelTijera5
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int jug1, jug2, ciclo, rondasJ, mejorDeX, victorias1 = 0, victorias2 = 0;
		String resultado = "";
		System.out.println("Introduzcan el total de rondas máximas (número impar): ");
		rondasJ = sc.nextInt();
		mejorDeX = (rondasJ + 1) / 2;
		
		do 
		{	
			
			System.out.println("Jugador 1, introduzca su jugada: Piedra = 1, Papel = 2, Tijera = 3");
			jug1 = sc.nextInt();
			System.out.println("Jugador 2, introduzca su jugada: Piedra = 1, Papel = 2, Tijera = 3");
			jug2 = sc.nextInt();
			ciclo = (jug1 - jug2);
			
			if		(jug1 == jug2) 				{resultado = "Empate"								;}
			else if (ciclo == 1 || ciclo == -2) {resultado = "Victoria del jugador 1"; victorias1++	;}
			else 								{resultado = "Victoria del jugador 2"; victorias2++;}
			
			System.out.println(resultado);
			System.out.println("Puntos del jugador 1: " + victorias1);
			System.out.println("Puntos del jugador 2: " + victorias2);
			
		}while(victorias1 != mejorDeX && victorias2 != mejorDeX);
		
		sc.close();
		System.out.println("Fin del juego"); 
		System.out.println(victorias1 == 3 ? "Victoria total del jugador 1" : "Victoria total del jugador 2"); 
	}
}