package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {
	public static void main(String[] args) {
		Monitor monitorHP = new Monitor("HP", 14);
		Teclado tecladoHP = new Teclado("Bluetooth",	"HP");
		Raton ratonHP = new Raton("Bluetooth", "HP");
		Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
		
		Monitor monitorGamer = new Monitor("Gamer", 34);
		Teclado tecladoGamer = new Teclado("Bluetooth",	"Gamer");
		Raton ratonGamer = new Raton("Bluetooth", "Gamer");
		Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoHP, ratonGamer);
		
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);
		orden1.mostrarOrden();
	}
}
