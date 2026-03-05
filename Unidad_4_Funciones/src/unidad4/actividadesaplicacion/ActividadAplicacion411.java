package unidad4.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion411 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double radioUser;
		System.out.println("Por favor, introduzca el radio en cm de la esfera que desea analizar:");
		radioUser = sc.nextDouble();
		sc.close();
		calculosEsfera(radioUser);	
	}
	public static void calculosEsfera(double radio) 
	{
		double superficie, volumen;
		superficie = 4*Math.PI*Math.pow(radio, 2);
		volumen = (4*Math.PI/3)*Math.pow(radio, 3);
		System.out.println("Superficie:" + superficie + " cm^2");
		System.out.println("Volumen:" + volumen  + " cm^3");
	}
}
