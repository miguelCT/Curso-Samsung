package aplicacion_Empresa;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import aplicacion_Empresa.Administrador;
import aplicacion_Empresa.Comercial;
import aplicacion_Empresa.Empleado;
import aplicacion_Empresa.Nomina;

public class NominaTest {
	
	
	@Test
	public void testTotalNominas() {
		Nomina nom= new Nomina();
		 assertEquals(70.0,nom.totalNominas(crearEmpleados()),0.01);
	}
	
	public ArrayList<Empleado> crearEmpleados(){
		ArrayList<Empleado> arrEmpleados= new ArrayList<>();
		Comercial com = new Comercial( "1A", 2, 4);
		Administrador admin = new Administrador( "2B", 5);
		arrEmpleados.add(com);
		arrEmpleados.add(admin);
		return arrEmpleados;
		
	}

}
