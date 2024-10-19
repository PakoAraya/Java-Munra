package com.m4_session5;
// * Hoy comenzamos a estudiar POO
public class Ejemplo1 {
  public static void main(String[] args){
    Auto auto1 = new Auto();
    Auto auto2 = new Auto("Toyota");
    Auto auto3 = new Auto("Toyota", "Azul");
    Auto auto4 = new Auto("Toyota", "Azul", "Rav4", 2024);

    System.out.println(auto1.marca + " " + auto1.color + " " + auto1.modelo + " " + auto1.anio);
    System.out.println(auto2.marca + " " + auto2.color + " " + auto2.modelo + " " + auto2.anio);
    System.out.println(auto3.marca + " " + auto3.color + " " + auto3.modelo + " " + auto3.anio);
    System.out.println(auto4.marca + " " + auto4.color + " " + auto4.modelo + " " + auto4.anio);

  }
}

// Vamos a crear la clase auto
class Auto{
  //Atributos de la clase
  String marca;
  String color;
  String modelo;
  int anio;

  //Vamos a crear un constructor vacio, es decir, sin parametros.
  Auto(){
    //Se escribe estas lineas para ejemplo y que no de null, pero el constructor vacio no tiene nada.
    this.marca = "Skoda";
  }
  //Vamos a construir otro constructo.
  Auto (String marcaParametro){
    this.marca = marcaParametro;
  }

  //Tercer constructor con 2 parametros
  Auto(String marcaParametro, String colorParametro){
    this.marca = marcaParametro;
    this.color = colorParametro;
  }

  //Constructor con todos los parametros
  Auto(String marcaParametro, String colorParametro, String modeloParametro, int anioParametro){
    this.marca = marcaParametro;
    this.color = colorParametro;
    this.modelo = modeloParametro;
    this.anio = anioParametro;
  }

}
