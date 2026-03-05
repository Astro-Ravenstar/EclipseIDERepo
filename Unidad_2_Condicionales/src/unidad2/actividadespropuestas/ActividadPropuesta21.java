package unidad2.actividadespropuestas;
import java.util.Scanner;
public class ActividadPropuesta21 
{
	public static void main(String[]args)
	{
		int x, y;
		boolean boolA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el valor de x:");
		x = sc.nextInt();
		System.out.println("Por favor, introduzca el valor de y:");
		y = sc.nextInt();
		sc.close();
		
		System.out.println("Evaluación relacional x == y:");
		boolA = x == y;
		System.out.println( x + " = " + y + " es " + boolA );
		
		System.out.println("Evaluación relacional x != y:");
		boolA = x != y;
		System.out.println( x + " != " + y + " es " + boolA );
		
		System.out.println("Evaluación relacional x < y:");
		boolA = x < y;
		System.out.println( x + " < " + y + " es " + boolA );
		
		System.out.println("Evaluación relacional x <= y:");
		boolA = x <= y;
		System.out.println( x + " <= " + y + " es " + boolA );
		
		System.out.println("Evaluación relacional x > y:");
		boolA = x > y;
		System.out.println( x + " > " + y + " es " + boolA );
		
		System.out.println("Evaluación relacional x >= y:");
		boolA = x >= y;
		System.out.println( x + " >= " + y + " es " + boolA );
	}
}
