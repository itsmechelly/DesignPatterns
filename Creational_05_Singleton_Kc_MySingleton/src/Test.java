
public class Test {
	
	
	static {
		System.out.println("Static Constructor");
		
	}

	public static void main(String[] args) {
	
		System.out.println("START");
		new Thread(()->MySingleton.getInstance()).start();
		new Thread(()->MySingleton.getInstance()).start();
		System.out.println("END");
	}

}
