  
/**************************************************************************
 * Programa:Persona.java
 * Objetivo: Dar ejemplo basico de atributos,metodos y clase (POO);
 * @author: Luis Diaz ci: 29.763.189
 * @since: 06/11/2020
 * @version:1.0
 * Persona.java: Realizado por Luis Diaz
 *************************************************************************/
public class Persona {
	String nombres;
	String apellidos;
	int fecha_n;
	String sexo;
	
	
	Persona (){
		nombres = "";
		apellidos = "";
		fecha_n = 0;
		sexo = "";
		
	}
	
	public int Calcular_edad() {
		int edad;
		edad= 2020 - fecha_n;
		return edad;
	}
	
	public String Esmayoredad() {
		if(Calcular_edad() >= 18)
			System.out.println("Eres mayor de edad");
		else
			System.out.println ("Eres menor de edad");
		
		return nombres;
	}


}





