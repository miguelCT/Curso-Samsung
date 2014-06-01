package noticiero;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NoticieroTest {

	private Noticiero n;
	private ReceptorMock rec;
	
	@Before
	public void ini(){
		n= new Noticiero();
		rec= new ReceptorMock();
	}

	@Test
	public void testRegistrar() {
		n.registrar(rec);
		assertEquals(1,n.getReceptores().size());
		
	}

	@Test
	public void testInformar() {
		n.registrar(rec);
		n.informar("correcto");
		assertEquals("correcto", rec.getNoticia());
		
	}

}
