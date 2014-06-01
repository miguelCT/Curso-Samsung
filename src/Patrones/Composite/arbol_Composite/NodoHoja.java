package Patrones.Composite.arbol_Composite;

public class NodoHoja extends NodoComponente {
	private int contenido;

	public NodoHoja(int i) {
		this.contenido = i;
	}

	@Override
	public void remove(NodoComponente c) {}

	@Override
	public void add(NodoComponente c) {
		throw new UnsupportedOperationException("No se puede añadir a un nodo hoja");
		
	}

	@Override
	public boolean isComposite() {
		return false;
	}

	@Override
	public int numHijos() {
		return 0;
	}

	@Override
	public int mayor() {
		return this.contenido;
	}

	@Override
	public int suma() {
		return this.contenido;
	}

}
