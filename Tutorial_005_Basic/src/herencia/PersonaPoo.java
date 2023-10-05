package herencia;

public class PersonaPoo {
	protected String nombre;
	protected String apellido;
	protected char genero;
	protected int edad;
	protected String direccion;
	
	//Constructor vacio
	public PersonaPoo() {
		System.out.println("Constructor vacio de la clase PersonaPoo");
	}
	
	public PersonaPoo(String nombre) {
		this.nombre = nombre;
	}
	
	public PersonaPoo(String nombre, String apellido, char genero, int edad, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.direccion = direccion;
	}

	//Setters y Getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "PersonaPoo [nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero + ", edad=" + edad
				+ ", direccion=" + direccion + "]";
	}	
	
	
}
