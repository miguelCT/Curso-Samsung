package Patrones.Ejercicios_de_varios_Patrones.ProcesadorTextos;

public class Caracter extends Componente {
	private char caracter;

	public Caracter(char caracter) {
		this.caracter = caracter;
	}

	@Override
	public boolean isCompuesto() {
		return false;
	}

	@Override
	public String dibujar(boolean mayus) {

		if (mayus)
			return Character.toString(this.caracter).toUpperCase();
		else
			return Character.toString(this.caracter);
	}

	@Override
	public void add(Componente c) {
	}

	@Override
	public void remove(Componente c) {

	}

}
