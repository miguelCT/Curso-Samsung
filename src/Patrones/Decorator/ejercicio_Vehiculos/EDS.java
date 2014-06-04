package Patrones.Decorator.ejercicio_Vehiculos;

public class EDS extends Extra {
	private final static int PRECIO=20;
	private final static String DESCRIPCION=" EDS ";
	
	public EDS(Vehiculo vehiculo) {
		super(vehiculo, PRECIO, DESCRIPCION);
	}

}
