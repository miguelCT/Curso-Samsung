package aplicacion_Empresa;

import java.util.ArrayList;

public class Nomina {

	public Nomina(){};
	public double totalNominas(ArrayList<Empleado> empleados) {
		double total=0;
		for (Empleado emp: empleados){
			total=total+emp.salario();
		}
		return total;
	}


}
