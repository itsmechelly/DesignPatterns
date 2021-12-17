package printers;

import features.LowerCaseFeature;
import features.ReverseFeature;

public class MidPrinter extends PrinterAbstraction {

	@Override
	public void loadFeatures() {
		this.features.add(new ReverseFeature());
		this.features.add(new LowerCaseFeature());
		
	}

}
