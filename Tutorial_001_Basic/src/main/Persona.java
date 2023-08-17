package main;

public class Persona {
	private Long id;
	private String nombre;
	private String apellido;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public String setApellido(String apellido) {
		return this.apellido = apellido;
	}
	
}
