package astronomia_clase;

public class CuerpoCeleste extends Esfera{
	
	protected double masa;
	protected double velocidad;
	protected double distancia;
	protected double temperatura;
	protected String nombre;

	public CuerpoCeleste(String nombre, double radio, double masa, double velocidad, double distancia, double temperatura) {
		super(radio);
		this.nombre = nombre;
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
		return (4.0/3.0)*Math.PI*Math.pow(radio, 3);
	}

	@Override
	public String toString() {
		return "CuerpoCeleste [masa=" + masa + ", velocidad=" + velocidad + ", distancia=" + distancia
				+ ", temperatura=" + temperatura + "," + super.toString() + "]";
	}
	
	
	
}
