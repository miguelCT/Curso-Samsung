package Patrones.Decorator.ejercicio_Vehiculos;

public class MP3 extends Extra{
	private final static int PRECIO=20;
	private final static String DESCRIPCION=" MP3 ";
	
	public MP3(Vehiculo v) {
		super(v, PRECIO, DESCRIPCION);
	}
}
