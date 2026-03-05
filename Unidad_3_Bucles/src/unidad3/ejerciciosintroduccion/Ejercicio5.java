package unidad3.ejerciciosintroduccion;
import java.util.Scanner;
public class Ejercicio5
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		for(int num = 1; num <= 20; num++)
		{
			
			System.out.println(num);
			if(num==20) {break;}
			System.out.println("Si desea detener el programa, escriba 'parar'. En caso contrario, pulse [ENTER]");
			String userInput = sc.nextLine();
			if(userInput.contains("parar")) {break;}
		}
		sc.close();
		System.out.println("El programa se ha detenido");
	}
}