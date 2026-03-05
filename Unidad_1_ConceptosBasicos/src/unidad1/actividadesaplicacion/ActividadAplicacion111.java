package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion111
{

	public static void main(String[]args)	
	{
		float baseImponible, importeTotal, importeIva;
		int iva;
		Scanner sc = new Scanner(System.in);
		System.out.println ("Introduzca la base imponible: ");
		baseImponible = sc.nextFloat();
		System.out.println ("Introduzca el IVA: ");
		iva = sc.nextInt();
		sc.close();
		importeTotal = (100+iva)*baseImponible/100;
		importeIva = (importeTotal-baseImponible);
		System.out.println ("El importe total es: " +importeTotal +",correspondiendo al IVA:" + importeIva);
	}
}
