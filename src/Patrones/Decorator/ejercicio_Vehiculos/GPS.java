package Patrones.Decorator.ejercicio_Vehiculos;

public class GPS extends Extra {
	private final static int PRECIO=15;
	private final static String DESCRIPCION=" GPS ";
	
	public GPS(Vehiculo v) {
		super(v, PRECIO, DESCRIPCION);
	}

}
