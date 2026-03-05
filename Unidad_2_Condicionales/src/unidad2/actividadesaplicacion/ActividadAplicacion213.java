package unidad2.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion213 
{
	public static void main(String[]args)
	{
		int numAnimales;
		float comidaDiaria, kilosPorAnimal, comidaAjustada;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca la cantidad de animales a alimentar:");
		numAnimales = sc.nextInt();
		System.out.println("Por favor, introduzca ahora la cantidad de comida (kg) de los que dispone:");
		comidaDiaria = sc.nextFloat();
		System.out.println("Por último, introduzca la media de kg de alimento que consume cada animal:");
		kilosPorAnimal = sc.nextFloat();
		sc.close();
		if(numAnimales > 0)
		{	
			if(comidaDiaria >= kilosPorAnimal*numAnimales)
			{	
				System.out.println("La cantidad de comida actual es suficiente para alimentar a todos los animales:");
			}
			else
			{
				comidaAjustada = comidaDiaria/numAnimales;
				System.out.println("La cantidad de comida no es suficiente para satisfacer "
						+ "la media introducida. Aquí tiene la cantidad ajustada: " + comidaAjustada + " kg/animal");
			}
		}
		else {System.out.println("Si no tiene animales, ¡busque algunos!");}
	}
}
