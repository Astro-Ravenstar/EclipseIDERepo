package unidad4.actividadesampliacion;
import java.util.Scanner;
public class AdivinaElNumero {

	public static void main(String[] args) 
	{	
		System.out.println("Bienvenido al juego de las adivinanzas.");
		int intentos = pedirIntento();
		
		System.out.println(intentos);
		int rangoMax = (int) (intentos * 1.5);
		System.out.println("El número se encontrará entre el 0 y el " + rangoMax +".");
		int numMaquina = generarNumero(rangoMax);
		
		System.out.println("La máquina ha elegido su número: DEVELOPER-> " + numMaquina);
		System.out.println("Ahora es su turno de adivinar:");
		evaluarIntento(intentos, numMaquina);
	}
	
	
	public static int pedirIntento()
	{
		System.out.println("Por favor, introduzca el número de intentos para el juego: ");
	
		int solicitud = new Scanner(System.in).nextInt();
		return solicitud;
	}
	
	public static int generarNumero(int rangoMax)
	{
		int numAleatorio = (int)(Math.random()*rangoMax);
		return numAleatorio;
	}
	public static void evaluarIntento(int intentos, int numMaquina)
	{
		do
		{	
			System.out.println("Introduzca un número dentro del rango establecido:");
			int numUsuario =  new Scanner(System.in).nextInt();
			if ( numUsuario== numMaquina)
			{
				System.out.println("Enhorabuena, ha ganado.");
				break;
			}
			else 
			{
				intentos--; 
				System.out.println("Incorrecto. Intentos restantes: " + intentos);
			}
		}while (intentos > 0);
		if (intentos == 0) 
		{
			System.out.println("Ha perdido. El número de la CPU era " + numMaquina + ". Más suerte a la próxima.");
		}
	}
}
