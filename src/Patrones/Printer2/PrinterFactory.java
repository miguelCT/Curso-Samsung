package Patrones.Printer2;

import java.util.HashMap;
import java.util.Map;

public class PrinterFactory {
	private Map<String, Printer> impresoras = new HashMap<String, Printer>();

	public PrinterFactory() {
		impresoras.put("A", new PrinterA());
		impresoras.put("B", new PrinterB());
		impresoras.put("C", new PrinterC());
	}

	public Printer get(String clave) {
		return impresoras.get(clave);
	}
}
