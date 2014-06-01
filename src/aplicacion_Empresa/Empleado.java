package aplicacion_Empresa;

public abstract class Empleado {

	private String dni;
	private int horas;

	public Empleado() {
		this.dni = null;
		this.horas = 0;
	}

	public Empleado(String dni, int horas) {
		this.dni = dni;
		this.horas = horas;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double salario() {
		return 0;
	}

}
