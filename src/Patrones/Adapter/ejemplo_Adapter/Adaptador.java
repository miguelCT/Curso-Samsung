package Patrones.Adapter.ejemplo_Adapter;

public class Adaptador implements Objetivo {
	private Adaptable adaptable;

	public Adaptador(Adaptable adaptable) {
		this.adaptable = adaptable;
	}

	@Override
	public void peticion() {
		this.adaptable.metodoExistente();
	}
}
