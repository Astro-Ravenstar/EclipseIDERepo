package coordenadas;

public class Main {

	public static void main(String[] args) {
		
		Punto puntoA = new Punto(1, 1);
		Punto puntoB = new Punto(0, 0);
		
		puntoA.muestra();
		puntoB.muestra();
		
//		puntoA.desplaza(4.0);
//		puntoA.muestra();
//		
//		puntoB.desplaza(1.2,3.1);
//		puntoB.muestra();

		System.out.println(puntoA.distanciaEuclidea(puntoB));
	}

}
