package Patrones.Iterator.EjemploGeneral;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

public class NodoTest {
	Nodo n0, n1;

	@Before
	public void ini() {
		this.n0 = new Nodo(0);
		this.n1 = new Nodo(1);
		this.n0.insertar(this.n1);
	}

	@Test
	public void testIsUltimoCierto() {
		assertTrue(this.n1.isUltimo());
	}

	@Test
	public void testIsUltimoFalso() {
		assertFalse(this.n0.isUltimo());
	}

	@Test
	public void testInsertar() {
		assertSame(this.n0.getSiguiente(), n1);
	}

	@Test
	public void testInsertarIntermedio() {
		Nodo n2 = new Nodo(2);
		n0.insertar(n2);
		assertSame(n2.getSiguiente(), n1);
	}

	@Test
	public void iterador() {
		Iterator<Integer> iti = n0.iterator();
		int v = 0;
		while (iti.hasNext()) {
			assertSame(v++, iti.next());
		}
		assertEquals(2, v);
	}
}