
public class Test {

	public static void main(String[] args) {

		FormatFactory facory = new Java106Facory();
		facory.getAdmin().admin();
		facory.getTeacher().teach();

		FormatFactory facory2 = new Java113Facroty();
		facory2.getAdmin().admin();
		facory2.getTeacher().teach();
	}

}