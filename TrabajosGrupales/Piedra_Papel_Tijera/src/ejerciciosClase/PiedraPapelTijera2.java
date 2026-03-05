
package ejerciciosClase;
import java.util.Scanner;
public class PiedraPapelTijera2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int jug1, jug2;
		String resultado = "";
		System.out.println("Jugador 1, introduzca su jugada: Piedra = 1, Papel = 2, Tijera = 3");
		jug1 = sc.nextInt();
		System.out.println("Jugador 2, introduzca su jugada: Piedra = 1, Papel = 2, Tijera = 3");
		jug2 = sc.nextInt();
		sc.close();
		
		if(jug1 == 1)
		{
			if     (jug2 == 1) {resultado = "Empate";}
			else if(jug2 == 2) {resultado = "Victoria del jugador 2";}
			else if(jug2 == 3) {resultado = "Victoria del jugador 1";}	
		}
		else if(jug1 == 2)
		{
			if     (jug2 == 1) {resultado = "Victoria del jugador 1";}
			else if(jug2 == 2) {resultado = "Empate";}
			else if(jug2 == 3) {resultado = "Victoria del jugador 2";}	
		}
		else if(jug1 == 3)
		{
			if     (jug2 == 1) {resultado = "Victoria del jugador 2";}
			else if(jug2 == 2) {resultado = "Victoria del jugador 1";}
			else if(jug2 == 3) {resultado = "Empate";}	
		}
		
		System.out.println("Resultado: " + resultado + ".");
	}
}
