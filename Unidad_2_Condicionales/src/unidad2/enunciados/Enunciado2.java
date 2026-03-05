package unidad2.enunciados; 
import java.util.Scanner;
public class Enunciado2
{
	public static void main(String[]args)
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número entero");
		x = sc.nextInt();
		sc.close();
		if (x%2==0) 
		{
			System.out.println("Par");
		}
		else
		{
			System.out.println("Impar");
		}
	}
}
