package printers;

import features.LowerCaseFeature;
import features.PrinterFeature;
import features.ReverseFeature;
import features.TabbedFeature;
import features.UpperCaseFeature;

public class DeluxPrinter extends PrinterAbstraction{
	
	@Override
	public void loadFeatures() {
		this.features.add(new LowerCaseFeature());
		this.features.add(new UpperCaseFeature());
		this.features.add(new TabbedFeature());
		this.features.add(new ReverseFeature());
		
	}

}
