
public class Cat {
	
	private int id;
	private String name;
	private float weight;

	@Override
	protected Cat clone() throws CloneNotSupportedException {

		// Same Object
		// return this;

		// Brand New Object
		Cat dup = new Cat();
		dup.setId(this.getId());
		dup.setName(this.getName());
		dup.setWeight(this.weight);
		return dup;
	}

	public Cat() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", weight=" + weight + "]";
	}

}