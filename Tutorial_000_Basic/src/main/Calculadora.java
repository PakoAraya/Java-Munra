package main;


import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("================================");
    System.out.println("Calculadora Básica");
    System.out.println("================================");
    System.out.println("Opciones: \n1)Suma\n2)Resta\n3)Multiplicación\n4)Division");
    int opcion = scan.nextInt();

    if (opcion > 4 || opcion <= 0) {
      System.out.println("La opción ingresada no es posible");
    } else {
      //ingreso de numeros o variables de calculo.
      System.out.println("Ingresa el primer valor: ");
      double variable1 = scan.nextDouble();
      System.out.println("Ingresa el segundo valor:");
      double variable2 = scan.nextDouble();
      double resultado;

      //opciones de calculadora
      if (opcion == 1) {
        resultado =  variable1 + variable2;
        System.out.println("Has escogido Suma, el resultado de la suma es: " + resultado);
      }else if(opcion == 2){
        resultado = variable1 - variable2;
        System.out.println("Has escogido Resta, el resultado de la resta es: " + resultado);
      }else if(opcion == 3){
        resultado = variable1 * variable2;
        System.out.println("Has escogido Multiplicación, el resultado de la multiplicación es: " + resultado);
      }else if(opcion == 4){
        resultado = variable1 / variable2;
        System.out.println("Has escodigo Division, el resultado de la división es: " + resultado);
      }
    }
  }
}
