package Patrones.FactoryMethod.ejemplo_Patron_FactoryMethod;
import upm.jbb.IO;

public class Producto1 extends Producto {
	@Override
	public void view() {
		IO.out.println("FactoryMethod.Producto1");
	}
}