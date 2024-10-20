package mx.com.ventas;

public class Producto {
	private final int idProducto;
	private String nombre;
	private double precio;
	private static int contadorProductos;
	
	//Constructor vacio y privado
	private Producto() {
		this.idProducto = ++Producto.contadorProductos;
	}
	
	//constructor publico
	public Producto(String nombre, double precio) {
		this();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//Setters y Getters
	public int getIdProducto() {
		return idProducto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + "]";
	}	
}
