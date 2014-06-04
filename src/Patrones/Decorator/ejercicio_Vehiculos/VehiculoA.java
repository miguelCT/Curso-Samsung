package Patrones.Decorator.ejercicio_Vehiculos;

public class VehiculoA extends Vehiculo {

	public VehiculoA(int precio, String descripcion) {
		super(precio, descripcion);
	}

	@Override
	public String descripcion() {
		return this.getDescripcion();
	}

	@Override
	public int precioFinal() {
		return this.getPrecio();
	}

}
