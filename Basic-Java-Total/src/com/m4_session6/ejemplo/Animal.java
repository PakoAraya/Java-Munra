package com.m4_session6.ejemplo;

public class Animal {
  //Atributos
  protected String nombre;
  protected int edad;

  //Tambien podemos tener un constructor vacio
  Animal(){

  }

  Animal(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
  }

  public void generarSonido(){
    System.out.println("genera sonido");
  }
}
