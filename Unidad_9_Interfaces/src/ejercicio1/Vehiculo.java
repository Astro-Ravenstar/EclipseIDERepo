package ejercicio1;

import java.util.Objects;

public abstract class Vehiculo implements Comparable<Vehiculo> {
	
	protected float combustible;
	protected int pasajeros;
	protected int ruedas;
	
	public Vehiculo(float combustible, int pasajeros, int ruedas) {
		this.combustible = combustible;
		this.pasajeros = pasajeros;
		this.ruedas = ruedas;
	}
	
	public int compareTo(Vehiculo otro) {
		if(this.pasajeros > otro.pasajeros)		 	return 1;
		else if (this.pasajeros < otro.pasajeros) 	return -1;
		else 										return 0;
//		return (Integer.compare(this.pasajeros, otro.pasajeros));
	}
	
	public void arrancar() {
		System.out.println("Estoy aparcando el vehículo.");
	}

	@Override
	public String toString() {
		return "Vehiculo [combustible=" + combustible + ", pasajeros=" + pasajeros + ", ruedas=" + ruedas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(combustible, pasajeros, ruedas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Vehiculo)) {
			return false;
		}
		Vehiculo other = (Vehiculo) obj;
		return Float.floatToIntBits(combustible) == Float.floatToIntBits(other.combustible)
				&& pasajeros == other.pasajeros && ruedas == other.ruedas;
	}

	public float getCombustible() {
		return combustible;
	}

	public void setCombustible(float combustible) {
		this.combustible = combustible;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getNumRuedas() {
		return ruedas;
	}

	public void setNumRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	
	
}
