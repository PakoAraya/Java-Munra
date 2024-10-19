package com.basic;
//funcion fibonacci en Java
public class Bas18{
  public static int fib (int n){
    return n<2 ? n:fib(n-1) + fib(n-2);
  }
  public static void main (String args[]){
    for(int i =0; i <= 10; i++){
      System.out.println("Fib (" + i + ")" + fib(i));
    }
  }
}
