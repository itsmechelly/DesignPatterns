package decorates;
import items.Item;

public class CreamDecorator extends Item {

	private Item item;
	
	public CreamDecorator(Item item) {
		this.item = item;
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return item.getDesc() + " + cream";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return item.getCost()+ 1.99;
	}

}
