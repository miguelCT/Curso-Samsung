package Patrones.AbstractFactory.ejercicio_TiposCuenta;

public class TCreditoOro extends TipoOro{

	private final int costeCredito = 20;
	private final int maximo = 4000;

	public int getCosteCredito() {
		return costeCredito;
	}

	public int getMaximo() {
		return maximo;
	}
}
