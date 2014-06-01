package Patrones.Composite.arbol_Composite;

import java.util.ArrayList;
import java.util.List;

public class NodoCompuesto extends NodoComponente {
	private List<NodoComponente> listaHijos;
	public NodoCompuesto(String contenido) {
		listaHijos = new ArrayList<>();
	}

	@Override
	public void remove(NodoComponente c) {
		if (c != null) {
			listaHijos.remove(c);
		}

	}

	@Override
	public void add(NodoComponente c) {
		if (c != null) {
			listaHijos.add(c);
		}

	}

	@Override
	public boolean isComposite() {
		return true;
	}

	@Override
	public int numHijos() {			
		return listaHijos.size();
	}

	@Override
	public int mayor() {
		int mayor = Integer.MIN_VALUE;
		for (NodoComponente n : listaHijos)
			if(n.mayor()>mayor){
				mayor=n.mayor();
			}
		return mayor;
	}

	@Override
	public int suma() {
		int suma=Integer.MIN_VALUE;
		for(NodoComponente n: listaHijos)
			suma=suma+n.suma();
		return suma;
		}
}
