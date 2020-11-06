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