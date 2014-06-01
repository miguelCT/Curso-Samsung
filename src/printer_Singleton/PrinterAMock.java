package printer_Singleton;


public class PrinterAMock implements Printer {
	@Override
	public void print(String msg) {
		 System.out.println("A:" + msg);
	}

	@Override
	public String toString() {
		return "PrinterA";
	}
}