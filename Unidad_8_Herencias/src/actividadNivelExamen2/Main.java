package actividadNivelExamen2;
import java.util.Scanner;
import actividadNivelExamen2.Parcela.tipoParcela;


public class Main {

	public static void main(String[] args) {
		
		Parcela [] parcelas = new Parcela[20];
		boolean salir = false;
		
		//PARCELAS DE PRUEBA
		int ultimoIndice = 4; //SI SE CAMBIAN LAS PARCELAS DE PRUEBA, ESTE ES NECESARIO CAMBIARLO
		parcelas[0] = new Parcela("0000",10000000.00,"12345678A",tipoParcela.A);
		parcelas[1] = new Parcela("1111",20000000.00,"12345678B",tipoParcela.B);
		parcelas[2] = new Parcela("2222",30000000.00,"12345678C",tipoParcela.C);
		parcelas[3] = new Parcela("3333",40000000.00,"12345678D",tipoParcela.A);
		parcelas[4] = new Parcela("4444",50000000.00,"12345678D",tipoParcela.B);
		
		do {
			
			System.out.println("\nIntroduzca la opción que desea realizar \n 1: Crear una parcela \n 2: Eliminar una parcela \n 3: Actualizar datos de una parcela \n 4: Mostrar datos de una parcela \n 5: Mostrar datos de todas las parcelas \n 6: Mostrar parcelas de un propietario dado su DNI \n 0: Salir ");
			int opcion = new Scanner(System.in).nextInt();
			switch(opcion) {
			
				case 1 -> {
					
					System.out.println("\nHa elegido crear una nueva parcela. ");
					
					System.out.println("Introduzca el ID: ");
					String id = new Scanner(System.in).nextLine();
					System.out.println("Introduzca el area en hectareas: ");
					double area = new Scanner(System.in).nextDouble();
					System.out.println("Introduzca el DNI del propietario: ");
					String dni = new Scanner(System.in).nextLine();
					System.out.println("Introduzca el tipo de parcela: \n A \n B \n C");
					String opcion2 = new Scanner(System.in).nextLine();
					tipoParcela tipo = tipoParcela.valueOf(opcion2.toUpperCase());
					
					//COMPARACION DE PARCELAS; PODRÍA SIMPLIFICARSE, PERO LO HE PREPARADO POR SI FUESE NECESARIO COMPARARA CADA ATRIBUTO
					Parcela parcelaTemporal = new Parcela(id, area, dni, tipo);
					boolean bandera = false;
					for(int i = 0; i <= ultimoIndice; i++) {
							if(parcelas[i].equals(parcelaTemporal)) {
								bandera = true;
							}
					}
					if (bandera == false) {		
						ultimoIndice++;
						parcelas[ultimoIndice] = new Parcela(parcelaTemporal.getId(), parcelaTemporal.getArea(), parcelaTemporal.getDniPropietario(), parcelaTemporal.tipoParcela);	
						
					} else {
						System.out.println("\nError: esa parcela ya se encuentra registrada.");
					}
				}	
				
				case 2 -> {
					System.out.println("\nIntroduzca el ID de la parcela a eliminar: ");
					
					String id = new Scanner(System.in).nextLine();
					for(int i = 0; i <= ultimoIndice; i++) {
						if (id.equalsIgnoreCase(parcelas[i].getId())){
							parcelas[i] = parcelas[ultimoIndice];
							Parcela [] copia = new Parcela[parcelas.length];
							System.arraycopy(parcelas, 0, copia, 0, ultimoIndice);	//Copia una longitud de ultimo indice exclusive
							parcelas = copia;
							ultimoIndice--;
						}
					}
				}
				
				case 3 ->{
					System.out.println("\nIntroduzca el ID de la parcela a actualizar: ");
					String id = new Scanner(System.in).nextLine();
					for(int i = 0; i <= ultimoIndice; i++) {
						if(id.equalsIgnoreCase(parcelas[i].getId())) {
		
							System.out.println("Introduzca el nuevo ID: ");
							String id2 = new Scanner(System.in).nextLine();
							System.out.println("Introduzca el nuevo area: ");
							double area = new Scanner(System.in).nextDouble();
							System.out.println("Introduzca el nuevo DNI del propietario: ");
							String dni = new Scanner(System.in).nextLine();
							System.out.println("Introduzca el nuevo tipo de parcela: \n A \n B \n C");
							String opcion2 = new Scanner(System.in).nextLine();
							tipoParcela tipo = tipoParcela.valueOf(opcion2.toUpperCase());
							
							parcelas[i].setId(id2);
							parcelas[i].setArea(area);
							parcelas[i].setDniPropietario(dni);
							parcelas[i].setTipoParcela(tipo);
						}
					}
				}
				
				case 4 -> {
					
					System.out.println("\nIntroduzca el ID de la parcela a buscar: ");
					String id = new Scanner(System.in).nextLine();
					for(int i = 0; i <= ultimoIndice; i++) {
						if (id.equalsIgnoreCase(parcelas[i].getId())){
							System.out.println(parcelas[i].toString());
						}
					}	
				}
				
				case 5 -> {		
					System.out.println("\nLista de parcelas: ");
					for(int i = 0; i <= ultimoIndice; i++) {
						System.out.println(parcelas[i].toString());
					}
				}
				
				case 6 ->{
					
					System.out.println("\nIntroduzca el DNI del propietario: ");
					String dni = new Scanner(System.in).nextLine();
					for(int i = 0; i <= ultimoIndice; i++) {
						if (dni.equalsIgnoreCase(parcelas[i].getDniPropietario())){
							System.out.println(parcelas[i].toString());
						}
					}
				}
				
				case 0 -> {		
					System.out.println("\nSaliendo del programa... ");
					salir = true;
					}
				
				default -> {
					System.out.println("\nIntroduzca una opción válida. ");
				}
				
			}
		}while(!salir);
		
		System.out.println("\nHasta pronto.");
	}
}
