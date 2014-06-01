package gestion_de_Vehiculos;

public abstract class Vehiculo {
	private String identificador;
	private String descripcion;

	public Vehiculo(String identificador, String descripcion) {
		this.identificador = identificador;
		this.setDescripcion(descripcion);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public abstract double precio(int dias);

	@Override
	public String toString() {
		return "Vehiculo [identificador= " + identificador + ", descripcion= "
				+ descripcion + "]";
	}

}
