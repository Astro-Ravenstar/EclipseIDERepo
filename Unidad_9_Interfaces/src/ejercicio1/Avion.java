package ejercicio1;

import java.util.Arrays;
import java.util.Objects;

public class Avion extends Vehiculo implements ReproductorMusica, PuedeVolar{

		private float altura;
		private String cancionActual;
		private String [] playlist;
		private int cantidadCanciones;
		
		public Avion(float combustible, int pasajeros, int ruedas, float altura) {
			super(combustible, pasajeros, ruedas);
			this.altura = altura;
			this.playlist = new String[100];
			this.cantidadCanciones = 0;
		}

		@Override
		public void aterrizar() {
			System.out.println("Estoy aterrizando el avión.");
		}
		
		public void reportarFlota() {
	        System.out.println("Reportando flota de aviones.");
	    }


	    public void reportarEstado() {
	        System.out.println("Avión con " + getPasajeros() 
	            + " pasajeros a una altura de " + altura + " metros.");
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
			return "Avion [altura=" + altura + ", cancionActual=" + cancionActual + ", playlist="
					+ Arrays.toString(playlist) + ", cantidadCanciones=" + cantidadCanciones + ", toString()="
					+ super.toString() + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Arrays.hashCode(playlist);
			result = prime * result + Objects.hash(altura, cancionActual, cantidadCanciones);
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
			if (!(obj instanceof Avion)) {
				return false;
			}
			Avion other = (Avion) obj;
			return Float.floatToIntBits(altura) == Float.floatToIntBits(other.altura)
					&& Objects.equals(cancionActual, other.cancionActual)
					&& cantidadCanciones == other.cantidadCanciones && Arrays.equals(playlist, other.playlist);
		}

		public float getAltura() {
			return altura;
		}

		public void setAltura(float altura) {
			this.altura = altura;
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
