package Patrones.Decorator.ejercicio_Vehiculos;

public abstract class Extra extends Vehiculo {
	private Vehiculo v;
	
	public Extra(Vehiculo vehiculo, int precio, String descripcion){
		super(precio, descripcion);
		this.v=vehiculo;
		
	}

	public Vehiculo getVehiculo() {
		return v;
	}
	
	@Override
	public String descripcion() {
		return this.getVehiculo().descripcion()+this.getDescripcion();
	}

	@Override
	public int precioFinal() {
		return this.getPrecio()+this.getVehiculo().precioFinal();
	}
	
	

}
