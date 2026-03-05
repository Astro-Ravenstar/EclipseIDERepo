package intro_Interfaces.reproductores;

public class ReproductorWeb extends Reproductor{
	
	private String url;

	public ReproductorWeb(String password, Formato formato, String url) {
		super(password, formato);
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public void play(Cancion cancion) {
		System.out.println("Conectado y reproduciendo en la web: " + cancion.getTitulo());		
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
