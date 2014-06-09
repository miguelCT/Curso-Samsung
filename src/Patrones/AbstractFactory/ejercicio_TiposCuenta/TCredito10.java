package Patrones.AbstractFactory.ejercicio_TiposCuenta;

public class TCredito10 extends Tipo10{

	private final int costeCredito = 10;
	private final int maximo = 2000;

	public int getCosteCredito() {
		return costeCredito;
	}

	public int getMaximo() {
		return maximo;
	}

}
