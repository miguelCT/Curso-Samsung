package Patrones.Memento.ejercicio_Calculadora;

public interface Mementable<T> {
	T createMemento();

	void restoreMemento(T memento);
}
