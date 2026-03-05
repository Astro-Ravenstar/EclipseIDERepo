package astrojava;

import java.util.Objects;

public class Planeta extends CuerpoCeleste{

	private String atmosfera;
	

	public Planeta(String nombre, double radio, double masa, double velocidad, double distancia, double temperatura,
			String atmosfera) {
		super(nombre, radio, masa, velocidad, distancia, temperatura);
		this.atmosfera = atmosfera;
	}

	
	
	public String getAtmosfera() {
		return atmosfera;
	}

	public void setAtmosfera(String atmosfera) {
		this.atmosfera = atmosfera;
	}



	@Override
	public String toString() {
		return "Planeta [atmosfera=" + atmosfera + "," + super.toString() + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(atmosfera);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Planeta other = (Planeta) obj;
		return Objects.equals(atmosfera, other.atmosfera);
	}
	
	





	
	
	

}
