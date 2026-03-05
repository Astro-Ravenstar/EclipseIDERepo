package unidad4.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion419 {

	public static void main(String[] args) 
	{
		int userQuantity;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de números aleatorios que desee generar:");
		userQuantity = sc.nextInt();
		sc.close();
		randomNumbers(userQuantity);
	}
	public static void randomNumbers(int quantity)
	{
		if(quantity == 0) 
		{ 
			System.out.println("Finalizado");
		}
		else 
		{ 
			System.out.println(Math.random());
			randomNumbers(quantity - 1);
		}
	}
}
