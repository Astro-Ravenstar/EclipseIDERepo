package unidad3.ejerciciosintroduccion;
import java.util.Scanner;
public class Ejercicio6
{
	public static void main(String[]args)
	{
		int userNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número entero para realizar su tabla de multiplicar, del 1 al 10");
		userNum = sc.nextInt();
		sc.close();
		for(int counter = 1; counter < 11; counter ++ )
		{
			System.out.println(userNum + "*" + counter + "=" + (userNum * counter));
		}
	}
}