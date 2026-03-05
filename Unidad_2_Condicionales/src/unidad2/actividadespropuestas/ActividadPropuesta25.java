package unidad2.actividadespropuestas;
import java.util.Scanner;
public class ActividadPropuesta25 
{	
	public static void main(String[]args)
	{	
		int aforoMax, entradasVendidas;
		float precioEntrada;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el aforo máximo del local:");
		aforoMax = sc.nextInt();
		System.out.println("Por favor, introduzca ahora el precio por cada entrada en €:");
		precioEntrada = sc.nextFloat();
		System.out.println("Por favor, introduzca ahora la cantidad de entradas vendidas:");
		entradasVendidas = sc.nextInt();  
		sc.close();
		if(entradasVendidas >= 20*aforoMax/100 && entradasVendidas < 50*aforoMax/100) 
		{
			precioEntrada = precioEntrada*50/100;
			System.out.println("Las entradas vendidas no superan el 50% del aforo máximo, por lo que se aplica un 50% de descuento por entrada")	;
			System.out.println("El precio actual de cada entrada, tras el descuento, es de " + precioEntrada +"€.")	;

		}
		else if(entradasVendidas < 20*aforoMax/100) 
		{
			System.out.println("Las entradas vendidas no superan el 20% del aforo máximo, por lo que el concierto queda cancelado")	;
		}
		else
		{
			System.out.println("Todo está en orden");
		}
	}
}