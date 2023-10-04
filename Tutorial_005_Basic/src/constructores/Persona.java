package constructores;

public class Persona {
	private String nombre;
	private String apellido;
	private double sueldo;
	private boolean eliminado;
	
	//Constructor
	public Persona(String nombre, String apellido, double sueldo, boolean eliminado){
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.eliminado = eliminado;
	}
	
	//Setters y Getters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public Double getSueldo() {
		return this.sueldo;
	}
	
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	public boolean isEliminado() {
		return this.eliminado;
	}
	
	public String toString() {
		return "Persona [ Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Sueldo: " + this.sueldo + ", Eliminado: " + this.eliminado + " ]";
	}
	
}
