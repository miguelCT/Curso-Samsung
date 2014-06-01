package factoryMethod_Numero;


public class CreadorNumeroEN extends CreadorNumero {

	@Override
	public Numero crearNumero() {
		return new NumeroEN();
	}
}
