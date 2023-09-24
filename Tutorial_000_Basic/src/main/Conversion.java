package main;

public class Conversion {
  public static void main(String[] args) {
    //Vamos a generar conversiones de pulgadas a centimetros 2,54 cm = 1 pulgada.
    double valor = 10;
    double centimetros = 2.54;
    double pulgada = 1;

    double resultado = (valor * pulgada) / centimetros;
    System.out.println("Las pulgadas de 10cm son: " + resultado + " pulgadas");

    double valorPulgadas = 5;
    double resultado2 = (valorPulgadas * centimetros) / pulgada;
    
    System.out.println("Los centimetros de 5 pulgadas son: " + resultado2 + " centimetros");
  }
}
