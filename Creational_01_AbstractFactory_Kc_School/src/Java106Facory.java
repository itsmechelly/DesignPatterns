
public class Java106Facory extends FormatFactory {

	@Override
	public Teacher getTeacher() {
		return new Java106Teacher();
	}

	@Override
	public Admin getAdmin() {
		return new Java106Admin();
	}
}