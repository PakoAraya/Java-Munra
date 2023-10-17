package main;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
	public static void main(String[] args) {
//		System.out.println("Dia 1 de la semana: " + Dias.LUNES);
//		indicarDiasSemana(Dias.VIERNES);
		
		System.out.println("Continente n4: " + Continentes.AMERICA);
		System.out.println("Paises en el 4 continente: " + Continentes.AMERICA.getPaises());
		
		System.out.println("Continente n1: " + Continentes.AFRICA);
		System.out.println("Paises en el 1 continente: " + Continentes.AFRICA.getPaises());
		
	}	
	private static void indicarDiasSemana(Dias dias) {
		switch(dias) {
		case LUNES:
			System.out.println("Primer dia de la semana");
			break;
		case MARTES:
			System.out.println("Segundo dia de la semana");
			break;
		case MIERCOLES:
			System.out.println("Tercer dia de la semana");
			break;
		case JUEVES:
			System.out.println("Cuarto dia de la semana");
			break;
		case VIERNES:
			System.out.println("Quinto dia de la semana");
			break;
		case SABADO:
			System.out.println("Sexto dia de la semana");
			break;
		case DOMINGO:
			System.out.println("Septimo dia de la semana");
			break;
			default:
				System.out.println("Se ha escogido una dia que no pertenece a una semana");
		}
	}
}
