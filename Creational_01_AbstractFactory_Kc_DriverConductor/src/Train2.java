
public class Train2 extends TrainFormat {

	@Override
	public Driver getDriver() {
		// TODO Auto-generated method stub
		return new ZoharDriver();
	}

	@Override
	public Conductor getConductor() {
		// TODO Auto-generated method stub
		return new NoamConductor();
	}

}
