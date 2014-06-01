package ejercicio_Conexion_PatronState;

public class Preparado extends State {

	@Override
	public void abrir(ConexionContext conexionContext) {

	}

	@Override
	public void cerrar(ConexionContext conexionContext) {
		conexionContext.setState(new Cerrado());

	}

	@Override
	public void parar(ConexionContext conexionContext) {
		conexionContext.setState(new Parado());

	}

	@Override
	public void iniciar(ConexionContext conexionContext) {

	}

	@Override
	public void enviar(ConexionContext conexionContext, String msg) {
		conexionContext.getEmisor().enviar(msg);

	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}

}
