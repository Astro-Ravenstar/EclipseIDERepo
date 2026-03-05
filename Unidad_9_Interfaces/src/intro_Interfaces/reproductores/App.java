package intro_Interfaces.reproductores;

public class App {

	public static void main(String[] args) {
		
//		Botonera botonera = new Botonera();	// Las interfaces no se pueden instanciar.
		Cancion cancion = new Cancion("Plastic Beach", 240, "Bla bla bla ...");
		
		ReproductorWeb reproductorWeb = new ReproductorWeb("Hola", Formato.MP3, "www.reproductorweb.com");
		reproductorWeb.play(cancion);
		
		ReproductorWin reproductorWin = new ReproductorWin("Adios", Formato.WAV, "reproductor.exe");
		reproductorWin.play(cancion);

		Botonera botonera = reproductorWeb;
		botonera.next();
	}
}
