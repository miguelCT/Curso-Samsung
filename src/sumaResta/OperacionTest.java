package sumaResta;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class OperacionTest {
	private ArrayList<Operando> op = new ArrayList<Operando>();

	public void introducirValores() {
		Suma sum = new Suma(2, 3);
		Resta rest = new Resta(5, 1);
		op.add(sum);
		op.add(rest);
	}
	@Test
	public void testTotal() {
		Operacion o= new Operacion();
		assertEquals(9, o.total(op));
	}

}
