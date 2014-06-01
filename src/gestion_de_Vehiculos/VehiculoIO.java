package gestion_de_Vehiculos;

import upm.jbb.IO;

public class VehiculoIO {
	private Gestor gestor;

	public VehiculoIO() {
		gestor = new Gestor();
	}

	public void insertarCoche() {
		Coche coche = (Coche) IO.in.read("vehiculos.Coche",
				"Introduce la información de un coche");
		if (coche.getIdentificador().isEmpty())
			IO.out.println("El identificador no puede estar vacío");
		else if (!gestor.darAlta(coche))
			IO.out.println("No se ha podido introducir el coche porque ya existía uno con el mismo Identificador");

	}

	public void insertarMoto() {
		Moto moto = (Moto) IO.in.read("vehiculos.Moto",
				"Introduce la información de una moto");
		if (moto.getIdentificador().isEmpty())
			IO.out.println("El identificador no puede estar vacío");
		gestor.darAlta(moto);

	}

	public void insertarBicicleta() {
		Bicicleta bici = (Bicicleta) IO.in.read("vehiculos.Bicicleta",
				"Introduce la información de una bicicleta");
		if (bici.getIdentificador().isEmpty())
			IO.out.println("El identificador no puede estar vacío");
		gestor.darAlta(bici);

	}

	public void precioPorDias() {
		String id = (String) IO.in.read("String", "Inserta identificador");
		int dias = (int) (IO.in.read("Integer", "Inserta dias"));
		double precio = gestor.darPrecio(id, dias);
		if (dias >= 0 && precio > 0)
			IO.out.println("El precio resultante es " + precio);
		else if (dias < 0)
			IO.out.println("No se permiten numero negativos en los dias");
		else if (precio == 0)
			IO.out.println("No se ha encontrado un coche con el identificador "
					+ " \" " + id + " \"");
	}

	public void VerListaVehiculos() {
		String listaVehiculos = gestor.obtenerVehiculos();
		if (listaVehiculos != "[]")
			IO.out.println(gestor.obtenerVehiculos());
		else
			IO.out.println("La lista de Vehiculos está vacía");
	}

	public static void main(String[] args) {
		IO.in.addController(new VehiculoIO());
	}

}
