package com.javain12hours.ejemplo1;

import java.util.Scanner;

public class _11Consolidado4 {
  public static void main(String[] args) {
    //Variables
    String patente="";
    int tipoServicio, cantHoras, cont1=0, cont2=0, cont3=0;
    double total, totalDia=0;
    Scanner teclado = new Scanner(System.in);

    while (!patente.equalsIgnoreCase("fin")) {
      System.out.println("Ingrese placa patente: ");
      patente = teclado.nextLine();

      if (!patente.equalsIgnoreCase("fin")) {
        System.out.println("Ingrese el tipo de servicio:");
        System.out.println("1- Por hora");
        System.out.println("2- Media Jornada (5 horas)");
        System.out.println("3- Jornada Completa (Hasta 10 horas)");
        teclado = new Scanner(System.in);
        tipoServicio = teclado.nextInt();

        if (tipoServicio <= 0 || tipoServicio > 3) {
          System.out.println("No ingreso un tipo de servicio correcto...");
        } else {
          if (tipoServicio == 1) {
            System.out.println("Ingrese la cantidad de horas que desea estacionar: ");
            cantHoras = teclado.nextInt();
            total = cantHoras * 3;
            System.out.println("El total de su estacionamiento es: $" + total + " USD");
            cont1++;
            totalDia = totalDia + total;
          } else if (tipoServicio == 2) {
            System.out.println("El servicio de media jornada es de 5 horas y posee un descuento de un 5%: ");
            total = 15 - (15 * 0.05);
            System.out.println("El total de su estacionamiento es: $" + total + " USD");
            cont2++;
            totalDia = totalDia + total;
          } else {
            System.out.println("El servicio de jornada completa es de 10 horas y posee un descuento de un 10%: ");
            total = 30 - (30 * 0.10);
            System.out.println("El total de su estacionamiento es: $" + total + " USD");
            cont3++;
            totalDia = totalDia + total;
          }
          System.out.println("******* MUCHAS GRACIAS POR SU COMPRA!!! *******\n");
        }
        teclado = new Scanner(System.in); //Hay que reiniciar el scanner para que pueda leer un String o un entero.
      }
    }
    System.out.println("=============================================================");
    System.out.println("Totales Monetarios del día");
    System.out.println("Cantidad de servicios por hora: " + cont1);
    System.out.println("Cantidad de servicios de Media Jornada: " + cont2);
    System.out.println("Cantidad de servicios de Jornada completa: " + cont3);
    System.out.println("El monto total recaudado del dia es de: " + totalDia + "USD");
  }
}
