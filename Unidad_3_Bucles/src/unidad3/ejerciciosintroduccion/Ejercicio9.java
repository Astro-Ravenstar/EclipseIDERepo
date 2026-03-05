package unidad3.ejerciciosintroduccion;

public class Ejercicio9 {

	public static void main(String[] args) 
	{
		/*MEDIANTE CONTADOR*/
		
		for(int number = 1; number <= 50; number++)
		{
			int divisores = 0;
			
			for( int divider = 1; divider <= number ; divider++)
			{	
				if(number % divider == 0) {divisores ++;};	
			}		
			if(divisores == 2) {System.out.println(number);}
		}
		
		/*MEDIANTE BANDERA*/
		
		boolean isPrime;
		for( int numero = 1; numero <= 50; numero++)
		{
			isPrime = true;
			for(int divisor = 2; divisor < numero; divisor++)
			{
				if(numero % divisor == 0) {isPrime = false; break;}
			}
			if(isPrime) {System.out.println(numero);}
		}
	}
}
