package actividadNivelExamen2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parcela {

	private String id;
	private double area;
	private String dniPropietario;
	tipoParcela tipoParcela;
	
	//CREAMOS ENUM, PUEDE ESTAR EN OTRO ARCHIVO (RECOMENDABLE)
	public enum tipoParcela  {
		A, B, C
	}
	
	//CONSTRUCTOR PARAMETRIZADO
	public Parcela(String id, double area, String dni, tipoParcela tipo) {

		setId(id);
		setArea(area);
		setDniPropietario(dni);
		setTipoParcela(tipo);
	}
	
	//CONSTRUCTOR POR DEFECTO
	public Parcela(String id) {

		setId(id);
		setArea(0);
		setDniPropietario("NULL");
		setTipoParcela(tipoParcela.A);
	}
	

	//SI LAS PARCELAS TIENEN EL MISMO ID, SON IGUALES
		public boolean equals(Object other) {
			Parcela otraParcela = (Parcela)other;
			boolean esIgual = false;
			if(this.id.equalsIgnoreCase(otraParcela.id)) {
				esIgual = true;
			}
				return esIgual;
				
		}
	
	// MUESTRAB LOS DATOS RELEVANTES, Y HACE LA CONVERSION DE m^2 A hec
	@Override
	public String toString() {
		return "Parcela [id= " + getId() + ", area= " + (getArea()/10000) + " hec, dniPropietario= " + getDniPropietario() + ", tipoParcela= "
				+ getTipoParcela() + "]";
	}




	public String getId() {
		return this.id;
	}

	//CUALQUIER ID NO VÁLIDO SERÁ PUESTO A NULL
	public void setId(String id) {
		
		if(id.toCharArray().length == 4) {
			this.id = id;
		} else {
			this.id = "NULL";
		}
		
		//MEDIANTE REGEX
		/*
		String regex ="^[a-zA-Z0-9]{4}$";
		if(validarRegex(id, regex)) {
			this.id = id;
		}
		else this.id = "NULL";
		*/
	}

	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public String getDniPropietario() {
		return dniPropietario;
	}


	public void setDniPropietario(String dni) {
		String regex = "^[0-9]{8}[A-Z]$";
		if(validarRegex(dni, regex)) {
			this.dniPropietario = dni;
		}
		else {
			this.dniPropietario = "NULL";
		}
	}


	public tipoParcela getTipoParcela() {
		return tipoParcela;
	}


	public void setTipoParcela(tipoParcela tipo) {
		if(tipo != tipoParcela.A || tipo != tipoParcela.B || tipo != tipoParcela.C) {
			this.tipoParcela = tipoParcela.A;
		}else {
			this.tipoParcela = tipo;
		}		
	}
	
	private static boolean validarRegex(String input, String regex) {
        if (input == null || input.isEmpty()) {
            return false;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

}
