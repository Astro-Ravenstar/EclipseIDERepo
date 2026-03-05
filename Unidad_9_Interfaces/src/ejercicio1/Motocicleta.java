package ejercicio1;

public class Motocicleta extends Vehiculo{

	public Motocicleta(float combustible, int pasajeros, int ruedas) {
		super(combustible, pasajeros, ruedas);
	}

	@Override	
	public void arrancar() {	
		System.out.println("Estoy arrancando la moto.");
	}
	
	public void hacerCaballito() {
		System.out.println("Estoy haciendo un caballito.");
	}

}
