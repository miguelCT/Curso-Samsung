package Patrones.State.ejercicio_Conexion_PatronState;


public class Parado extends State {

	@Override
	public void abrir(ConexionContext conexionContext) {
		throw new UnsupportedOperationException("Acci�n no permitida... ");
		
	}

	@Override
	public void cerrar(ConexionContext conexionContext) {
		throw new UnsupportedOperationException("Acci�n no permitida... ");
		
	}

	@Override
	public void parar(ConexionContext conexionContext) {
		
	}

	@Override
	public void iniciar(ConexionContext conexionContext) {
		conexionContext.setState(new Preparado());
		
	}

	@Override
	public void enviar(ConexionContext conexionContext, String msg) {
		throw new UnsupportedOperationException("Acci�n no permitida... ");
		
	}

	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}


}
