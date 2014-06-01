package gestion_de_Vehiculos;

public class Coche extends Vehiculo {

	private Categoria categ;

	public Coche(String identificador, String descripcion, Categoria categoria) {
		super(identificador, descripcion);
		this.categ = categoria;
	}

	@Override
	public double precio(int dias) {
		assert dias > 0 : "Los días tienen que ser un numero positivo";
		double precio = 0;
		if (dias >= 0 && dias <= 3) {
			precio = categ.precio * dias;

		} else if (dias >= 4 && dias <= 7) {
			precio = dias * (categ.precio * 80) / 100;

		} else if (dias > 7) {
			precio = dias * (categ.precio * 50) / 100;

		} else {
			assert false : "no deberíamos haber llegado a este caso";
		}

		return precio;
	}

	@Override
	public String toString() {
		return "Coche [Categoria= " + categ + ", Identificador= "
				+ this.getIdentificador() + ", Descripcion= "
				+ this.getDescripcion() + "]";
	}

}
