package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOrdenacion {
    public static void main(String[] args) {
    	
        List<Coche> coches = new ArrayList<>();
        
        coches.add(new Coche(66.0f, 3, 4, 1400));
        coches.add(new Coche(70.6f, 5, 4, 1700));
        coches.add(new Coche(53.8f, 4, 4, 1300));

        Collections.sort(coches);
        System.out.println("Ordenando coches según pasajeros:");
        for (Coche coche : coches) {
            System.out.println("Cilindraje: " + coche.getCilindraje() + ", Pasajeros: " + coche.getPasajeros());
        }

        Collections.sort(coches, new CocheCilindrajeComparator());
        System.out.println("Ordenando coches según cilindraje:");
        for (Coche coche : coches) {
            System.out.println("Cilindraje: " + coche.getCilindraje() + ", Pasajeros: " + coche.getPasajeros());
        }
        
        List<Avion> aviones = new ArrayList<>();
        aviones.add(new Avion(250.0f, 220, 4, 5200.0f));
        aviones.add(new Avion(240.0f, 180, 4, 5600.0f));
        aviones.add(new Avion(230.0f, 200, 4, 5800.0f));
        
        Collections.sort(aviones);
        System.out.println("Ordenando aviones según pasajeros:");
        for (Avion avion : aviones) {
            System.out.println("Altura: " + avion.getAltura() + ", Pasajeros: " + avion.getPasajeros());
        }
        
        Collections.sort(aviones, new AvionAlturaComparador());
        System.out.println("Ordenando aviones según altura:");
        for (Avion avion : aviones) {
            System.out.println("Altura: " + avion.getAltura() + ", Pasajeros: " + avion.getPasajeros());
        }
    }
}

