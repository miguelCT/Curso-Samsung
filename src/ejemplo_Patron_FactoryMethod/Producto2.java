package ejemplo_Patron_FactoryMethod;
import upm.jbb.IO;

public class Producto2 extends Producto {
	@Override
	public void view() {
		IO.out.println("FactoryMethod.Producto2");
	}
}
