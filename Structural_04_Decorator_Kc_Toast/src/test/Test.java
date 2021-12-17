package test;

import decorates.AvocadoDecorator;
import decorates.CheeseDecorator;
import decorates.CreamDecorator;
import items.Cake;
import items.Coffee;
import items.Toast;

public class Test {

	public static void main(String[] args) {
	
		Toast toast = new Toast();
		AvocadoDecorator ad1 = new AvocadoDecorator(toast);
		AvocadoDecorator ad2 = new AvocadoDecorator(ad1);
		CheeseDecorator cd1 = new CheeseDecorator(ad2);
		CheeseDecorator cd2 = new CheeseDecorator(cd1);
		
		Coffee c1 = new Coffee();
		System.out.println(cd2.getDesc());
		System.out.println(cd2.getCost());

	}

}
