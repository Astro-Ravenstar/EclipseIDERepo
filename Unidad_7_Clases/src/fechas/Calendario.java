package fechas;

public class Calendario {

	int anyo;
	int mes;
	int dia;
	
	public Calendario(int anyo, int mes, int dia) {
		
		setAnyo(anyo);
		setMes(mes);
		setDia(dia);

	}
	
	//	GETSET ANYO
	public int getAnyo() {
		
		return this.anyo;
	}
	public void setAnyo(int anyo) {
		
		this.anyo = anyo >= 1 ? anyo : 0;
	}
	
	//	GETSET MES
	public int getMes() {
		
		return this.mes;
	}
	public void setMes(int mes) {
		
		this.mes = mes>=1 && mes<=12 ? mes : 0;
	}
	
	//	GETSET DIA
	public int getDia() {
		
		return this.dia;
	}
	public void setDia(int dia) {
		// ¿ES FEBRERO?
		if (this.mes == 2) {
			// ¿ES AÑO NO BISIESTO, Y EL DÍA ES 28 O MENOS?
			if 		(this.anyo%4 !=0 && dia>=1 && dia <=28) {this.dia = dia;}
			// ¿ES AÑO BISIESTO, Y EL DÍA ES 29 O MENOS?
			else if (this.anyo%4 ==0 && dia>=1 && dia <=29) {this.dia = dia;}
			// ERROR
			else {this.dia = 0;}
		}
		// ¿ES MES IMPAR DE 31 DIAS, Y EL DÍA ES 31 O MENOS?
		else if (this.mes%2 != 0 && this.mes<=7 && dia>=1 && dia <=31){this.dia = dia;}
		// ¿ES MES PAR DE 31 DIAS, Y EL DÍA ES 31 O MENOS?
		else if (this.mes%2 == 0 && this.mes>=8 && dia>=1 && dia <=31){this.dia = dia;}
		// ¿ES MES DE 30 DIAS, Y EL DÍA ES 30 O MENOS?
		else if (dia>=1 && dia <=30){this.dia = dia;}
		// ERROR
		else {this.dia = 0;}
	}
	
	void incrementarDia(int sumaDia) {
		if(sumaDia > 0) {
			int temp = this.dia;
			setDia(this.dia+sumaDia);
			if(this.dia == 0) {
				this.dia = temp;
				System.out.println("ADICIÓN INVÁLIDA (DIA)");
			}
		}
		else {
			System.out.println("INTRODUZCA UN VALOR POSITIVO");
		}	
	}
	
	void incrementarMes(int sumaMes) {
		if(sumaMes > 0) {
			int temp = this.mes;
			setMes(this.mes+sumaMes);
			if(this.mes == 0) {
				this.mes = temp;
				System.out.println("ADICIÓN INVÁLIDA (MES)");
			}
		}
		else {
			System.out.println("INTRODUZCA UN VALOR POSITIVO");
		}	
	}
	
	void incrementarAnyo(int sumaAnyo) {
		if(sumaAnyo > 0) {
			int temp = this.anyo;
			setAnyo(this.anyo+sumaAnyo);
			if(this.anyo == 0) {
				this.anyo = temp;
				System.out.println("ADICIÓN INVÁLIDA (AÑO)");
			}
		}
		else {
			System.out.println("INTRODUZCA UN VALOR POSITIVO");
		}	
	}
	
	void mostrar (Calendario fecha) {
		System.out.println(fecha.anyo +"/"+ fecha.mes +"/"+ fecha.dia);
	}
	
	boolean iguales(Calendario otraFecha) {
		boolean iguales = false;
			if (this.anyo == otraFecha.anyo && this.mes == otraFecha.mes  && this.dia == otraFecha.dia) {
				iguales = true;
			}
		return iguales;
	}
}
