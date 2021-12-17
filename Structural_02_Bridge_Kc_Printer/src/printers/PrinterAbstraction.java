package printers;

import java.util.ArrayList;
import java.util.List;

import features.LowerCaseFeature;
import features.PrinterFeature;

public abstract class PrinterAbstraction {
	protected List<PrinterFeature> features = new ArrayList<>();
	
	public PrinterAbstraction() {
		loadFeatures();
	}
	
	public abstract void loadFeatures();
	
	public void printTestPage() {
		for (PrinterFeature printerFeature : features) {
			printerFeature.print("King Jenia");
		}
	};

}
