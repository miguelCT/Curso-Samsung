package Patrones.Ejercicios_de_varios_Patrones.ProcesadorTextos;

public class Texto extends Compuesto {

	public Texto() {

	};

	@Override
	public void add(Componente c) {
		if (!c.isCompuesto())
			throw new UnsupportedOperationException(
					"No se permite añadir caracteres a un texto");
		else
			this.getListaCompuestos().add(c);

	}

	@Override
	public void remove(Componente c) {
		// TODO Auto-generated method stub

	}

	@Override
	public String dibujar(boolean mayus) {
		String dibujo = "";
		for (Componente c : getListaCompuestos())
			dibujo = dibujo + c.dibujar(mayus);
		return dibujo + "---o---\n";
	}

}
