package Patrones.Decorator.ejemplo_Decorator;

public abstract class Decorador extends Componente {
	private Componente c;

	public Decorador(Componente c) {
		this.c = c;
	}

	public Componente getC() {
		return c;
	}
}