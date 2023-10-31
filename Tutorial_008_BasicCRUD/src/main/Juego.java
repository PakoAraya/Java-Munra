package main;

import java.lang.reflect.Array;
import java.util.Scanner;

import org.postgresql.jdbc2.ArrayAssistantRegistry;

public class Juego {
	public static void main(String[] args) {
    /*Dont't touch the code in this block*/
		Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();
    inp.nextLine();
    int[] array = new int[n];
    for(int i=0;i<n;i++)
    {
        array[i] = inp.nextInt();
        inp.nextLine();
    }
    inp.close();
    for(int i = array.length - 1;i>=0;i--)
        System.out.println(array[i]);
    
	}
}
