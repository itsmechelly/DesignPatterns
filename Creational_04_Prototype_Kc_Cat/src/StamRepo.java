
public class StamRepo {

	public Cat getSingleCat(int id) {
		Cat c1 = new Cat();
		c1.setId(id);
		c1.setName("Mitzi");
		c1.setWeight((float) (Math.random() * 5));

		return c1;
	}
}
