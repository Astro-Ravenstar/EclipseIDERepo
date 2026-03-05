package intro_Interfaces.reproductores;
import java.util.ArrayList;
import java.util.Collections;
public class PruebaArrayList {
	public static void main(String[]args) {
		
		ArrayList <Cancion> listaCanciones = new ArrayList <Cancion> ();
//		Cancion cancion = new Cancion("Plastic Beach", 240, "Bla bla bla ...");

//		listaCanciones.add(cancion);
		
//		listaCanciones.clear();
		
		listaCanciones.add(new Cancion("Melancholy Hill",300, "Bla bla bla ..."));
		listaCanciones.add(new Cancion("DARE", 280, "Bla bla bla ..."));
		listaCanciones.add(new Cancion("Tomorrow Comes Today", 290, "Bla bla bla ..."));
		
		System.out.println(listaCanciones);
		
//		Collections.sort(listaCanciones);
		listaCanciones.sort(new ComparadorCanciones());
		
		System.out.println(listaCanciones);
	}
}
