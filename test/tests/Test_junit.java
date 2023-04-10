package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.CuentaGanado;

public class Test_junit {

	@Test
	public void queSePuedaCrearElCuentaGanado() {
		CuentaGanado contador = new CuentaGanado();

		assertNotNull(contador);
	}
	
	@Test
	public void queSePuedaMostrarElNumeroActual() {
		CuentaGanado contador = new CuentaGanado();
        Integer actual = contador.mostrar();
		
		assertNotNull(actual);
	}

	@Test
	public void queSePuedaContar() {
		CuentaGanado contador = new CuentaGanado();

		contador.contar();
		contador.contar();

		Integer deseado = 2;
		Integer obtenido = contador.mostrar();

		assertEquals(deseado, obtenido);
	}
	
	@Test
	public void queSePuedaResetear() {
		CuentaGanado contador = new CuentaGanado();

		contador.contar();
		contador.contar();
		
		contador.reset();

		Integer deseado = 0;
		Integer obtenido = contador.mostrar();

		assertEquals(deseado, obtenido);
	}

}
