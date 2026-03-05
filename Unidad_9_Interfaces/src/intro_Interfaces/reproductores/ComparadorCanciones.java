package intro_Interfaces.reproductores;

import java.util.Comparator;

public class ComparadorCanciones implements Comparator<Cancion>{

	@Override
	public int compare(Cancion c1, Cancion c2) {
		
		if (c1.getSegundos() > c2.getSegundos()) {
			return 1;
		}
		else if (c1.getSegundos() < c2.getSegundos()) {
			return -1;
		}
		else return 0;
	}


}
