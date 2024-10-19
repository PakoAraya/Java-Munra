package com.basic;

public class Bas3 {
  public static void main(String args[]){
    int dia = 9;
    String nomDia;

    switch(dia){
      case 1:
        nomDia = "Lunes";
        break;
      case 2:
        nomDia = "Martes";
        break;
      case 3:
        nomDia = "Miercoles";
        break;
      case 4:
        nomDia = "Jueves";
        break;
      case 5:
        nomDia = "Viernes";
        break;
      case 6:
        nomDia = "Sabado";
        break;
      case 7:
        nomDia = "Domingo";
        break;
      default:
        nomDia = "Numero de dia invalido";
        break;
    }
    System.out.println("El dia de la semana seleccionado es: " + nomDia);
  }
}
