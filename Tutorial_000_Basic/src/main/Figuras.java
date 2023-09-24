package main;

public class Figuras {
  public static void main(String[] args) {
    //calculo del area de un cuadrado
    double lado = 5;
    double areaCuadrado = lado * lado;

    //calculo del area de un rectangulo
    double base = 2;
    double altura = 4;
    double areaRectangulo = base * altura;

    //calculo del area de un triangulo
    double baseTriangulo = 3.4;
    double alturaTriangulo = 5.6;
    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

    System.out.println("El area del cuadrado es: " + areaCuadrado);
    System.out.println("El area del rectangulo es: " + areaRectangulo);
    System.out.println("El area del triangulo es: " + areaTriangulo);
  }
}
