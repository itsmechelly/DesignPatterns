
public class Test {

	public static void main(String[] args) {

		Cat res = Cat.build()
				.setColor("Blue")
				.setId(123)
				.setWeight(1.2f);
		System.out.println(res);
	}
}