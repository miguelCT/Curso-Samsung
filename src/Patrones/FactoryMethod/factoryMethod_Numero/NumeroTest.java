package Patrones.FactoryMethod.factoryMethod_Numero;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class NumeroTest {
	private CreadorNumero creadorEn = new CreadorNumeroEN();
	private CreadorNumero creadorEs = new CreadorNumeroES();

	@Test
	public void testIsNew() {
		Numero num = creadorEn.crearNumero();
		assertNotSame(creadorEn.crearNumero(), num);
	}

	@Test
	public void testConvertir() {
		assertEquals("0 a ES", "cero",
				this.creadorEs.crearNumero().convertir(0).toLowerCase());
		assertEquals("5 a EN", "five",
				this.creadorEn.crearNumero().convertir(5).toLowerCase());
	}
}