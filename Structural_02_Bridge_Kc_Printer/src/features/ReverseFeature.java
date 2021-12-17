package features;

public class ReverseFeature extends PrinterFeature{

	@Override
	public void print(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
	}

}
