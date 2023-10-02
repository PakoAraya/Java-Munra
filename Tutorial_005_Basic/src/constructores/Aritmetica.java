package constructores;

public class Aritmetica {
	public int a = 0;
	public int b = 0;
	
	//Constructor vacio
	public Aritmetica() {
		System.out.println("Este es un constructor vacio");
	}
	
	//Sobrecarga de constructores
	public Aritmetica(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Ejecutando constructor con argumentos");
	}
	
}
