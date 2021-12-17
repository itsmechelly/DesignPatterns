package n02_LazilySingleton;

public class MySingleton {

	//1
	private static MySingleton instance = null;

	//2
	private MySingleton() {
		System.out.println("CTOR in action!");
	}

	//3
	public static MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}
}