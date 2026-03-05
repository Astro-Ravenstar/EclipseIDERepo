package visibilidad.paquete1;

public class B {

	private int atributoB;
	public static int atributoDeLaClase;
	
	public B(){
		
	}
	
	public void setAtributoB(int valor) {
		this.atributoB = valor;
	}
	
	public static void metodoDeLaClase() {
		System.out.println("Método Static: "+ atributoDeLaClase);
	}
}
