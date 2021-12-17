
public class FamilyMember implements Cloneable {
	
	String nameString;

	public FamilyMember(String nameString) {
		this.nameString = nameString;
	}

	public FamilyMember() {
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	protected FamilyMember clone() throws CloneNotSupportedException {
		return (FamilyMember) super.clone();
	}
}