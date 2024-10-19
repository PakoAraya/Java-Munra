package com.javain12hours.ejemplo1;

import java.util.Scanner;

//Repaso de estructuras repetitivas
public class _8Repetitivas {
  public static void main(String[] args) {
    //Repaso de ciclo do-while
//    int contador=0;
//    do{
//      System.out.println("Estoy en la vuelta: " + contador);
//      contador += 1;
//    }while(contador <10);

    //Repaso de ciclo While con contador
 /*   int contador = 0;
    while (contador < 10){
      System.out.println("Estoy en la vuelta n: " + contador);
      contador ++;
    }  */

    //Repaso ciclo while con centinela
    boolean bandera = true;
    Scanner teclado = new Scanner(System.in);
    String respuesta;

    while(bandera == true){
      System.out.println("El valor de mi bandera es: " + bandera);
      System.out.println("Estas actualmente suscrito??? " + bandera);
      System.out.println("Quieres desuscribirte a MiscelaBros???");
      respuesta = teclado.next();

      if (respuesta.equalsIgnoreCase("si")) {
        bandera = false;
      }
    }
  }
}
