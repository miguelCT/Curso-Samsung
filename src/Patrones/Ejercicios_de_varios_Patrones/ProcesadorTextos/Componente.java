package Patrones.Ejercicios_de_varios_Patrones.ProcesadorTextos;

public abstract class Componente {

	public Componente() {
	}

	public abstract boolean isCompuesto();

	public abstract String dibujar(boolean mayus);

	public abstract void add(Componente c);

	public abstract void remove(Componente c);

}
