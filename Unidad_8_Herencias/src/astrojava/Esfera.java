package astrojava;

import java.util.Objects;

// No se puede instanciarar objetos de clase Esfera ( Esfera e = new Esfera(); )
public abstract class Esfera {
	
	protected double radio;
	private Punto punto;
	
	protected Esfera(double radio, Punto punto){
		this.radio=radio;
		this.punto=punto;
	}
	
	protected Esfera(double radio){
		this.radio=radio;
		punto = new Punto(0, 0);
	}
	
	public Esfera() {
		radio=0;
		punto = new Punto(0, 0);
	}

	public abstract double getDiametro();
	public abstract double getVolumen();
		
	
	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}

	@Override
	public String toString() {
		return "Esfera[radio:" + radio+"]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(punto, radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Esfera)) {
			return false;
		}
		Esfera other = (Esfera) obj;
		return Objects.equals(punto, other.punto)
				&& Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Esfera esfera = (Esfera) obj;
//		if(this.radio == esfera.radio && this.punto.equals( esfera.punto ))
//			return true;
//		else
//			return false;
//	}
	
	
	
}
