package decorates;
import items.Item;

public class AvocadoDecorator extends Item {

	private Item item;
	
	public AvocadoDecorator(Item item) {
		this.item = item;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return item.getDesc()+ " + avocado";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return  item.getCost()+ 15;
	}

}
