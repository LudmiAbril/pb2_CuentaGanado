package ar.edu.unlam;

public class CuentaGanado {
	private Integer actual;

	public CuentaGanado() {
		this.actual = 0;
	}

	public void contar() {
		this.actual = this.actual + 1;
	}

	public void reset() {
		this.actual = 0;
	}

	public Integer mostrar() {
		return actual;
	}

}
