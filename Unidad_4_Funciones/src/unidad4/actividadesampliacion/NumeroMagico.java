package unidad4.actividadesampliacion;
import java.util.Scanner;
public class NumeroMagico 
{
	public static void main(String[]args)
	{
		System.out.println("Bienvenido al programa del número mágico");
		String decision;
		do 
			{
			int max= 1, min = 1; 
			
			do 
			{
				System.out.println("La CPU elegirá una cantidad de números que usted eliga, entre el 1 y el 10");
				max = new Scanner(System.in).nextInt();
				if (max <= 0) {System.out.println("Por favor, introduzca un valor válido.");}
			}while(max <= 0);
			
			int indiceMagico = (int)(Math.random() * (max-min)+1);	
			int numeroMagico = -1;
			System.out.println("Muy bien, habrá " + max + " números entre los que se encuentra el número mágico");
			
			
			for(int i = 1; i<= max; i++)
			{
				int n = (int)(Math.random() * (10));
				System.out.print(n + " ");
				if (i == indiceMagico) 
				{
					numeroMagico = n;
				}	
			}
			
			System.out.println("DEVELOPER-> " + numeroMagico);
			System.out.println("¿Cuál crees que es el número mágico?");
			
			if(new Scanner(System.in).nextInt() == numeroMagico)
			{
				System.out.println("¡Acertaste!");
			} else {System.out.println("Fallaste, era " + numeroMagico + ".");}
			
			System.out.println("¿Quieres volver a jugar? (Si o No)");
			decision = new Scanner(System.in).nextLine();
			
			}	while(decision.equalsIgnoreCase("Si"));
		
		System.out.println("Chao pescao.");
	}
}
