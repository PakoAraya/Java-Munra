package main;

public class Arrays {
  public static void main(String[] args) {
    int array1[] = new int[5];
    int array2[] = { 1, 2, 3, 4, 5, 6 };
    
    //vamos a cargar datos en el primer array, debemos recorrerlo
    array1[1] = 100;
    array1[2] = 500;
    array1[3] = 10;
    array1[4] = 200;
    array1[0] = 1;

    System.out.println("Array 1 en la posicion 3: " + array1[3]);
    System.out.println("Array 1 en la posicion 2: " + array1[2]);
    System.out.println("Array 1 en la posicion 0: " + array1[0]);

    array1[3] = 555;
    System.out.println("Array 1 en la posicion 3: " + array1[3]);
    System.out.println("==========================================");

    //Ahora veremos lo que se puede hacer con el otro array declarado y llenado.
    System.out.println("Array 2 en la posicion 2: " + array2[2]);
    System.out.println("Array 2 en la posicion 3: " + array2[3]);
    System.out.println("Array 2 en la posicion 5: " + array2[5]);

    array2[3] = 20;
    System.out.println("Array 2 en la posicion 3: " + array2[3]);

    System.out.println("==========================================");
    System.out.println("Impresion de Array 1: ");
    for (int i = 0; i < array1.length; i++) {
      System.out.println("Array 1 en la posicion " + i + ": " + array1[i]);
    }
    
    System.out.println("==========================================");
    System.out.println("Impresion de Array 2: ");
    for(int i=0; i< array2.length; i++){
      System.out.println("Array 2 en la posicion " + i + ": " + array2[i]);
    }
  }
}
