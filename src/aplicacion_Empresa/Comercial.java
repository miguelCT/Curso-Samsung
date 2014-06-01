package aplicacion_Empresa;

public class Comercial  extends Empleado{


private double comision;

public Comercial(String dni, int horas, double comision) {
	super(dni, horas);
	this.comision=comision;
	// TODO Auto-generated constructor stub
}



public Comercial() {
	this.comision=0;
}



public double getComision() {
	return comision;
}

public void setComision(double comision) {
	this.comision = comision;
}

public double salario() {
	return (this.getComision()+this.getHoras()*8);
	}
}
