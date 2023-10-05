package mx.com.ventas;

public class Orden {
	private int idOrden;
	private Producto productos[];
	private int contadorProductos;
	private static int contadorOrdenes;
	private static final int MAX_PRODUCTOS = 10;
	
	//Constructor vacio de la clase
	public Orden() {
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	//Metodo de agregacion (agregar producto)
	public void agregarProducto(Producto producto) {
		if(this.contadorProductos < Orden.MAX_PRODUCTOS) {
			this.productos[this.contadorProductos++] = producto;
		}else {
			System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
		}
	}
	
	//Metodo calcular total
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < this.contadorProductos; i++) {
//			Producto producto = this.productos[i];
//			total += producto.getPrecio(); // total = total + producto.getPrecio();
			//En una sola linea quedaria
			total += this.productos[i].getPrecio();
		}
		return total;
	}
	
	//Metodo mostrar orden
	public void mostrarOden() {
		System.out.println("Id Oden: " + this.idOrden);
		double totalOrden = this.calcularTotal();
		System.out.println("El total de la orden: $" + totalOrden);
		System.out.println("Productos de la orden: ");
		for (int i = 0; i < this.contadorProductos; i++) {
			System.out.println(this.productos[i]);
		}
	}
	
	
}
