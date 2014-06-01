package factoryMethod_Numero;

public class NumeroEN  extends Numero{
	private static String[] texto = { "zero", "one", "two", "three", "four", "five" };

	@Override
	public String convertir(int numero) {
		if (0 <= numero && numero <= 5) {
			return texto[numero];
		} else {
			return "???";
		}
	}
}
