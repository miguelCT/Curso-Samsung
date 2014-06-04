package Patrones.Proxy.ejercicio_ServerLogger;

import java.util.Date;

public class ProxyTiempos implements Service {
	private Server servidor;

	public ProxyTiempos() {
		servidor = new Server();
	}

	@Override
	public void service() {
		long tIni = new Date().getTime();
		servidor.service();
		long tFin = new Date().getTime();
		System.out.println("[Server: service] " + new Date().toString() + ">>>" + (tFin - tIni));
	}

}
