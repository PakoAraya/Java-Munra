package constructores;

public class Caja {
	int ancho, alto, profundo, vol;
	
	//Constructor vacio
	public Caja() {
		System.out.println("Constructor vacio de la clase Caja");
	}
	
	public Caja(int ancho, int alto, int profundo) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
	}
	
	public int volumen() {
		return vol = ancho * alto * profundo;
		
	}
}
