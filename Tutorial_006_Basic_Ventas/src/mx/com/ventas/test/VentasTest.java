package mx.com.ventas.test;

import mx.com.ventas.Producto;
import mx.com.ventas.Orden;

public class VentasTest {
	public static void main(String[] args) {
		Producto producto1 = new Producto("Camisa", 50.00);
		Producto producto2 = new Producto("Pantalon", 100.00);
		
		Orden orden1 = new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOden();
	}
}
