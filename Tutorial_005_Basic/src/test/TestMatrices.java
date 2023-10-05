package test;

import operaciones.PersonaArray;

public class TestMatrices {
	public static void main(String[] args) {
		int edades[][] = new int[3][2];
		System.out.println("Edades = " + edades);
		
		edades[0][0] = 5;
		edades[0][1] = 7;
		edades[1][0] = 8;
		edades[1][1] = 4;
		
		//Impresion a pulso
		//System.out.println("Edades 0-0 = " + edades[0][0]);
		//System.out.println("Edades 0-1 = " + edades[0][1]);
		
		//Impresion con ciclos for
		for (int i = 0; i < edades.length; i++) {
			for (int j = 0; j < edades[i].length; j++) {
				System.out.println("Edades = " + i + "-" + j + " = " + edades[i][j]);
			}			
		}
		
		//Declaracion facil de matriz
		String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora"}};
		
		for (int i = 0; i < frutas.length; i++) {
			for (int j = 0; j < frutas[i].length; j++) {
				System.out.println("Frutas = " + i + "-" + j + " = " + frutas[i][j]);
			}
		}
		
		PersonaArray personas[][] = new PersonaArray[2][3];
		personas[0][0] = new PersonaArray("Marcela");
		personas[0][1] = new PersonaArray("Pamela");
		imprimir(personas);
		
		
	}
	
	public static void imprimir(Object matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Matriz = " + i + "-" + j + " = " + matriz[i][j]);
			}			
		}
	}
}
