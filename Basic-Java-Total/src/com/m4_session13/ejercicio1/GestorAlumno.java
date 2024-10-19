package com.m4_session13.ejercicio1;
/*
Programa: GestorAlumno con Validaciones de Entrada
Descripción: Este programa debe gestionar alumnos, validando que el nombre no
esté vacío, que la edad sea mayor a 0 y que la nota esté en el rango de 1 a 7. Si alguna
entrada no cumple con estas condiciones, se lanza una excepción específica para
que el usuario pueda corregir el error.
Validar metodo guardar(), donde no debe permitir guardar texto vacio.
Reglas de Validación
1. Nombre: No puede estar vacío.                     √
2. Edad: Debe ser un número mayor a 0.               √
3. Nota: Debe estar comprendida entre 1 y 7.         √
TIP: investigar IllegalArgumentException
Validar metodo guardar(), donde no debe permitir guardar texto vacio.        √
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class GestorAlumno {
  public static String nombreArchivo = "/Users/pako/Documents/intellij idea projects/Basic-Java-002/src/com/m4_session13/ejercicio1/numeros.txt";


  public static void main(String[] args) throws Exception {
    //MAIN
    System.out.println("lectura y escritura de Alumnos: ");

    Scanner scanner = new Scanner(System.in);

    try {
      for (int i = 0; i < 3; i++) {

        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();
        validarNombre(nombre);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        validarEdad(edad);

        scanner.nextLine();

        System.out.print("Ingrese la nota: ");
        Double nota = scanner.nextDouble();
        validarNota(nota);

        Alumno alumno = new Alumno(nombre, edad, nota);

        guardar(alumno);
        scanner.nextLine();
      }

      ArrayList<Alumno> alumnoLectura = new ArrayList<>();


      alumnoLectura = lectura();

      mostrar(alumnoLectura);

      calcularPromedio(alumnoLectura);
    } catch (Exception e) {
      //throw new RuntimeException(e);
      System.out.println("Error General: " + e.getMessage());
    }
  }

  //                                                                  //indica que genera excepciones + tipo de excepcion
  public static void calcularPromedio(ArrayList<Alumno> listaAlumnos) throws Exception {
    Double promedio = 0.0;
    try {

      if (listaAlumnos.size() <= 1) {
        //tipo de excepcion a generar
        throw new Exception("debe ser una lista superior a un alumno");
      }
      System.out.println("Calculo de promedio: ");
      Double notas = 0.0;
      //[Alumno][Alumno][Alumno]
      for (Alumno alumno : listaAlumnos) {
        notas += alumno.getNota();
      }


      promedio = notas / listaAlumnos.size();


    } catch (ArithmeticException e) {
      System.out.println("Error aritmetico " + e);

    } catch (Exception e) {
      System.out.println("Excepción capturada: " + e.getMessage());
    } finally {
      //siempre se ejecuta al final
      System.out.println("El promedio general es " + promedio);
    }
  }

  public static <T> void mostrar(ArrayList<T> lista) {
    for (T valor : lista) {
      System.out.println(valor.toString());
    }
  }

  public static <T> void guardar(T valor) {
    try{

      if(valor == null){
        throw new IllegalArgumentException("No se puede guardar objetos vacios");
      }

    FileWriter fw = new FileWriter(nombreArchivo, true);
         PrintWriter pw = new PrintWriter(fw);
      pw.println(valor.toString());
      pw.close();
    } catch (IOException e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }catch (IllegalArgumentException e){
      System.out.println("Objeto vacio " + e.getMessage());
    }
  }


  public static ArrayList<Alumno> lectura() {

    ArrayList<Alumno> alumnoList = new ArrayList<>();
    try {
      System.out.println("Valores de lectura: ");

      FileReader fr = new FileReader(nombreArchivo);
      BufferedReader br = new BufferedReader(fr);

      String linea;

      while ((linea = br.readLine()) != null) {

        String[] partes = linea.trim().split(",");
        Alumno alumno = new Alumno(
                partes[0].trim(),//nombre
                Integer.parseInt(partes[1]),//edad
                Double.parseDouble(partes[2])//nota
        );

        alumnoList.add(alumno);
      }
    } catch (IOException e) {
      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
    return alumnoList;

  }

  //Construir metodo validar nombre
  public static void validarNombre(String nombre) {
    if (nombre == null || nombre.trim().isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacio.");
    }
  }

  //Construir metodo validar edad
  public static void validarEdad(int edad){
    if(edad <= 0){
      throw new IllegalArgumentException("La edad no puede ser menor a 0.");
    }
  }

  //Construir el metodo para validar nota
  public static void validarNota(double nota){
    if(nota < 1 || nota > 7){
      throw new IllegalArgumentException("La nota debe estar entre 1 y 7.");
    }
  }
}
