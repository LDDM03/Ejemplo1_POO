  /**************************************************************************
 * Programa:PersonaPrincipal.java
 * Objetivo: Dar ejemplo basico de atributos,metodos y clase (POO);
 * @author: Luis Diaz ci: 29.763.189
 * @since: 06/11/2020
 * @version:1.0
 * Persona.java: Realizado por Luis Diaz
 *************************************************************************/
public class PersonaPrincipal {
	
	public static void main (String args[]) {
		
		Persona Luis = new Persona();
		Luis.nombres = "Luis";
		Luis.apellidos = "Diaz";
		Luis.fecha_n = 2001;
		Luis.sexo = "Masculino";
		;
		
		System.out.println ("Según el año establecido tienes: " + Luis.Calcular_edad());
		System.out.println (Luis.Esmayoredad());
		System.out.println (":)");
		
		
		
		
		
		
	}

}

