package main;

import java.util.Scanner;

public class TablaWhileDinamica {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Dar el valor de la tabla: ");
    int tabla = scan.nextInt();
    int contador = 1;
    int limite = 10;

    while (contador <= limite) {
      System.out.printf("%d x %d = %d \n", tabla, contador, tabla * contador);
      contador++;
    }
    System.out.println("Termino el While");

    contador = 1;

    do{
      System.out.printf("%d x %d = %d \n", tabla, contador, tabla * contador);
      contador++;
    } while (contador <= limite);
    System.out.println("Termino el Do While");
  }
}
