package herencia;

public class EmpleadoPoo extends PersonaPoo{
	private int idEmpleado;
	private double sueldo;
	private static int contadorEmpleado;
	
	//Constructor clase EmpleadoPoo
	public EmpleadoPoo() {
		System.out.println("Constructor vacio de la clase EmpleadoPoo");
	}
	
	public EmpleadoPoo(String nombre, double sueldo) {
		super(nombre);
		this.idEmpleado = ++contadorEmpleado;
		this.sueldo = sueldo;
	}

	public EmpleadoPoo(String nombre, String apellido, char genero, int edad, String direccion, int idEmpleado, double sueldo) {
		super(nombre, apellido, genero, edad, direccion);
		this.idEmpleado = idEmpleado;
		this.sueldo = sueldo;
	}
	
	//Setters y Getters.
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	public int getIdEmpleado() {
		return this.idEmpleado;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public double getSueldo() {
		return this.sueldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmpleadoPoo [idEmpleado=");
		builder.append(this.idEmpleado);
		builder.append(", Sueldo=");
		builder.append(this.sueldo);
		builder.append(", Persona=");
		builder.append(super.toString()).append("}");
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
