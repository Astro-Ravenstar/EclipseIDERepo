package unidad2.enunciados;
import java.util.Scanner;
public class Enunciado1 
{
	public static void main(String[]args)
	{
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, introduzca un número entero");
		x = sc.nextInt();
		sc.close();
		System.out.println(x%2==0 && !(x%3==0) ? "mens1" : "mens2"); 
	}
}
