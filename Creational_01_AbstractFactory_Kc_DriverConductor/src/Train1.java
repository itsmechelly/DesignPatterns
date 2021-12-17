
public class Train1 extends TrainFormat {

	@Override
	public Driver getDriver() {
		// TODO Auto-generated method stub
		return new MosheDriver();
	}

	@Override
	public Conductor getConductor() {
		// TODO Auto-generated method stub
		return new YossiConductor();
	}

}
