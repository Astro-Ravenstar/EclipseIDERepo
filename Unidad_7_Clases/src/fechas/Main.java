package fechas;

public class Main {

	public static void main(String[] args) {

		Calendario fecha1 = new Calendario(2024,4,28);
		Calendario fecha2 = new Calendario(2024,4,28);
		
		System.out.println(fecha1.anyo +"/"+ fecha1.mes +"/"+ fecha1.dia);
		
		System.out.println(fecha1.iguales(fecha2));
		fecha1.incrementarDia(9);
		fecha1.incrementarMes(8);
		fecha1.incrementarAnyo(20);
		System.out.println(fecha1.iguales(fecha2));
		
		fecha1.mostrar(fecha1);
		
		
		
	}

}
