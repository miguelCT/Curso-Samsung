package Patrones.Visitor.Ejemplo_Visitor;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class Visitador3Test {
	private Collection<Elemento> coleccion = new ArrayList<Elemento>();

	@Before
	public void ini() {
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoB());
		coleccion.add(new ElementoB());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoA());
		coleccion.add(new ElementoB());
	}

	@Test
	public void testMaxAs() {
		Visitador3 v3 = new Visitador3();
		for (Elemento elemento : coleccion) {
			elemento.aceptar(v3);
		}
		assertEquals(4, v3.getMaxRepeticionesA());
		assertEquals(2, v3.getMaxRepeticionesB());
	}

	@Test
	public void testMaxBs() {
		Visitador3 v3 = new Visitador3();
		for (Elemento elemento : coleccion) {
			elemento.aceptar(v3);
		}
		assertEquals(2, v3.getMaxRepeticionesB());
	}
	
	@Test
	public void maximoRepeticiones() {
		Visitador3 v3 = new Visitador3();
		for (Elemento elemento : coleccion) {
			elemento.aceptar(v3);
		}
		assertEquals(4, v3.maximoRepeticiones());
	}
}
