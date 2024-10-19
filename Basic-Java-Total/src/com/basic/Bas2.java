package com.basic;

public class Bas2 {
  public static void main(String[] args){
    int numero = 35;
    int numero2 = 20;
    int aux;
    System.out.println("------ANTES------");
    System.out.println("Numero 1: " + numero);
    System.out.println("Numero 2: " + numero2);

    aux = numero2;
    numero2 = numero;
    numero = aux;

    System.out.println("------DESPUES------");
    System.out.println("Numero 1: " + numero);
    System.out.println("Numero 2: " + numero2);
  }
}
