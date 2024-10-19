package com.m4_Polimorfismo.ejemplo;

public class main {
  public static void main(String[] args) {

    Animal animal= new Animal();
    animal.generarSonido();

    Perro perro= new Perro("Firulais",4,"Quiltro");
    //System.out.println(perro);
    perro.generarSonido();

    Calculadora cal= new Calculadora();

  }
}
