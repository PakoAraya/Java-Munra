package com.m4_Polimorfismo.ejemplo;

public class Animal {

  protected String nombre;
  protected int edad;

  Animal(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  Animal(){
  }

  public void generarSonido() {
    System.out.println("genera sonido");
  }

}
