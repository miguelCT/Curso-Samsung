package Patrones.Iterator.EjemploGeneral;

import java.util.Iterator;

public class Nodo implements Iterable<Integer> {
	private int valor;
	private Nodo siguiente;

	public Nodo(int valor) {
		this.valor = valor;
		this.siguiente = null;
	}

	public boolean isUltimo() {
		return this.siguiente == null;
	}

	public int getValor() {
		return this.valor;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void insertar(Nodo subNodo) {
		Nodo anterior = this.siguiente;
		this.siguiente = subNodo;
		subNodo.siguiente = anterior;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new IteratorNodo(this);
	}
}
