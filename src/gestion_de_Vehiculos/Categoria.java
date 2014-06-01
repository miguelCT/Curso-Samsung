package gestion_de_Vehiculos;

public enum Categoria {

	A(10), B(15), C(20);
	public final int precio;

	private Categoria(int precio) {
		this.precio = precio;
	}
}
