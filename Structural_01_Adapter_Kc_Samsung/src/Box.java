
public class Box {
	private SamsungS20 device;
	private Cable typec;
	private MyAdapter charger;
	
	public Box(SamsungS20 device, Cable typec, MyAdapter charger) {
		this.device = device;
		this.typec = typec;
		this.charger = charger;
	}

	public SamsungS20 getDevice() {
		return device;
	}

	public void setDevice(SamsungS20 device) {
		this.device = device;
	}

	public Cable getTypec() {
		return typec;
	}

	public void setTypec(Cable typec) {
		this.typec = typec;
	}

	public MyAdapter getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Box [device=" + device + ", typec=" + typec + ", charger=" + charger + "]";
	}
	
	

	
	
	
}
