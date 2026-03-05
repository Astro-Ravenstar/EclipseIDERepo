package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion119 
{
	public static void main (String[]args)
	
	{
		int entradaAdulto, entradaInfantil;
		float precioBase, precioDescuento, totalAhorrado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca la cantidad de entradas de adulto que desea: ");
		entradaAdulto = sc.nextInt();
		System.out.println("Muy bien, introduzca esta vez la cantidad de entradas infantiles que desea: ");
		entradaInfantil = sc.nextInt();
		sc.close();
		precioBase = (float) (entradaAdulto * 20 + entradaInfantil * 15.50);
		precioDescuento = precioBase < 100 ? precioBase : precioBase * 95 / 100 ;
		totalAhorrado = precioBase - precioDescuento;
		System.out.println("El precio total, tras aplicar descuento si lo hubiese, suma: " + precioDescuento +" €, habiendo ahorrado: " + totalAhorrado +" €.");	
	}
}
