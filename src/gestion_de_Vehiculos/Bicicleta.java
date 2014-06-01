package gestion_de_Vehiculos;

public class Bicicleta extends Vehiculo {

	public Bicicleta(String identificador, String descripcion) {
		super(identificador, descripcion);
	}

	@Override
	public double precio(int dias) {
		assert dias > 0 : "Los días tienen que ser un numero positivo";
		double precio = 0;
		if (dias >= 0 && dias <= 2) {
			precio = (3 * dias);
		} else if (dias > 2) {
			precio = (2 * dias);
		} else {
			assert false : "no deberíamos haber llegado a este caso";
		}
		return precio;

	}

}
