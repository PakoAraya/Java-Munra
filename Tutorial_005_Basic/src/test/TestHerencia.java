package test;

import java.util.Date;

import herencia.Cliente;
import herencia.EmpleadoPoo;

public class TestHerencia {
	public static void main(String[] args) {
//		EmpleadoPoo empleado1 = new EmpleadoPoo("Josué", 5000);
//		System.out.println("Empleado1: " + empleado1);
		Cliente cliente1 = new Cliente(new Date(), true, "Analissa", "Melchotto", 'f', 28, "Las Bananas #2468, Rosario, Buenos Aires, Argentina");
		System.out.println("Cliente 1:" + cliente1);
	}
}
