package jugadores;

public class Jugador {

	String nombre; 		String apellido; 	int numero;
	String posicion; 	String elemento; 	String supertecnica;
	float altura; 		float peso;
	

	public Jugador(	String nombre, 		String apellido, 		int numero, 
					String posicion, 	String elemento, 		String supertecnica, 
					float altura, 		float peso) {
		setNombre(nombre);
	}
	
	//GETSET NOMBRE
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre.length()<20?nombre:"No válido";
	}
	
	//GETSET APELLIDO
	String getApellido() {
		return apellido;
	}
	void setApellido(String apellido) {
		this.apellido = apellido.length()<20?nombre:"No válido";
	}
	
	//GETSET NUMERO
		int getNumero() {
			return numero;
	}
		void setNumero(int numero) {
			this.numero = numero<0||numero>99?numero:-1;
	}
		
	//GETSET POSICION
	String getPosicion() {
		return posicion;
	}
	void setPosicion(String posicion) {
		//if (posicion.equalsIgnoreCase("portero")||			posicion.equalsIgnoreCase("defensa")||
		//	posicion.equalsIgnoreCase("centrocampista")||	posicion.equalsIgnoreCase("delantero")) {
		//	this.posicion=posicion;
		//}
		//else {
		//	this.posicion="No válido";
		//}
		
		String[] posiciones = {"portero", "defensa", "centrocampista", "delantero"};
		int bandera = -1;
		for(int i = 0; i < posiciones.length; i++) {
			if (posicion.equalsIgnoreCase(posiciones[i])) {
				bandera = i;
			}
		posicion=bandera>=0?posiciones[bandera]:"No válido";
		}
	}
		
}


