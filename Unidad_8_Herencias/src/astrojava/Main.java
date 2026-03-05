package astrojava;

public class Main {

	public static void main(String[] args) {
//		Esfera e = new Esfera(3.5);
		
//		CuerpoCeleste cuerpoCeleste = new CuerpoCeleste("La Luna de Jupiter",2.0, 125, 10, 9999, 345);
//		System.out.println(cuerpoCeleste);
		
	
		Planeta planeta= new Planeta("La Tierra", 4500, 98765, 100, 123455, 29, "not to bad");
		Satelite satelite= new Satelite("La Luna", 800, 23413, 345, 380000, -34, 28);
		
//		System.out.println(planeta);
//		System.out.println(satelite);
		
		//CuerpoCeleste ccs [] = {planeta , satelite};
		
		CuerpoCeleste ccs [] = new CuerpoCeleste[2];
		ccs[0]=planeta;
		ccs[1]=satelite;
		
		// polimorfismo din�mico en ejecuci�n
		for(int i = 0; i< ccs.length; i++) {
			System.out.println( ccs[i].toString() );
			//ccs[i].getAtmosfera();
			
//			if(  (ccs[i].getClass()).equals(Planeta.class)   ) 
//			{
//			   System.out.println(     ( (Planeta) ccs[i]).getAtmosfera()      );
//			}
		}
		
		Punto a = new Punto(2, 3);
		Punto b = new Punto(4, 3);
		
		System.out.println(  a.equals(b) ? "TRUE" : "False" );
		
	}

}




