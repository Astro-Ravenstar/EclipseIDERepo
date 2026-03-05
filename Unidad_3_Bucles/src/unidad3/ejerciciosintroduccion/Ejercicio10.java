package unidad3.ejerciciosintroduccion;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al programa de las adivinanzas.");
		int counter;
		for(counter = 5; counter > 0; counter--)
		{
			int guess = (int)(Math.random()*(11));
			if(counter == 5) {System.out.println("El programa ha elegido un número del 1 al 10. Intente adivinarlo en 5 intentos.");}
			else {System.out.println("Inténtelo de nuevo. Número de intentos:" + counter);}
			int userInput = sc.nextInt();
			if (userInput == guess) {System.out.println("Enhorabuena, ha acertado."); sc.close(); break;} 
		}	
		if(counter == 0) {System.out.println("Game Over.");}
	}	
}
