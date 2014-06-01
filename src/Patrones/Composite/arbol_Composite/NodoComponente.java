package Patrones.Composite.arbol_Composite;



public abstract class NodoComponente {

	public NodoComponente() {

	}

	public abstract void remove(NodoComponente c);

	public abstract void add(NodoComponente c);

	public abstract boolean isComposite();

	public abstract int numHijos();

	public abstract int mayor();

	public abstract int suma();
}
