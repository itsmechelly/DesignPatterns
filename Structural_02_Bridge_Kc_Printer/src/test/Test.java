package test;

import printers.BasicPrinter;
import printers.DeluxPrinter;
import printers.MidPrinter;
import printers.PrinterAbstraction;

public class Test {
	public static void main(String[] args) {
		PrinterAbstraction p = null;
		
		p = new BasicPrinter();
		p.printTestPage();
				
		p = new MidPrinter();
		p.printTestPage();
		
		p = new DeluxPrinter();
		p.printTestPage();
		
	}
}
