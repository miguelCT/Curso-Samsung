package aplicacion_Empresa;

import static org.junit.Assert.*;

import org.junit.Test;

import aplicacion_Empresa.Comercial;


public class ComercialTest {
	private int[] arrayHoras = {2, 3, 4, 1}; 
	private double[] comisiones = {1, 2, 3, 4}; 
	private String[] arrayDni = {"1A", "2A", "3A", "4A"}; 
	private double[] salarios= {17, 26, 35, 12}; 
	
	
	public void testSalario(double salario,String dni, int horas, double comision) {
		Comercial com = new Comercial(dni, horas, comision);
		assertEquals(salario, com.salario(), 0.01);
	}
	
	@Test
	public void testSalario() {
		for (int i = 0; i < arrayHoras.length; i++){
			this.testSalario(salarios[i], arrayDni[i], arrayHoras[i], comisiones[i]);
			}
	}


	@Test
	public void testComercial() {
		Comercial com= new Comercial();
		assertEquals(com.getDni(), null);
		assertEquals(com.getHoras(),0);
		assertEquals(com.getComision(),0, 0.01);
	}



}
