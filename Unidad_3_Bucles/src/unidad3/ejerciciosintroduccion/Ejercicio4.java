package unidad3.ejerciciosintroduccion;
import java.util.Scanner;
public class Ejercicio4 
{
	public static void main(String[]args)
	{
		int userNum1 = 0, userNum2 = 0;
		Scanner sc = new Scanner(System.in);
		while(userNum1 >= 0 && userNum2 >= 0)
			{			
				System.out.println("Por favor, introduzca el primer número entero.");
				userNum1 = sc.nextInt();
				if(userNum1 < 0) {break;}
				System.out.println("Por favor, introduzca ahora el segundo número entero.");
				userNum2 = sc.nextInt();
				if(userNum2 < 0) {break;}
				System.out.println("La suma de sus números es: " + (userNum1+userNum2));
			}
		sc.close();
		System.out.println("Al introducir un número negativo, el programa termina.");
	}
}
