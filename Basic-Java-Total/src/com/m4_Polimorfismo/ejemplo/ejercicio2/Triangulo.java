package com.m4_Polimorfismo.ejemplo.ejercicio2;

public class Triangulo extends Figura{
  private double lado1,lado2, lado3;

  //Constructor de la clase
  public Triangulo(double lado1, double lado2, double lado3){
    this.lado1 = lado1;
    this.lado2 = lado2;
    this.lado3 = lado3;
  }

  public double getLado1() {
    return lado1;
  }

  public void setLado1(double lado1) {
    this.lado1 = lado1;
  }

  public double getLado2() {
    return lado2;
  }

  public void setLado2(double lado2) {
    this.lado2 = lado2;
  }

  public double getLado3() {
    return lado3;
  }

  public void setLado3(double lado3) {
    this.lado3 = lado3;
  }

  //Metodo calcularPerimetro
  @Override
  public double calcularPerimetro(){
    return lado1 + lado2 + lado3;
  }
}
