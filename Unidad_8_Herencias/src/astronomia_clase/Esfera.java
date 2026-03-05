package astronomia_clase;

//No se pueden instanciar objetos de clase Esfera (Esfera e = new Esfera())
public abstract class Esfera {

	protected double radio;
	
	
	protected Esfera (double radio) {
		this.radio = radio;
	}
	
	public abstract double getDiametro();
	public abstract double getVolumen();
	
	@Override
	public String toString() {
		return "Esfera[radio: " +radio+ "]";
		
		
	}
}
