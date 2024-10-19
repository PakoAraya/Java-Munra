package com.m4_Polimorfismo.ejemplo.ejercicio3;

public class Perro extends Animal{
  //Metodo sobreescribir emitirSonido
  @Override
  public void emitirSonido(){
    System.out.println("Guau");
  }
}
