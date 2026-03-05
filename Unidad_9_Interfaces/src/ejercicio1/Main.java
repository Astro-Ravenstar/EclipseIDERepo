package ejercicio1;

public class Main {
	
    public static void main(String[] args) {
        pruebaCoche();
        pruebaAvion();
        pruebaMoto();
    }

    private static void pruebaCoche() {
        Coche transam = new Coche(60.0f, 4, 4, 2000);
        transam.agregarCancion("Don't know how to stop");
        transam.agregarCanciones(new String[] {"RedLine", "YellowLine"});
        transam.reproducirCancion("RedLine");
        System.out.println("Canción actual en el coche: " + transam.getCancionActual());
        transam.aparcar();
        transam.detenerCancion();
        System.out.println("Canción actual en el coche: " + transam.getCancionActual());
    }

    private static void pruebaAvion() {
        Avion tornado = new Avion(250.0f, 200, 4, 5800.0f);
        tornado.agregarCancion("I am all of me");
        tornado.agregarCanciones(new String[] {"Green Hill", "What I'm made of"});
        tornado.reproducirCancion("Green Hill");
        System.out.println("Canción actual en el avión: " + tornado.getCancionActual());
        tornado.reportarEstado();
        tornado.aterrizar();
        System.out.println("Canción actual en el avión: " + tornado.getCancionActual());
    }

    private static void pruebaMoto() {
        Motocicleta sombra = new Motocicleta(10.0f, 1, 2);
        sombra.hacerCaballito();
    }
}
