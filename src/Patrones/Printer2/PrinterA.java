package Patrones.Printer2;

import upm.jbb.IO;

public class PrinterA implements Printer {
	@Override
	public void print(String msg) {
		IO.out.println("PrinterA >>> " + msg);
	}
}
