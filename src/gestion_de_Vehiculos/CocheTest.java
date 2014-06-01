package gestion_de_Vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CocheTest {

	@Test
	public void testPrecio() {
		Categoria categoriaA;
		categoriaA = Categoria.A;
		Coche coche = new Coche("coche1", "esto es un coche", categoriaA);
		double precio = coche.precio(10);
		assertEquals(50, precio, 0.001);
	}

}
