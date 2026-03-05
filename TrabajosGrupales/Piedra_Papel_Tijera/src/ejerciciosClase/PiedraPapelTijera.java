package ejerciciosClase;
import java.util.Scanner;
public class PiedraPapelTijera 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		String jug1, jug2, resultado = "";
		System.out.println("Jugador 1, introduzca su jugada: ");
		jug1 = sc.nextLine();
		System.out.println("Jugador 2, introduzca su jugada: ");
		jug2 = sc.nextLine();
		sc.close();
		
		if(jug1 == "piedra")
		{
			if(jug2 == "piedra") {resultado = "Empate";}
			else if(jug2 == "papel") {resultado = "Victoria del jugador 2";}
			else if(jug2 == "tijera") {resultado = "Victoria del jugador 1";}	
		}
		else if(jug1 == "papel")
		{
			if(jug2 == "piedra") {resultado = "Victoria del jugador 1";}
			else if(jug2 == "papel") {resultado = "Empate";}
			else if(jug2 == "tijera") {resultado = "Victoria del jugador 2";}	
		}
		else if (jug1 == "tijera")
		{
			if(jug2 == "piedra") {resultado = "Victoria del jugador 2";}
			else if(jug2 == "papel") {resultado = "Victoria del jugador 1";}
			else if(jug2 == "tijera") {resultado = "Empate";}	
		}
		System.out.println("Resultado: " + resultado + ".");
		System.out.println(jug1+jug2);
		
		
	}
}
