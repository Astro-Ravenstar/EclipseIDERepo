package unidad2.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion214 
{
	public static void main(String[]args)
	{
		int userNum, decenas, unidades;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número comprendido entre 1 y 99");
		userNum = sc.nextInt();
		sc.close();
		unidades = userNum % 10;
		decenas = (userNum - unidades) / 10;
		System.out.println("");
		if (userNum >= 1 && userNum <= 99 )
		{
			if (userNum >= 10 && userNum <= 15 || userNum == 20 )
			{
				switch (userNum)
				{
				case 10 -> System.out.print("Diez");
				case 11 -> System.out.print("Once");
				case 12 -> System.out.print("Doce");
				case 13 -> System.out.print("Trece");
				case 14 -> System.out.print("Catorce");
				case 15 -> System.out.print("Quince");
				case 20 -> System.out.print("Veinte");
				}
			}
			else 
			{
				switch (decenas)
				{
					case 1 -> System.out.print("Dieci");
					case 2 -> System.out.print("Veinti");
					case 3 -> System.out.print("Treinta");
					case 4 -> System.out.print("Cuarenta");
					case 5 -> System.out.print("Cincuenta");
					case 6 -> System.out.print("Sesenta");
					case 7 -> System.out.print("Setenta");
					case 8 -> System.out.print("Ochenta");
					case 9 -> System.out.print("Noventa");
				}
				if (unidades != 0 && decenas != 2 && decenas != 1)
				{
					System.out.print(" y ");
				}
				switch (unidades)
				{
					case 1 -> System.out.print("uno");
					case 2 -> System.out.print("dos");
					case 3 -> System.out.print("tres");
					case 4 -> System.out.print("cuatro");
					case 5 -> System.out.print("cinco");
					case 6 -> System.out.print("seis");
					case 7 -> System.out.print("siete");
					case 8 -> System.out.print("ocho");
					case 9 -> System.out.print("nueve");
				}
			}
		}
		else 
		{
			System.out.println("Error: valor fuera de los parámetros establecidos.");
		}
	}
}
