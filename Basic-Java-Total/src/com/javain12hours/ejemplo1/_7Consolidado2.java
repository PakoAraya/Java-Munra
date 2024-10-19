package com.javain12hours.ejemplo1;

import java.util.Scanner;

//Merceria Mayorista => Vende al por mayor.
//Menos de 5 paquetes no vende
//Entre 5 y 15 sale 10 USD el envio
//Mas de 15 el envio es gratis
public class _7Consolidado2 {
  public static void main(String[] args) {
    //Declaracion de las variables
    int cantidadDePaquetes;
    double montoTotal, diferencia, descuento, totalConDesc;
    Scanner teclado = new Scanner(System.in);

    //Preguntar por teclado cuantos paquetes son
    System.out.println("Ingrese la cantidad de paquetes: ");
    cantidadDePaquetes = teclado.nextInt();



    //Evaluar los posibles casos
    if(cantidadDePaquetes < 5) {
      System.out.println("No se permiten ventas minoristas (Cantidad de paquetes menor a 5)");
    }else{
      System.out.println("Ingrese la cantidad de la compra: ");
      //Vamos a reiniciar la variable teclado para no marearlo entre valores int y double
      teclado = new Scanner(System.in);
      montoTotal = teclado.nextDouble();

      if(cantidadDePaquetes >= 5 && cantidadDePaquetes <=15){
        System.out.println("El costo del envio es de 10 USD");
        montoTotal += 10;
      }else{
        System.out.println("El envio es totalmente gratis, Muchas gracias por su compra");
      }
      if(montoTotal < 100){
        diferencia = 100 - montoTotal;
        System.out.println("El monto es menor a 100 por lo que no posee promociones. Necesita comprar: "
                + diferencia + "USD para entrar en promocion");
      }else {
        if (montoTotal >= 100 && montoTotal <= 300){
          descuento = montoTotal * 0.05;
          totalConDesc = montoTotal - descuento;
          System.out.println("Por su compra tiene un descuento del 5% que equivale a: "+ descuento +
                  " El monto total con descuento es de: " + totalConDesc);
        }else{
          descuento = montoTotal * 0.10;
          totalConDesc = montoTotal - descuento;
          System.out.println("Por su compra tiene un descuento del 10% que equivale a: "+ descuento +
                  " El monto total con descuento es de: " + totalConDesc);
        }
      }
    }
  }
}
