package unidad1.actividadesaplicacion;
import java.util.Scanner;
public class ActividadAplicacion115 {
	public static void main(String[]args)
	{
		float varA, varB, varC, varX, resY;
		Scanner sc = new Scanner(System.in);
		System.out.println("A continuación, resolveremos el polinomio (y = ax^2 + bx + c)");
		System.out.println("Por favor, introduzca en orden sus valores para los coeficientes a, b, c y x, separados por la tecla |enter|: ");
		varA = sc.nextFloat();
		varB = sc.nextFloat();
		varC = sc.nextFloat();
		varX = sc.nextFloat();
		sc.close();
		resY = (float) (varA*(Math.pow(varX, 2))+varB*varX+varC);
		System.out.println("El valor de (y)1 es: " + resY);
	}
}
