
public class Test {

	public static void main(String[] args) {
		Forum f = new Forum();
		f.addEntity(new Person("Noam"));
		f.addEntity(new Person("Eliad"));
		f.addEntity(new Person("Eyal"));
		f.addEntity(new Person("Jenia"));
		
		Forum subForum = new Forum();
		subForum.addEntity(new Person("Kobi"));
		subForum.addEntity(new Person("Moshe"));
		
		f.addEntity(subForum);
		
		f.intro();

	}

}
