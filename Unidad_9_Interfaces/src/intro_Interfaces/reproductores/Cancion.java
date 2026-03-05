package intro_Interfaces.reproductores;

import java.util.Objects;

public class Cancion implements Comparable<Cancion>{

	private String 	titulo;
	private int 	segundos;
	private String 	letra;
	
	public Cancion(String titulo, int segundos, String letra) {
		super();
		this.titulo = titulo;
		this.segundos = segundos;
		this.letra = letra;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int duracion) {
		this.segundos = duracion;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	@Override
	public int hashCode() {
		return Objects.hash(segundos, letra, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Cancion)) {
			return false;
		}
		Cancion other = (Cancion) obj;
		return segundos == other.segundos && Objects.equals(letra, other.letra) && Objects.equals(titulo, other.titulo);
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", segundos=" + segundos + ", letra=" + letra + "]";
	}

	@Override
	public int compareTo(Cancion cancion) {
		if (this.segundos > cancion.segundos) {
			return 1;
		}
		else if (this.segundos < cancion.segundos) {
			return -1;
		}
		else return 0;
	}
}
