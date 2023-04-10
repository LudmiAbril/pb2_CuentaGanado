package ar.edu.unlam;

public class Test_main {

	public static void main(String[] args) {
		CuentaGanado contador = new CuentaGanado();

		System.out.println("el contador se inicializo en: " + contador.mostrar());

		contador.contar();
		contador.contar();

		System.out.println("el contador aumento a: " + contador.mostrar());

		contador.reset();

		System.out.println("el contador se reseteo a: " + contador.mostrar());

	}

}
