package astronomia_clase;

public class Main {

	public static void main(String[] args) {

		CuerpoCeleste cuerpoCeleste = new CuerpoCeleste("Luna",2.0, 125, 10, 9999, 345);
		System.out.println(cuerpoCeleste);
		
		Planeta planeta = new Planeta("Tierra", 1,2,3,4,5,"Aire");
		CuerpoCeleste cc;
		cc = planeta;
		Planeta p;
		
		
	}

}
