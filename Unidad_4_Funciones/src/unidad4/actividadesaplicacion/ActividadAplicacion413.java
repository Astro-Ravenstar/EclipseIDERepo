package unidad4.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion413 {

	public static void main(String[] args) 
	{
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el valor de n, para calcular los primeros n números pares");
		number = sc.nextInt();
		muestraPares(number);
		sc.close();
		
	}
	public static void muestraPares(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			if (i % 2 == 0) {System.out.println(i);}
			/* else {System.out.println("Impar");} */
		}
	}
}
