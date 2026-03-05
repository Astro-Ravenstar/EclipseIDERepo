package unidad4.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion412 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2;
		System.out.println("Por favor, introduzca en orden los 4 valores (x1, y1) y (x2, y2) para el cálculo de la distancia euclídea:");
		x1 = sc.nextDouble(); y1 = sc.nextDouble(); x2 = sc.nextDouble(); y2 = sc.nextDouble();
		sc.close();
		System.out.println("La distancia resultante es: " + distancia(x1, y1, x2, y2));
	}
	public static double distancia(double x1, double y1, double x2, double y2) 
	{
		double distancia = Math.sqrt(Math.pow((x1-x2), 2)+ Math.pow((y1-y2), 2));
		return distancia;
	}
}
