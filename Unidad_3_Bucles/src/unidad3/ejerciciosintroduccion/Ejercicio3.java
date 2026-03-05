package unidad3.ejerciciosintroduccion;
import java.util.Scanner;
public class Ejercicio3 
{
	public static void main(String[]args)
	{
		int userNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número entero.");
		userNum = sc.nextInt();
		do 
		{
			System.out.println(userNum + " es un buen número, si señor. Si quiere finalizar el programa, por favor introduzca 0.");
			System.out.println("Si no, introduzca cualquier número entero.");
			userNum = sc.nextInt();
		}while(userNum != 0);
		sc.close();
		System.out.println("El programa ha finalizado.");
	}
}
