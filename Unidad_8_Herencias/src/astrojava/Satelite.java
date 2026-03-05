package astrojava;

import java.util.Objects;

public class Satelite extends CuerpoCeleste{

	private float periodo;

	public Satelite(String nombre, double radio, double masa, double velocidad, double distancia, double temperatura,
			float periodo) {
		super(nombre, radio, masa, velocidad, distancia, temperatura);
		this.periodo = periodo;
	}

	
	public float getPeriodo() {
		return periodo;
	}

	public void setPeriodo(float periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
		return "Satelite [periodo=" + periodo + "," + super.toString() + "]";
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
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Satelite)) {
			return false;
		}
		Satelite other = (Satelite) obj;
		return (this.periodo) == (other.periodo);
	}
	
	
	

	
	
}
