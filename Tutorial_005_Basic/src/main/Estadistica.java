package main;

import java.util.Scanner;

public class Estadistica {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("¿Cuantos datos tienes?");
    int total = scan.nextInt();
    double suma = 0;
    double valores[] = new double[total];
    for(int i=0; i < total; i++){
      System.out.println("Dar el valor " + (i+1));
      double aux = scan.nextDouble();
      valores[i] = aux;
      suma += aux;
    }
    double media = suma / total;
    double sumaDesviacion = 0;
    for (int i = 0; i < valores.length; i++) {
      sumaDesviacion += Math.pow(valores[i] - media,2);
    }
    double desviacion = Math.sqrt(sumaDesviacion / total);
    System.out.println("La media es: " + media);
    System.out.println("La desviacion estandar es: " + desviacion);
  }
}
