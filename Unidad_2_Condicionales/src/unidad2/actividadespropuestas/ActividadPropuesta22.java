package unidad2.actividadespropuestas;
import java.util.Scanner;
public class ActividadPropuesta22 
{
	public static void main(String[]args)
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el valor de x:");
		x = sc.nextInt();
		sc.close();
		System.out.println("¿Es su número positivo?");
		System.out.println(x>0 ? "True" : "False");
	}
}