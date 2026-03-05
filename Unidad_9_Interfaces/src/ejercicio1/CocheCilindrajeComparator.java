package ejercicio1;

import java.util.Comparator;

public class CocheCilindrajeComparator implements Comparator<Coche>{

	@Override
	public int compare(Coche o1, Coche o2) {
		return Integer.compare(o1.getCilindraje(), o2.getCilindraje());
	}
}
