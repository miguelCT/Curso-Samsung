package printer_Singleton;


public class PrinterBMock implements Printer {
	@Override
	public void print(String msg) {
		 System.out.println("B:" + msg);
	}

	@Override
	public String toString() {
		return "PrinterB";
	}
}
