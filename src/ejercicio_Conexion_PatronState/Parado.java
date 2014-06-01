package ejercicio_Conexion_PatronState;


public class Parado extends State {

	@Override
	public void abrir(ConexionContext conexionContext) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public void cerrar(ConexionContext conexionContext) {
		throw new UnsupportedOperationException("Acción no permitida... ");
		
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
		throw new UnsupportedOperationException("Acción no permitida... ");
		
	}

	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}


}
