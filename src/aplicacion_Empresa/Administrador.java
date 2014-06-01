package aplicacion_Empresa;

public class Administrador extends Empleado {
	
	public Administrador() {}
	public Administrador(String dni, int horas) {
		super(dni, horas);
		// TODO Auto-generated constructor stub
	}
	
	
	public double salario () {
		return this.getHoras()*10;
	}

}
