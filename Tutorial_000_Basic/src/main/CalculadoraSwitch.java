package main;


import java.util.Scanner;

public class CalculadoraSwitch {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("================================");
    System.out.println("Calculadora Switch");
    System.out.println("================================");
    System.out.println("Opciones: \n1)Suma\n2)Resta\n3)Multiplicación\n4)Division");
    int opcion = scan.nextInt();
    double variable1, variable2, resultado;

    switch (opcion) {
      case 1: //Suma
        System.out.println("Ingresa el primer valor: ");
        variable1 = scan.nextDouble();
        System.out.println("Ingresa el segundo valor:");
        variable2 = scan.nextDouble();
        resultado = variable1 + variable2;
        System.out.println("Has seleccionado suma, el resultado de "+ variable1 + " + " + variable2 + " es: " + resultado);
      break;
      case 2: //Resta
        System.out.println("Ingresa el primer valor: ");
        variable1 = scan.nextDouble();
        System.out.println("Ingresa el segundo valor:");
        variable2 = scan.nextDouble();
        resultado = variable1 - variable2;
        System.out.println("Has seleccionado resta, el resultado de "+ variable1 + " - " + variable2 + " es: " + resultado);
      break;
      case 3: //Multiplicacion
        System.out.println("Ingresa el primer valor: ");
        variable1 = scan.nextDouble();
        System.out.println("Ingresa el segundo valor: ");
        variable2 = scan.nextDouble();
        resultado = variable1 * variable2;
        System.out.println(
        "Has seleccionado multiplicación, el resultado de " + variable1 + " x " + variable2 + " es: " + resultado);
      break;
      case 4: //Division
        System.out.println("Ingresa el primer valor: ");
        variable1 = scan.nextDouble();
        System.out.println("Ingresa el segundo valor: ");
        variable2 = scan.nextDouble();
        resultado = variable1 / variable2;
        System.out.println(
        "Has seleccionado división, el resultado de " + variable1 + " / " + variable2 + " es: " + resultado);
      break;
      default:
        System.out.println("La opción ingresada no es posible");
      break;
    }
  }
}