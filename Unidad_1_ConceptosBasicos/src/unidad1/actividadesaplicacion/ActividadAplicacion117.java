package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion117 
{
	public static void main(String[]args) 
	
	{
		float userMm, userCm, userM, outCm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca en orden de mm, cm y m, los valores que desee convertir, separados por la tecla |enter|: ");
		userMm = sc.nextFloat();	
		userCm = sc.nextFloat();
		userM = sc.nextFloat();
		sc.close();
		outCm= userMm/10 + userCm + userM*100;
		System.out.println("La suma de sus valores en magnitud cm es: " + outCm);
	}
}
