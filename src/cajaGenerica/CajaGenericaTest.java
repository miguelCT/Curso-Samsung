package cajaGenerica;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class CajaGenericaTest {

	CajaGenerica<String> caja;
	
	@Before
	public void ini(){
		caja= new CajaGenerica<String>();
	}
	
	
	
	@Test
	public void testAlmacenaLleno() {
		try{
			caja.almacenar("texto1");
			caja.almacenar("texto2");
			fail("La excepción (la caja ya estaba llena) no ha saltado correctamente");
		}
		catch(RuntimeException e){}
	}

	
	@Test
	public void testExtraerVacio() {
		try{
			caja.extraer();
			fail("La excepción (la caja está vacía) no ha saltado correctamente");
		}
		catch(RuntimeException e){}
		
	}
	
	@Test
	public void testAlmacenarExtraer() {
		String texto= "texto";
		caja.almacenar(texto);
		String extraido= caja.extraer();
		assertEquals(texto, extraido);
	}

}
