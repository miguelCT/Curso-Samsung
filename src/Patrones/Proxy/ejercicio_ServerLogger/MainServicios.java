package Patrones.Proxy.ejercicio_ServerLogger;

public class MainServicios {

	public static void main(String[] args) {
		Service serv= new ProxyTiempos();
		serv.service();
		serv.service();
		serv.service();
		serv.service();
		serv.service();
		serv.service();
		serv.service();
		serv.service();
		serv.service();
		serv.service();

	}

}
