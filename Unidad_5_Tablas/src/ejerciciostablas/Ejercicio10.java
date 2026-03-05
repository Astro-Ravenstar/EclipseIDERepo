package ejerciciostablas;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		float [][] matrizNotas = {{1,7,34,1},{3,5,6,7}};
		String [] nombres = {"Javi", "Maria"};
		
		String nombreAlumno = "Javi";
		
		int indiceAlumno = 99;
		
		for(int i = 0; i < nombres.length; i++) {
			if(nombres[i].equals(nombreAlumno)){
				indiceAlumno = i;
				break;
			}
		}

		System.out.println(indiceAlumno);
	}

}
