package Patrones.Composite.ejemplo_Patron_Composite;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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
			fail("La excepci�n (la caja ya estaba llena) no ha saltado correctamente");
		}
		catch(RuntimeException e){}
	}

	
	@Test
	public void testExtraerVacio() {
		try{
			caja.extraer();
			fail("La excepci�n (la caja est� vac�a) no ha saltado correctamente");
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
