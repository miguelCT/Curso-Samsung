package factoryMethod_Numero;


public class CreadorNumeroES extends CreadorNumero{

	@Override
	public Numero crearNumero() {
		return new NumeroES();
	}

}
