
public class funcionTablaDinamica {

	static void incrementarArray(Object[] arrayOriginal) {
		Object[] copia = new Object[arrayOriginal.length+1];
		for(int i = 0; i < arrayOriginal.length; i++) {
			copia[i] = arrayOriginal[i];
		}
		arrayOriginal = copia;
	
	}
}
