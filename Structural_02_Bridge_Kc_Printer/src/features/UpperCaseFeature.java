package features;

public class UpperCaseFeature extends PrinterFeature {

	@Override
	public void print(String str) {
		System.out.println(str.toUpperCase());
		
	}

}
