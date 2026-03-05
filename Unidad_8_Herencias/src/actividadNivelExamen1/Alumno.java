package actividadNivelExamen1;

public class Alumno extends Persona{

	Alumno(String nombre, String apellido, String dni, String email, Asignatura[] asignaturas){
		super();
		super.asignaturas = asignaturas;
	}
	
	public void matricular(Asignatura asignatura) {
		Asignatura [] copia = new Asignatura[super.asignaturas.length+1];
		for(int i = 0; i < super.asignaturas.length; i++) {
			copia[i] = super.asignaturas[i];
		}
		super.asignaturas = copia;
	}
}