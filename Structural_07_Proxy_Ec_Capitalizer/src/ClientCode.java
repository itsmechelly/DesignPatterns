
public class ClientCode {

	public static void main(String[] args) {

		Capitalizer capitalizer = new CapitalizerCacheProxy();
		String[] codes = { "alpha", "delta", "alpha", "omega", "alpha", "alpha" };
		int r;
		
		for (int i = 0; i < 100; i++) {
			r = (int)(Math.random()*codes.length);
			System.out.println(capitalizer.modify(codes[r]));
		}

	}

}
