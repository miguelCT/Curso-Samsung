package aplicacion_Empresa;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdminstradorTest {
	private String[] arrayDni = { "1A", "2A", "3A", "4A" };
	private int[] arrayHoras = { 2, 3, 4, 1 };
	private double[] salarios= {20, 30, 40, 10};
 
	public void testSalario(double salario, String dni, int horas) {
		Administrador com = new Administrador(dni, horas);
		assertEquals(salario, com.salario(), 0.01);
	}

	@Test
	public void testSalario() {
		for (int i = 0; i < arrayHoras.length; i++) {
			this.testSalario(salarios[i], arrayDni[i], arrayHoras[i]);
		}
	}

	@Test
	public void testAdminstrador() {
		Administrador admin = new Administrador();
		assertEquals(admin.getDni(), null);
		assertEquals(admin.getHoras(), 0);
	}

	@Test
	public void testAdminstradorStringInt() {
		for (int i = 0; i < arrayHoras.length; i++) {
			String dni= arrayDni[i];
			int horas= arrayHoras[i];
			Administrador admin = new Administrador(dni, horas);
			assertEquals(admin.getDni(), dni);
			assertEquals(admin.getHoras(), horas);
		}
	}

}
