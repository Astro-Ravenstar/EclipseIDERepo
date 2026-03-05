package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion121 
{
	public static void main (String[]args)
	
	{
		int numeroPrimer, numeroSegun;
		boolean igualdad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero: ");
		numeroPrimer = sc.nextInt();
		System.out.println("Introduzca ahora el segundo numero: ");
		numeroSegun = sc.nextInt();
		sc.close();
		igualdad = numeroPrimer == numeroSegun;
		System.out.println("¿Son sus números iguales?: " + igualdad);
	}
}
