package naviera;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
//		int edad;
//		String nombre;
		
		Barco barco1;
		//Barco barco2;
		String tipoBarco = new Scanner(System.in).next();
		
		barco1 = new Barco(269.0F, 28.19F, 52310, 21, "Titanic", Tipo.valueOf(tipoBarco));
		
		//barco2 = new Barco();
		
//		barco1.ancho = 77;	
//		System.out.printf("El barco mide de largo: %.2f.\n", barco1.largo);
//		System.out.printf("El barco mide de ancho: %.2f.\n", barco1.ancho);

		barco1.imprimir();
		//barco2.imprimir();
		
		//barco2.setLargo(250);
		//System.out.println(barco2.toString());
		
		
	}

}
