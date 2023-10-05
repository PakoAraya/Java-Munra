package operaciones;

public class PersonaArray {
	private String nombre;
	

	public PersonaArray(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombreString() {
		return nombre;
	}

	public void setNombreString(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return "Persona [" + "Nombre = " + nombre + "]";
	}
	
}
