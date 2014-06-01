package gestion_de_Vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BicicletaTest {

	@Test
	public void testPrecio() {
		Bicicleta bici= new Bicicleta("bici","descrip");
		double precio = bici.precio(10);
		assertEquals(20, precio, 0.001);
	}

}
