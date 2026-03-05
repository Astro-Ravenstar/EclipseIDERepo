package intro_Interfaces.reproductores;

public class ReproductorWin extends Reproductor{
	
	private String path;

	public ReproductorWin(String password, Formato formato, String path) {
		super(password, formato);
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Override
	public void play(Cancion cancion) {
		System.out.println("Conectado y reproduciendo en WIN: " + cancion.getTitulo());		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}
	
	
}
