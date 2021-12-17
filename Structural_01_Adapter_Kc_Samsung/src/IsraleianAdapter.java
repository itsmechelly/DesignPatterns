
public class IsraleianAdapter implements MyAdapter{

	
	private Charger charger;
	
	public IsraleianAdapter(Charger charger) {
		this.charger = charger;
	}
	
	@Override
	public void print() {
		System.out.println("added Israeli support for the forign chrager");
		
	}

}
