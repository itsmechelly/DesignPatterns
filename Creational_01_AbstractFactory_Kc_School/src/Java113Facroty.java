
public class Java113Facroty extends FormatFactory {

	@Override
	public Teacher getTeacher() {
		return new Java113Teacher();
	}

	@Override
	public Admin getAdmin() {
		return new Java113Admin();
	}

}