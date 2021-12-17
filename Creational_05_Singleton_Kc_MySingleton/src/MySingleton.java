
public class MySingleton {
	// STEP 1
	private static MySingleton instance = null;
	private int x = (int) (Math.random() * 101);

	// STEP 2
	private MySingleton() {
		System.out.println(MySingleton.class.getName() + " - CTOR IN ACTION");
	}

	// STEP 3
	public static MySingleton getInstance() {
		if (instance == null) {
			synchronized (MySingleton.class) {
				if (instance == null) {
					instance = new MySingleton();
				}
			}

		}
		return instance;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "MySingleton [x=" + x + "]";
	}

}
