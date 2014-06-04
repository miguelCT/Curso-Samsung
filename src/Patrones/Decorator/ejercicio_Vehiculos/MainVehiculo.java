package Patrones.Decorator.ejercicio_Vehiculos;

public class MainVehiculo {

	public static void main(String[] args) {
		Vehiculo vehiculo= new VehiculoA(100, "vehiculoA");
		Vehiculo decoradorMP3= new MP3(vehiculo);
		System.out.println(decoradorMP3.descripcion());
		System.out.println(decoradorMP3.precioFinal());
		System.out.println(new EDS(decoradorMP3).descripcion());
		System.out.println(new EDS(decoradorMP3).precioFinal());
		System.out.println(new GPS(vehiculo).descripcion());
		System.out.println(new GPS(vehiculo).precioFinal());
		

	}

}
