package unidad4.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion418 {

	public static void main(String[] args) 
	{
		int userQuantity, userMin, userMax;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de números aleatorios que desee generar:");
		userQuantity = sc.nextInt();
		System.out.println("Introduzca el valor mínimo que podrán alcanzar:");
		userMin = sc.nextInt();
		System.out.println("Introduzca el valor máximo que podrán alcanzar:\"");
		userMax = sc.nextInt();
		sc.close();
		randomNumbers(userQuantity, userMin, userMax);
	}
	public static void randomNumbers(int quantity, int min, int max)
	{
		for(int i = 0; i < quantity; i++)
		{
			int number = (int)(Math.random()*((max-min)+1));
			System.out.println(number);
		}	
	}
}
