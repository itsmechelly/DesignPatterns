import java.util.ArrayList;
import java.util.List;

public class Forum extends AbstarctEntity {

	private List<AbstarctEntity> people = new ArrayList<>();
	
	public void addEntity(AbstarctEntity abstarctEntity) {
		people.add(abstarctEntity);
	}
	
	public void removeEntity(AbstarctEntity abstarctEntity) {
		people.remove(abstarctEntity);
	}

	@Override
	public void intro() {
		for (AbstarctEntity abstarctEntity : people) {
			abstarctEntity.intro();
		}
		
	}
}
