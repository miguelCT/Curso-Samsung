package ejemplo_Patron_FactoryMethod;


public class Creador2 extends Creador {
	@Override
	public Producto crearProducto() {
		return new Producto2();
	}

	@Override
	public String toString() {
		return "Creador de Producto2";
	}
}