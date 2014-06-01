package Patrones.Singleton.printer_Singleton;

public class PrinterFactory {
	private static PrinterFactory printerFactory= new PrinterFactory();
	private Printer printer = null;

	private PrinterFactory(){};
	
	public static PrinterFactory getPrinterFactory(){
		return PrinterFactory.printerFactory;
		
	}
	public Printer getPrinter() {
		return this.printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
}