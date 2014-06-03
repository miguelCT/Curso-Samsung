package Patrones.Ejercicios_de_varios_Patrones.ProcesadorTextos;

import java.util.ArrayList;
import java.util.List;

public abstract class Compuesto extends Componente {
	private List<Componente> listaCompuestos;

	public Compuesto() {
		listaCompuestos = new ArrayList<>();
	}

	public List<Componente> getListaCompuestos() {
		return listaCompuestos;
	}

	@Override
	public boolean isCompuesto() {
		return true;
	}

	@Override
	public abstract String dibujar(boolean mayus);

	@Override
	public abstract void add(Componente c);

	@Override
	public abstract void remove(Componente c);

}
