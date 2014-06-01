package printer_Singleton;


public class PrinterMain {

	public static void main(String[] args) {
		PrinterFactory printF= PrinterFactory.getPrinterFactory();
		printF.setPrinter(new PrinterAMock());
		Printer p=printF.getPrinter();
		p.print("hola");
		System.out.println(p.toString());
		}

}
