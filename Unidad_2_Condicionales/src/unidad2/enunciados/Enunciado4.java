package unidad2.enunciados;
import java.util.Scanner;
public class Enunciado4 
{
	public static void main(String[]args) 
	{
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entero del 1 al 10");
		numero = sc.nextInt();
		sc.close();
		switch (numero) 
		{
			case 1,3,5,7,9->
			{
				System.out.println("Impar");
			}
			case 2,4,6,8,10->
			{
				System.out.println("Par");
			}
			default->
			{
				System.out.println("Error");
			}
		}
	}
}
