
public class Test {

	public static void main(String[] args) {

		Box b0 = 
				new Box(new SamsungS20(), 
				new Cable(), 
				new Charger());

		Box b1 = 
				new Box(new SamsungS20(), 
				new Cable(), 
				new IsraleianAdapter(new Charger()));
		
		b1.getDevice().print();
		b1.getTypec().print();
		b1.getCharger().print();

	}

}
