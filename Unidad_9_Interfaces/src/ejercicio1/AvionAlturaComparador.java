package ejercicio1;

import java.util.Comparator;

public class AvionAlturaComparador implements Comparator<Avion>{

	@Override
	public int compare(Avion o1, Avion o2) {
		return Float.compare(o1.getAltura(), o2.getAltura());
	}

}
