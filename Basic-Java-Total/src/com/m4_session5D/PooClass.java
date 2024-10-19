package com.m4_session5D;

// * Hoy veremos encapsulamiento (Public, Private y Protected).
public class PooClass {
  public static void main(String[] args){
    //Usando Public
//    Producto producto = new Producto("Laptop", 800, 10);
//    System.out.println(producto.nombre);

    Producto producto = new Producto();
    producto.setCantidad(2); //Si no se declara private se accederia asi producto.cantidad = 2;
    producto.precio = 100;      // Puede acceder a estos atributos porque son publicos.
    // Pero como accedo al nombre que es private???
    producto.setNombre("Laptop");
    System.out.println(producto.getNombre());
    // Y ahora lo podemos cambiar con proteccion
    producto.setNombre("Pc");
    System.out.println(producto.getNombre());



  }
}
