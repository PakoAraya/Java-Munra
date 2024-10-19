package com.m4_session5D;

public class Producto {
  private String nombre;
  public int precio;    //Probaremos con el accesador public para acceder desde cualquier parte
  private int cantidad;

  // Constructor que tambien sera declarado como public
//  public Producto(String nombre, int precio, int cantidad) {
//    this.nombre = nombre;
//    this.precio = precio;
//    this.cantidad = cantidad;
//  }

  //Constructor de ejemplo para probar encapsulamiento
  public Producto(){
  }

  //Setter y Getter
  //Parametro para el nombre
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  //getter publico si retorna (atributo)
  public String getNombre(){
    return this.nombre;
  }

  public void setCantidad(int cantidad){
    if (cantidad < 0) {
      this.cantidad = 0;
    }else {
      this.cantidad = cantidad;
    }
  }

  public int getCantidad(){
    return cantidad;
  }

}