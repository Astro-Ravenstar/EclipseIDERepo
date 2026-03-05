package unidad1.actividadesaplicacion;

import java.util.Scanner;

public class ActividadAplicacion112

{
	
public static void main (String [] args)
	
	{
		int digit, cas, resultado;
		Scanner sc = new Scanner (System.in);
		System.out.println ("Introduzca el número que desee comprobar: ");
		digit = sc.nextInt ();
		sc.close();
		cas = ( 7 - ( digit % 7 ) ) % 7;
		resultado = digit + cas;
		System.out.println("Su número necesita " + cas + " unidades para ser múltiplo de 7");
		System.out.print("Se convertirá en el número " +resultado );
		
	}

}