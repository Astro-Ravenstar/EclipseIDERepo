package unidad2.enunciados;
import java.util.Scanner;
public class Enunciado5 
{
	public static void main(String[]args) 
	{
		int numero;
		Scanner sc = new Scanner(System.in);
		String paridad = "";
		System.out.println("Introduzca un número entero del 1 al 10");
		numero = sc.nextInt();
		sc.close();
		paridad = switch (numero) 
		{
			case 1,3,5,7,9->
			{
				yield "Impar";
			}
			case 2,4,6,8,10->
			{
				yield "Par";
			}
			default->
			{
				yield "Error";
			}
		};
		System.out.println(paridad);		
	}
}
