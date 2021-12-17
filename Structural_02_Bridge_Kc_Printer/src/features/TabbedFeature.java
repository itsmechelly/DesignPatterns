package features;

public class TabbedFeature extends PrinterFeature {

	@Override
	public void print(String str) {
		for (Character ch : str.toCharArray()) {
			System.out.print(ch+"\t");
		}
		System.out.println();

	}

}
