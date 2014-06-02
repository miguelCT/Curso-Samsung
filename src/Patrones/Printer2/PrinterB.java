package Patrones.Printer2;

import upm.jbb.IO;

public class PrinterB implements Printer {
@Override
public void print(String msg) {
		IO.out.println("PrinterB >>> " + msg);
}
}
