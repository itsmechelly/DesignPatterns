
public class Cat {

	private int id;
	private String color;
	private float weight;

	public static Cat build() {
		return new Cat();
	}

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String color, float weight) {
		this.color = color;
		this.weight = weight;
	}

	public Cat(String color) {
		this.color = color;
	}

	public Cat(int id, String color, float weight) {
		this.id = id;
		this.color = color;
		this.weight = weight;
	}

	public int getId() {
		return id;
	}

	public Cat setId(int id) {
		this.id = id;
		return this;
	}

	public String getColor() {
		return color;
	}

	public Cat setColor(String color) {
		this.color = color;
		return this;
	}

	public float getWeight() {
		return weight;
	}

	public Cat setWeight(float weight) {
		this.weight = weight;
		return this;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", color=" + color + ", weight=" + weight + "]";
	}
}
