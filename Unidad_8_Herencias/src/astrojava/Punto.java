package astrojava;

import java.util.Objects;

public class Punto {
   double x, y;

   public Punto(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public void desplazaX(double dx) {
      x += dx;
   }

   public void desplazaY(double dy) {
      y += dy;
   }

   public void desplaza(double dx, double dy) {
      x += dx;
      y += dy;
   }

   void muestra() {
      System.out.println("(" + x + ", " + y + ")");
   }

   double distanciaEuclidea(Punto otro) {
      return Math.sqrt(Math.pow(x - otro.x, 2) +
                       Math.pow(y - otro.y, 2));
   }

@Override
public int hashCode() {
	return Objects.hash(x, y);
}

@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof Punto)) {
		return false;
	}
	Punto other = (Punto) obj;
	return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
			&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
}
   
//   @Override
//   public boolean equals( Object obj ) {
//	   Punto punto = (Punto) obj;
//	   if(this.x == punto.x   && this.y == punto.y) 
//	   {
//		   return true;
//	   }
//	   else
//	   {
//		   return false;
//	   }
//   }
   
   
   
   
   
   
   
   
   
   
   

}
