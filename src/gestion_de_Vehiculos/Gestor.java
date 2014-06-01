package gestion_de_Vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Gestor {
	private Map<String, Vehiculo> almacenVehiculos;

	public Gestor() {
		almacenVehiculos = new HashMap<>();
	}

	public double darPrecio(String id, int dias) {
		if (almacenVehiculos.containsKey(id)) {
			Vehiculo v = almacenVehiculos.get(id);
			v.precio(dias);
			return v.precio(dias);
		}
		return 0;
	}

	public boolean darAlta(Vehiculo v) {
		if (!almacenVehiculos.containsKey(v.getIdentificador())) {
			almacenVehiculos.put(v.getIdentificador(), v);
			return true;
		} else {
			return false;
		}

	}

	public String obtenerVehiculos() {
		return almacenVehiculos.values().toString(); 
	}

}
