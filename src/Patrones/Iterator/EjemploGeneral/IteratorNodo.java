package Patrones.Iterator.EjemploGeneral;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorNodo implements Iterator<Integer> {
	private Nodo actual;

	public IteratorNodo(Nodo actual) {
		this.actual = actual;
	}

	@Override
	public boolean hasNext() {
		return this.actual != null;
	}

	@Override
	public Integer next() {
		if (!this.hasNext()) {
			throw new NoSuchElementException();
		}
		Nodo ant = this.actual;
		this.actual = this.actual.getSiguiente();
		return ant.getValor();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}