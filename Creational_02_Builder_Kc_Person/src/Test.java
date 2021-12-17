
public class Test {

	public static void main(String[] args) {
		
//		Person p1 = new Person();
//		Person p2 = new Person("Izr", "Chelly");
//		Person p3 = new Person(123, "Izr", "Ariel");
		
		Person p1 = Person.build();
		
		Person p2 = Person.build()
				.setLast("Izr")
				.setFirst("Chelly");
		
		Person p3 = Person.build()
				.setId(123)
				.setLast("Izr")
				.setFirst("Ariel");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
	
	public static class Person{
		private int id;
		private String last;
		private String first;
		
		//Empty
		public Person() {
			
		}
		
		//Partial
		public Person(String last, String first) {
			this.last = last;
			this.first = first;
		}
		
		public Person(int id, String last, String first) {
			this.id = id;
			this.last = last;
			this.first = first;
		}

		public int getId() {
			return id;
		}

		public Person setId(int id) {
			this.id = id;
			return this;
		}

		public String getLast() {
			return last;
		}

		public Person setLast(String last) {
			this.last = last;
			return this;
		}

		public String getFirst() {
			return first;
		}

		public Person setFirst(String first) {
			this.first = first;
			return this;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", last=" + last + ", first=" + first + "]";
		}
		
		public static Person build() {
			return new Person();
		}
	}
}