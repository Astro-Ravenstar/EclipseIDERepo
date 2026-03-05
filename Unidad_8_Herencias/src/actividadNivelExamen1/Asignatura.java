package actividadNivelExamen1;

public class Asignatura {

	private String nombre;
	private String curso;
	private int anyoIni;
	private int anyoFin;
	
	public Asignatura(String nombre, String curso, int anyoIni, int anyoFin) {

		this.nombre = nombre;
		this.curso = curso;
		this.anyoIni = anyoIni;
		this.anyoFin = anyoFin;
	}




	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}


	public int getAnyoIni() {
		return anyoIni;
	}

	public void setAnyoIni(int anyoIni) {
		this.anyoIni = anyoIni;
	}


	public int getAnyoFin() {
		return anyoFin;
	}

	public void setAnyoFin(int anyoFin) {
		this.anyoFin = anyoFin;
	}
	
	
	
	
	
}
