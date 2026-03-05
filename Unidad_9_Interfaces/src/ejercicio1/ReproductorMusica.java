package ejercicio1;

public interface ReproductorMusica {

	public void reproducirCancion(String cancion);
	
	public String getCancionActual();
	
	public void agregarCancion(String cancion);
	
	public void agregarCanciones(String [] cancion);
	
	public void detenerCancion();
	
}
