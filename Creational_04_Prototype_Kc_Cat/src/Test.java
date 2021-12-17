
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		StamRepo repo = new StamRepo();

		Cat myCat = repo.getSingleCat(123);
		System.out.println(myCat);
		System.out.println(myCat.hashCode());

		Cat myCat2 = repo.getSingleCat(123);
		System.out.println(myCat2);
		System.out.println(myCat2.hashCode());

		Cat myCat3 = myCat.clone();
		System.out.println(myCat3);
		System.out.println(myCat3.hashCode());

		myCat3.setName("Moshe");
		System.out.println(myCat);
		System.out.println(myCat3);
	}
}