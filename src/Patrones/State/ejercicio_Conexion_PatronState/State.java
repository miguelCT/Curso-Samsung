package Patrones.State.ejercicio_Conexion_PatronState;

public abstract class State {
	public abstract Estado getEstado();

	public abstract void abrir(ConexionContext conexionContextState);

	public abstract void cerrar(ConexionContext conexionContextState);

	public abstract void parar(ConexionContext conexionContextState);

	public abstract void iniciar(ConexionContext conexionContextState);

	public abstract void enviar(ConexionContext conexionContextState, String msg);
}
