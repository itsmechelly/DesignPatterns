package features;

public class LowerCaseFeature extends PrinterFeature {

	@Override
	public void print(String str) {
		System.out.println(str.toLowerCase());

	}

}
