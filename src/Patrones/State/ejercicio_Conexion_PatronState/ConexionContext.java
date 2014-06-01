package Patrones.State.ejercicio_Conexion_PatronState;

public class ConexionContext {
	private State estado;
	private Emisor emisor;

	public ConexionContext() {
		this.estado = new Cerrado();
	}

	public Estado estado() {
		return this.estado.getEstado();
	}

	public void setEmisor(Emisor emisor) {
		this.emisor = emisor;
	}

	public Emisor getEmisor() {
		return emisor;
	}

	protected void setState(State estado) {
		this.estado = estado;
	}

	public void abrir() {
		estado.abrir(this);
	}

	public void cerrar() {
		estado.cerrar(this);
	}

	public void parar() {
		estado.parar(this);
	}

	public void iniciar() {
		estado.iniciar(this);
	}

	public void enviar(String msg) {
		estado.enviar(this, msg);
	}

}
