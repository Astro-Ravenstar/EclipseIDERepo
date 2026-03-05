package pruebastring;
public class prueba1 {

	public static void main(String[] args) {
		
		char chr[] = {'a', 'b', 'c'};
	    String str = new String(chr);
	    
	    System.out.println(chr);
	    System.out.println(str);
	    
	    
	    String str1 = "cde";
	    char[] chr1 = str1.toCharArray();
	    
	    System.out.println(str1);
	    System.out.println(chr1);

	    StringBuilder sb = new StringBuilder("hola");
	    
	    sb.append(" caracola");
	    System.out.println(sb);
	    sb.reverse();
	    System.out.println(sb);

	}

}
