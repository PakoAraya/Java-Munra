package com.m4_session12.ejemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Hoy vamos a comenzar a trabajar con ficheros
public class Ejemplo {
  public static void main(String[] args) {
    //Vamos a crear una variable para crear la ruta de acceso de ese archivo
    String nombreArchivo = "/Users/pako/Documents/intellij idea projects/Basic-Java-002/src/com/m4_session12/ejemplo/numeros.txt";
    //Ahora vamos a trabajar con Arraylist para almacenar las cosas que tenga el archivo.
    ArrayList<Integer> numeros = new ArrayList<>();
    //Ahora agregamos una variable que almacenara una sumatoria total de elementos.
    int sumaTotal=0;

    //Vamos a declarar un try-catch para sujetar los posibles errores
    try{
      //Vamos a traer el archivo y lo leeremos linea a linea
      FileReader fr = new FileReader(nombreArchivo);  //Obteniendo el archivo
      BufferedReader br = new BufferedReader(fr);     //Obteniendo la informacion o leerla
      //Vamos a recorrer el archivo en el bucle while
      String linea;
      while ((linea=br.readLine()) != null){  //Voy preguntando linea por linea del txt, si tiene algo, trae valor, sino trae nulo.
        System.out.println("linea: " + linea);
        //sumaTotal = sumaTotal + valor;
        int valor = Integer.parseInt(linea.trim());
        sumaTotal += valor;
        numeros.add(valor);     //con esto estariamos agregando valores al documento
      }
      //Vamos a recorrer el Arraylist para comprobar que guarda los datos en memoria.
      for (Integer numero:numeros){  //Vamos a recorrerlo con un foreach
        System.out.println("Numero: " + numero);
      }
      System.out.println("Suma total es: " + sumaTotal);

    } catch (IOException e) {
      //Rescatamos el error
      throw new RuntimeException(e);
    }
  }
}
