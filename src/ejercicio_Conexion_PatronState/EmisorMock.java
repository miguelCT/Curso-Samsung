package ejercicio_Conexion_PatronState;


public class EmisorMock implements Emisor{
	
	String mensaje;

	public Object getMsg() {
		return mensaje;
	}

	@Override
	public void enviar(String msg) {
		this.mensaje=msg;
		
	}

}
