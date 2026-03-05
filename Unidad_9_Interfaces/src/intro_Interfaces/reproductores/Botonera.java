package intro_Interfaces.reproductores;

public interface Botonera {

	void play(Cancion cancion);
	void stop();
	void pause();
	
	default void next() {
		System.out.println("El reproductor salta a la siguiente canción");
	}
	
	default void previous() {
		System.out.println("El reproductor salta a la canción anterior");
	}
}
