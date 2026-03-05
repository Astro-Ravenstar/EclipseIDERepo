package naviera;

public class Barco {

	// ATRIBUTOS
	float largo;
	float ancho;
	float peso;
	int velocidad;
	String modelo;
	Tipo tipo;
	
	// MÉTODOS (FUNCIONALIDAD, ACCIONES)
	
	// CONSTRUCTORES
	
	// CONSTRUCTOR PARAMETRIZADO
	public Barco(float largo, float ancho, float peso, int velocidad, String modelo, Tipo tipo) {
//		setLargo(largo);
//		this.ancho = ancho;
		this(largo ,ancho);
		this.peso = peso;
		this.velocidad = velocidad;
		this.modelo = modelo;
		this.tipo = tipo;
	}
	
	public Barco(float largo, float ancho) {
		setLargo(largo);
		this.ancho = ancho;

	}
	
	// CONSTRUCTOR POR DEFECTO
	Barco() {
		this.largo = -1;
		this.ancho = -1;
		this.peso = -1;
		this.velocidad = -1;
		this.modelo = "Nulo";
		this.tipo = Tipo.VELERO;
	}

	// MÉTODOS GET Y SET
	public float getLargo() {
		return largo;
	}
	
	void setLargo(float largo){
		this.largo = largo<300&&largo>20?largo:-1;
	}
	
	// MÉTODOS PÚBLICOS (COMPORTAMIENTO, MÉTODOS DE DOMINIO, MÉTODOS DE NEGOCIO)
	public float pesoEnKg() {
		return peso*1000;
	}
	
	public void imprimir() {
		System.out.printf(
			"Modelo: %s, Largo: %.2f m, Ancho: %.2f m, Peso: %.2f T, Velocidad: %d kn.\n",
			 modelo, largo, ancho, peso, velocidad
		);
	}
	
	public String toString() {
		return String.format("Modelo: %s, Largo: %.2f m, Ancho: %.2f m, Peso: %.2f T, Velocidad: %d kn.\n",
				 modelo, largo, ancho, peso, velocidad);
	}

}
