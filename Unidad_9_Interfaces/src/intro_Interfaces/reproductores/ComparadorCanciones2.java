package intro_Interfaces.reproductores;
import java.util.Comparator;
public class ComparadorCanciones2 implements Comparator<Cancion>{
	
	@Override
	public int compare(Cancion c1, Cancion c2) {
		
//		if (c1.getTitulo().compareTo(c2.getTitulo()) > 0) {
//			return 1;
//		}
//		else if (c1.getTitulo().compareTo(c2.getTitulo()) < 0) {
//			return -1;
//		}
//		else return 0;
		
		return c1.getTitulo().compareTo(c2.getTitulo());
		
	}
}


