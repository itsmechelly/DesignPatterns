import java.util.ArrayList;
import java.util.List;

public class Family implements Cloneable {
	
	private String lastName;
	private List<FamilyMember> fmailyMemb;

	public Family() {
	}

	public Family(String lastName) {
		this.lastName = lastName;
	}

	public Family(String lastName, List<FamilyMember> fmailyMemb) {
		this.lastName = lastName;
		this.fmailyMemb = fmailyMemb;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<FamilyMember> getFmailyMemb() {
		return fmailyMemb;
	}

	public void setFmailyMemb(List<FamilyMember> fmailyMemb) {
		this.fmailyMemb = fmailyMemb;
	}

	@Override
	protected Family clone() throws CloneNotSupportedException {
		
		Family clone = null;

		clone = (Family) super.clone();

		// Copy new date object to cloned method
		List<FamilyMember> fmCloned = new ArrayList<>();
		for (FamilyMember familyMember : fmailyMemb) {
			fmCloned.add(familyMember.clone());
		}
		clone.setFmailyMemb(fmCloned);

		return clone;
	}
}