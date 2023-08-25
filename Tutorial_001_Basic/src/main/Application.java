package main;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		// System.out.println("Ahora si que si con Java Java Du!!!");
		// System.out.println("Java con versionamiento en GitHub");
		
		// String apellido = "Mesa";
		// String nombre = "Juan";
		
		// Persona persona = new Persona();
		// persona.setApellido(apellido);
		// persona.setNombre(nombre);
		
		// System.out.println("El nombre de la persona es: " + nombre + " " + apellido );

		//Consumo de API REST desde Java, probando nuevas tecnologías.
		//Solicitar datos de la API REST, al hacer conexión, se solicita try catch.

		try{ 
			URL url = new URL("https://geocoding-api.open-meteo.com/v1/search?name=Santiago&count=10&language=es&format=json");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			//Petición correcta = 200 => Solicitud válida.
			int responseCode = conn.getResponseCode();
			if(responseCode != 200){
				System.out.println("Error: " + responseCode);
				throw new RuntimeException("Ocurrió un Error: " + responseCode);
			} else {
				//Abrir un Scanner que lea el flujo de datos
				System.out.println("Petición correcta");
				StringBuilder informationString = new StringBuilder();
				Scanner scanner = new Scanner(url.openStream());

				while (scanner.hasNext()) {
					informationString.append(scanner.nextLine());
				}
				scanner.close();
				//Pintar la información obtenida por consola.
				System.out.println(informationString);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
