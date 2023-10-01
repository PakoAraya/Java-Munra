package main;

public class Learn {
	public static void main(String[] args) {
		var mes = 1;
		var estacion = "Estacion desconocida";
		
		switch (mes) {
		case 1:	case 2: case 12:
			estacion = "Verano";
			break;
		case 3: case 4: case 5:
			estacion = "Otono";
			break;
		case 6: case 7: case 8:
			estacion = "Invierno";
			break;
		case 9: case 10: case 11:
			estacion = "Primavera";
		default:
			System.out.println("Error en el ingreso de estacion");
			break;
		}
		System.out.println("Estacion es: " + estacion);
	}

}
