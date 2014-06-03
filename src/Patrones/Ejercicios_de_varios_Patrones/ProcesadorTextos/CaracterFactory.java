package Patrones.Ejercicios_de_varios_Patrones.ProcesadorTextos;

import java.util.HashMap;
import java.util.Map;

public class CaracterFactory {

	private static CaracterFactory factoria = new CaracterFactory();
	private Map<Character, Caracter> mapaCaracteres;

	private CaracterFactory() {
		mapaCaracteres = new HashMap<Character, Caracter>();
	}

	public static CaracterFactory getFactoria() {
		return factoria;
	}

	public Caracter get(char clave) {
		if (!mapaCaracteres.containsKey(clave)) {
			Caracter c = new Caracter(clave);
			mapaCaracteres.put(clave, c);
			return c;
		}

		else
			return mapaCaracteres.get(clave);
	}

}
