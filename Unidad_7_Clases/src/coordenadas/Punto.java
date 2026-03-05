package coordenadas;

public class Punto {

	double x;
	double y;
	
	Punto(double x, double y){
		setX(x);
		setY(y);
	}
	//GETSET X
	double getX(){	
		return this.x;
	}
	
	void setX(double x) {
		this.x = x;
	}
	
	// GETSET Y
	double getY(){	
		return this.y;
	}
	
	void setY(double y) {
		this.y = y;
	}
	
	void desplaza(double dx, double dy) {
		this.x += dx;
		this.y += dy;
	}
	
	void desplaza(double dx) {
		this.x += dx;
	}
	
	double distanciaEuclidea(Punto otro) {
		
		double d = Math.sqrt (Math.pow ((otro.x - this.x),2) + Math.pow ((otro.y - this.y),2));
		return d;
	}
	
	void muestra() {
		System.out.println("X = " + this.x + " Y = " + this.y);
	}
}
