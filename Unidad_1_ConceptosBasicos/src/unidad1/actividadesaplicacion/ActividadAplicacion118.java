package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion118 
{
	public static void main(String[]args)
	
	{
		 int hormigas, aranas, cochinillas, totalPatas;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Por favor, introduzca en orden el total de hormigas, arañas y cochinillas, separados por la tecla |enter|: ");
		 hormigas = sc.nextInt();
		 aranas = sc.nextInt();
		 cochinillas = sc.nextInt();
		 sc.close();
		 totalPatas = hormigas * 6 + aranas * 8 + cochinillas * 14;
		 System.out.println("El total de patas es de: " + totalPatas);
	}
}
