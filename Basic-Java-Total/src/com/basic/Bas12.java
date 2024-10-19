package com.basic;

import java.util.Scanner;

public class Bas12 {
  public static void main(String args[]){
    //Tenemos que ingresar un limite hasta el que tenemos que contar
    //Ingresar el limite
    System.out.println("Ingrese el limite hasta el que quiere contar");
    Scanner teclado = new Scanner(System.in);
    int limite = teclado.nextInt();
    int cont=1;

    while(cont <= limite){
      System.out.println(cont);
      cont++;
    }
  }
}
