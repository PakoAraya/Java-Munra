package test;

public class TestFinal {
	public static void main(String[] args) {
		final int miVariable = 10;
		System.out.println("Mi variable = " + miVariable);
		// miVariable = 5; Cuando se usa final no se puede volver a reasignar.
	}
}
