package astronomia_clase;

import java.util.Objects;

public class Satelites extends CuerpoCeleste{

	private float periodo;

	public Satelites(String nombre, double radio, double masa, double velocidad, double distancia, double temperatura) {
		super(nombre, radio, masa, velocidad, distancia, temperatura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(periodo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Satelites)) {
			return false;
		}
		Satelites other = (Satelites) obj;
		return Float.floatToIntBits(periodo) == Float.floatToIntBits(other.periodo);
	}
	
	
	
}
