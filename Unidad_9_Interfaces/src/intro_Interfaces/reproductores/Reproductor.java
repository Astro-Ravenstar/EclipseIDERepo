package intro_Interfaces.reproductores;

import java.util.Objects;

public abstract class Reproductor implements Botonera{

	private String password;
	private Formato formato;
	
	public Reproductor(String password, Formato formato) {
		super();
		this.password = password;
		this.formato = formato;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

	@Override
	public int hashCode() {
		return Objects.hash(formato, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Reproductor)) {
			return false;
		}
		Reproductor other = (Reproductor) obj;
		return formato == other.formato && Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "Reproductor [password=" + password + ", formato=" + formato + "]";
	}
	
	
	
}
