package unidad2.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion219 
{
	public static void main(String[]args)
	{
		float grados;
		double rad;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca los grados de su ángulo:");
		grados = sc.nextFloat();
		sc.close();
		grados = grados%360==0 ? grados : grados%360;
		rad = grados*Math.PI/180;
		System.out.println("Sus grados equivalen a " +rad +" radianes");
	}
}
