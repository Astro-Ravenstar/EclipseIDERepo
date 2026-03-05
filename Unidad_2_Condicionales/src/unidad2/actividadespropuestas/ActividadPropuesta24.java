package unidad2.actividadespropuestas;
import java.util.Scanner;
public class ActividadPropuesta24 
{	
	public static void main(String[]args)
	{	
		int mult, valorUser;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca el número sobre el que desea realizar la comprobación:");
		mult = sc.nextInt();
		System.out.println("Por favor, introduzca ahora el número sobre el que desea comprobar la multiplicidad:");
		valorUser = sc.nextInt();
		sc.close();
	
		System.out.println( mult%valorUser==0 ? "True" : "False");
	}
}