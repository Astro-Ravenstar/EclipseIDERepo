package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion116 
{
	public static void main(String[]args) 
	{
		int segundoUsuario, segundoFinal, minutoFinal, horaFinal;
		Scanner sc = new Scanner (System.in);
		System.out.println("Por favor, introduzca la cantidad de segundos que desea convertir: ");
		segundoUsuario = sc.nextInt();
		sc.close();
		
		minutoFinal=segundoUsuario/60;
		
		segundoFinal=segundoUsuario%60;
		
		horaFinal=minutoFinal/60;
		
		minutoFinal=minutoFinal%60;
		
		System.out.println("Horas: " + horaFinal + ", Minutos: " + minutoFinal+ ", Segundos: " + segundoFinal);
		
	}
}
