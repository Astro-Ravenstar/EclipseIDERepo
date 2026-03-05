package ejercicio1;

import java.util.Objects;

public class Coche extends Vehiculo implements ReproductorMusica{

	private int cilindraje;
	private String cancionActual;
	private String [] playlist;
	private int cantidadCanciones;
	
	public Coche(float combustible, int pasajeros, int ruedas, int cilindraje) {
		super(combustible, pasajeros, ruedas);
		this.cilindraje = cilindraje;
		this.playlist = new String [100];
		this.cantidadCanciones = 0;
	}
	
	public void aparcar() {
		System.out.println("Estoy aparcando el coche");
	}

	@Override
	public void reproducirCancion(String cancion) {
		boolean laTenemos = false;
        for (int i = 0; i < cantidadCanciones; i++) {
            if (playlist[i].equals(cancion)) {
                laTenemos = true;
                break;
            }
        }
        if (laTenemos) {
            this.cancionActual = cancion;
            System.out.println("Reproduciendo: " + cancion);
        } else {
            System.out.println("La canción '" + cancion + "' no existe.");
        }
	}

	@Override
	public String getCancionActual() {
		return this.cancionActual;
	}

	@Override
	public void agregarCancion(String cancion) {
		if(cantidadCanciones < playlist.length) {
			playlist[cantidadCanciones] = cancion;
			cantidadCanciones++;
			System.out.println("Canción '" + cancion + "' se ha añadido al reproductor.");
		}
		else {
			System.out.println("Se ha alcazado el límite de canciones guardadas.");
		}
	}

	@Override
	public void agregarCanciones(String[] canciones) {
		int cuenta = 0;
		for (String cancion : canciones) {
			if(cantidadCanciones < playlist.length) {
				cuenta++;
				playlist[cantidadCanciones] = cancion;
				cantidadCanciones++;
				System.out.println("Canción '" + cancion + "' se ha añadido al reproductor.");
			}
			else {
				System.out.println("Se ha alcazado el límite de canciones guardadas.");
				System.out.println("Se han guardado " + cuenta + " canciones.");
				break;
			}
		}	
	}

	@Override
	public void detenerCancion() {
		if(cancionActual != null) {
			System.out.println("La canción actual, '" + cancionActual + " ', se ha detenido.");
			cancionActual = null;
		}
		else {
			System.out.println("No hay ninguna canción en reproducción.");
		}
	}

	@Override
	public String toString() {
		return "Coche [cilindraje=" + cilindraje + ", cancionActual=" + cancionActual + ", playlist=" + playlist
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cancionActual, cilindraje, playlist);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Coche)) {
			return false;
		}
		Coche other = (Coche) obj;
		return Objects.equals(cancionActual, other.cancionActual) && cilindraje == other.cilindraje
				&& Objects.equals(playlist, other.playlist);
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String[] getPlaylist() {
		return playlist;
	}

	public int getCantidadCanciones() {
		return cantidadCanciones;
	}

	public void setCancionActual(String cancionActual) {
		this.cancionActual = cancionActual;
	}

}
