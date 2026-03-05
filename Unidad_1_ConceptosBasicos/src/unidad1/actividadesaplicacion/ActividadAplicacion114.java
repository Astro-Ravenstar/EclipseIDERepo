package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion114 
{
	public static void main(String[]args) 
	{
		float altura, base, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca la altura deseada: ");
		altura=sc.nextInt();
		System.out.println("Por favor, introduzca la base deseada: ");
		base=sc.nextInt();
		sc.close();
		area=base*altura/2;
		System.out.println("El área de su triángulo es: " +area);
	}
}
