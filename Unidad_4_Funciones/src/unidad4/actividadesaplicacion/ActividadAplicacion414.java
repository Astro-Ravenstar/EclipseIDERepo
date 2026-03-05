package unidad4.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion414 {

	public static void main(String[] args) 
	{
		int userDias, userHoras, userMinutos;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad de días a contabilizar:");
		userDias = sc.nextInt();
		System.out.println("Introduzca la cantidad de horas a contabilizar:");
		userHoras = sc.nextInt();
		System.out.println("Introduzca la cantidad de minutos a contabilizar:");
		userMinutos = sc.nextInt();
		sc.close();
		System.out.println("Segundos totales: " + calculoSegundos(userDias, userHoras, userMinutos));
	}
	public static int calculoSegundos(int dias, int horas, int minutos)
	{
		int segundos = ((dias * 86400) + (horas * 3600) + (minutos * 60));
		return segundos;
	}
}
