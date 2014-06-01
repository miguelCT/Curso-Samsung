package gestion_de_Vehiculos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MotoTest {

	@Test
	public void testPrecio() {
		Moto moto= new Moto("moto1", "descripcion");
		assertEquals(70,moto.precio(10), 0.01);
	}

}
