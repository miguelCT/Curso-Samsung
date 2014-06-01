package gestion_de_Vehiculos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GestorTest {

	@Test
	public void testDarPrecioA() {
		Gestor gestor = new Gestor();
		Categoria categoriaA;
		categoriaA = Categoria.A;
		Coche cocheA = new Coche("coche1", "esto es un coche", categoriaA);
		gestor.darAlta(cocheA);
		assertEquals(5, gestor.darPrecio("coche1", 12), 0.001);

	}

	@Test
	public void testDarPrecioC() {
		Gestor gestor = new Gestor();
		Categoria categoriaC;
		categoriaC = Categoria.C;
		Coche cocheC = new Coche("coche2", "esto es un coche", categoriaC);
		gestor.darAlta(cocheC);
		assertEquals(10, gestor.darPrecio("coche2", 12), 0.001);

	}

	@Test
	public void testDarAlta() {
		Gestor gestor = new Gestor();
		Categoria categoriaC;
		categoriaC = Categoria.C;
		Categoria categoriaA;
		categoriaA = Categoria.A;

		Coche cocheC = new Coche("coche2", "esto es un coche", categoriaC);
		Bicicleta bici = new Bicicleta("bici1", "esto es una bici");
		Coche cocheA = new Coche("coche2", "esto es un coche", categoriaA);
		assertTrue(gestor.darAlta(cocheC));
		assertTrue(gestor.darAlta(bici));
		assertFalse(gestor.darAlta(cocheA));
	}

}
