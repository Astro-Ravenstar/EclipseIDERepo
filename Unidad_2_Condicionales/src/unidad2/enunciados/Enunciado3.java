package unidad2.enunciados;
import java.util.Scanner;
public class Enunciado3 
{
	public static void main(String[]args)
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número entero");
		x = sc.nextInt();
		sc.close();
		if (x>0)
		{
			System.out.println("Positivo");
			if (x%2==0) 
			{
				System.out.println("Par");
			}
			else
			{
				System.out.println("Impar");
			}
		}
		else if (x==0)
		{
			System.out.println("Cero");
		}
		else 
		{
			System.out.println("Negativo");
		}
	}
}
