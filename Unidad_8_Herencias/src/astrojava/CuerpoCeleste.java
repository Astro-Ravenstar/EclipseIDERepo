package astrojava;

import java.util.Objects;

public class CuerpoCeleste extends Esfera {

	protected String nombre;
	protected double masa;
	protected double velocidad;
	protected double distancia;
	protected double temperatura;
	
	
	
	public CuerpoCeleste() {
		super();
	}
	
	public CuerpoCeleste(String nombre, double radio, double masa, double velocidad, double distancia, double temperatura) {
		super(radio);
		this.nombre=nombre;
		this.masa = masa;
		this.velocidad = velocidad;
		this.distancia = distancia;
		this.temperatura = temperatura;
	}

	public CuerpoCeleste(double radio) {
		super(radio);
	}

	@Override
	public double getDiametro() {
		return radio*2;
	}

	@Override
	public double getVolumen() {
		return (4.0/3.0)*Math.PI*radio*radio*radio;
	}

	@Override
	public String toString() {
		return "CuerpoCeleste [nombre="+nombre+", masa=" + masa + ", velocidad=" + velocidad + ", distancia=" + distancia
				+ ", temperatura=" + temperatura + "," + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(distancia, masa, nombre, temperatura, velocidad);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof CuerpoCeleste)) {
			return false;
		}
		CuerpoCeleste other = (CuerpoCeleste) obj;
		return Double.doubleToLongBits(distancia) == Double.doubleToLongBits(other.distancia)
				&& Double.doubleToLongBits(masa) == Double.doubleToLongBits(other.masa)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(temperatura) == Double.doubleToLongBits(other.temperatura)
				&& Double.doubleToLongBits(velocidad) == Double.doubleToLongBits(other.velocidad);
	}
	
//	@Override
//	public boolean equals(Object obj ) {
//		CuerpoCeleste cuerpoCeleste = (CuerpoCeleste) obj;
//		if(super.equals(obj)) {
//			if( this.nombre.equals(cuerpoCeleste.nombre)  &&
//				this.distancia == cuerpoCeleste.distancia &&
//				this.masa == cuerpoCeleste.masa &&
//				this.radio == cuerpoCeleste.radio &&
//				this.temperatura == cuerpoCeleste.temperatura ) {
//				return true;
//			}
//			else {
//				return false;
//			}
//		}
//		else {
//			return false;
//		}
//	}
	
	
	
}
