package gestion_de_Vehiculos;

public class Moto extends Vehiculo {

	public Moto(String identificador, String descripcion) {
		super(identificador, descripcion);
	}

	@Override
	public double precio(int dias) {
		assert dias > 0 : "Los días tienen que ser un numero positivo";
		double precio = 0;
		if (dias >= 0 && dias < 7) {
			precio = (8 * dias);
		} else if (dias > 7) {
			precio = (7 * dias);
		} else {
			assert false : "no deberíamos haber llegado a este caso";
		}
		return precio;
	}

}
