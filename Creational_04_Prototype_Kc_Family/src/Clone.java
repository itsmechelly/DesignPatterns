import java.util.Arrays;
import java.util.List;

public class Clone {
	public static void main(String[] args) throws CloneNotSupportedException {

		List<FamilyMember> familyMembers = Arrays.asList(new FamilyMember("gigi"), new FamilyMember("lieke"),
				new FamilyMember("elvis"));

		Family family = new Family("grinbergs", familyMembers);

		System.out.println(family);
		System.out.println(family.getFmailyMemb());

		Family clonedFamily = family.clone();
		System.out.println(clonedFamily);
		System.out.println(clonedFamily.getFmailyMemb());
	}
}