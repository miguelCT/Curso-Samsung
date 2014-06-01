package factoryMethod_Numero;

public class NumeroES extends Numero {

	private static String[] texto = { "cero", "uno", "dos", "tres", "cuatro", "cinco" };

	@Override
	public String convertir(int numero) {
		if (0 <= numero && numero <= 5) {
			return texto[numero];
		} else {
			return "???";
		}
	}

}
