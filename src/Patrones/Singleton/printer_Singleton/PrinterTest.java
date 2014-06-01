package Patrones.Singleton.printer_Singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class PrinterTest {
	@Test
	public void testIsSingleton() {
		assertSame(PrinterFactory.getPrinterFactory(),
				PrinterFactory.getPrinterFactory());
	}

	@Test
	public void testIsFactory() {
		PrinterAMock pam = new PrinterAMock();
		PrinterBMock pbm = new PrinterBMock();
		PrinterFactory.getPrinterFactory().setPrinter(pam);
		assertSame(pam, PrinterFactory.getPrinterFactory().getPrinter());
		assertSame(pam, PrinterFactory.getPrinterFactory().getPrinter());
		PrinterFactory.getPrinterFactory().setPrinter(pbm);
		assertSame(pbm, PrinterFactory.getPrinterFactory().getPrinter());
	}
	
	@Test
	public void testSingletonNotNull() {
		assertNotNull(PrinterFactory.getPrinterFactory());
	}
}