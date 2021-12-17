package decorates;
import items.Item;

public class CheeseDecorator extends Item {

		private Item item;

		public CheeseDecorator(Item item) {
			this.item = item;
		}

		@Override
		public String getDesc() {
			// TODO Auto-generated method stub
			return item.getDesc()+" + cheese";
		}

		@Override
		public double getCost() {
			// TODO Auto-generated method stub
			return item.getCost()+5;
		}

}
