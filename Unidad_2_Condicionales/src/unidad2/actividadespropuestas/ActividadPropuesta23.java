package unidad2.actividadespropuestas;
import java.util.Scanner;
public class ActividadPropuesta23 
{
	public static void main(String[]args)
	{
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el valor de x, siendo x entero:");
		x = sc.nextInt();
		System.out.println("Por favor, introduzca el valor de y, siendo y entero:");
		y = sc.nextInt();
		sc.close();
		
		System.out.println( x != y || x==0 || y==0 ? "True" : "False");
	
	}
}