package printers;

import features.LowerCaseFeature;

public class BasicPrinter extends PrinterAbstraction {

	@Override
	public void loadFeatures() {
		this.features.add(new LowerCaseFeature());
		
	}

}
