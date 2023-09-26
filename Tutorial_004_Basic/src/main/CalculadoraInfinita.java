package main;

import java.util.Scanner;

public class CalculadoraInfinita {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int opcion = 0;

    do{   
      System.out.println("================================");
      System.out.println("Calculadora Basica 2");
      System.out.println("================================");
      System.out.println("Opciones");
      System.out.println("1: Suma");
      System.out.println("2: Resta");
      System.out.println("3: Multiplicación");
      System.out.println("4: División");
      System.out.println("5: Salir");
      opcion = scan.nextInt();

      double valor1, valor2, resultado;

      switch (opcion) {
        case 1: //Suma
          System.out.println("Suma");
          System.out.println("Ingresa el primer valor");
          valor1 = scan.nextDouble();
          System.out.println("Ingresa el segundo valor");
          valor2 = scan.nextDouble();;
          resultado = valor1 + valor2;
          System.out.println("Has seleccionado suma, el resultado de "+ valor1 + " + " + valor2 + " es: " + resultado);
        break;
        case 2: //Resta
          System.out.println("Resta");
          System.out.println("Ingresa el primer valor");
          valor1 = scan.nextDouble();
          System.out.println("Ingresa el segundo valor");
          valor2 = scan.nextDouble();
          resultado = valor1 - valor2;
          System.out.println("Has seleccionado resta, el resultado de "+ valor1 + " - " + valor2 + " es: " + resultado);
        break;
        case 3: //Multiplicacion
          System.out.println("Multiplicación");
          System.out.println("Ingresa el primer valor");
          valor1 = scan.nextDouble();
          System.out.println("Ingresa el segundo valor");
          valor2 = scan.nextDouble();
          resultado = valor1 * valor2;
          System.out.println("Has seleccionado multiplicación, el resultado de "+ valor1 + " x " + valor2 + " es: " + resultado);
        break;
        case 4: //Division
          System.out.println("División");
          System.out.println("Ingresa el primer valor");
          valor1 = scan.nextDouble();
          System.out.println("Ingresa el segundo valor");
          valor2 = scan.nextDouble();
          resultado = valor1 / valor2;
          System.out.println("Has seleccionado división, el resultado de "+ valor1 + " / " + valor2 + " es: " + resultado);
        break;
        case 5:
          System.out.println("Saliendo");
        break;
        default:
          System.out.println("La opción ingresada no es posible");
      }
    }while(opcion != 5);
    //}while(opcion > 0 && opcion <= 4);
  }  
}
