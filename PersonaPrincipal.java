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
		Luis.nombre = "Luis";
		Luis.edad = 19;
		Luis.apellido = "Diaz";

		System.out.println ("El profesor de Programación le dijo a Luis que tiene buen rendimiento y el responde:");
		Luis.agradecer();
	
	}
	
	
}
