package main;

public class Application {
	public static void main(String[] args) {
		System.out.println("Ahora si que si con Java Java Du!!!");
		System.out.println("Java con versionamiento en GitHub");
		
		String apellido = "Mesa";
		String nombre = "Juan";
		
		Persona persona = new Persona();
		persona.setApellido(apellido);
		persona.setNombre(nombre);
		
		System.out.println("El nombre de la persona es: " + nombre + " " + apellido );
	}
}
