package astronomia_clase;

public class Planeta extends CuerpoCeleste{

	private String atmosfera;
	
	public Planeta(double radio) {
		super(radio);

	}

	public Planeta(String nombre, double radio, double masa, double velocidad, double distancia, double temperatura, String atmosfera) {
		super(nombre, radio, masa, velocidad, distancia, temperatura);
		this.atmosfera = atmosfera;

	}
	
	

	
	
}
