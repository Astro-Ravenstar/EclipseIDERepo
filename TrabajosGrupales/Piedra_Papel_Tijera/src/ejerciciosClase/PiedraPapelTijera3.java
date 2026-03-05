package ejerciciosClase;
import java.util.Scanner;
public class PiedraPapelTijera3
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
		
		if(jug1 == jug2) 
		{
			resultado = "Empate";
		}
		else if(jug1 > jug2)
		{
			if(jug1 - jug2 == 1)
			{
				resultado = "Victoria del jugador 1";
			}
			else {resultado = "Victoria del jugador 2";}
		}
		else if(jug1 < jug2)
		{
			if(jug1 - jug2 == -1)
			{
				resultado = "Victoria del jugador 2";
			}
			else {resultado = "Victoria del jugador 1";}
		}	
		System.out.println(resultado);
	}
}