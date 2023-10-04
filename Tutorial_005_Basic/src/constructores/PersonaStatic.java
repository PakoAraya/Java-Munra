package constructores;

public class PersonaStatic {
	private int idPersona;
	private String nombre;
	private static int contadorPersonas;
	
	public PersonaStatic(String nombre) {
		this.nombre = nombre;
		//Incrementar el contador por cada objeto nuevo directamente con la clase
		PersonaStatic.contadorPersonas++;
		//Asignar el nuevo valor a la variable idPersona
		this.idPersona = PersonaStatic.contadorPersonas;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombreString(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	public static void setContadorPersonas(int contadorPersonas) {
		PersonaStatic.contadorPersonas = contadorPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
	
	
}
