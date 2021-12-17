
public class Test {

	public static void main(String[] args) throws PhoneNotFound {

		// Please avoid Tight Coupling - 62.5% code refactor
		Iphone iphone = new Iphone();
		iphone.owner();
		iphone.lastVersion();

		// Loose coupling is much better - 12.5% code refactor
		Mobile smartphone1 = new Iphone();
		smartphone1.owner();
		smartphone1.lastVersion();

		// Loose coupling using Factory Method Design Pattern - 12.5% code refactor
		Mobile smartphone2 = createPhone("iphone");
		smartphone2.owner();
		smartphone2.lastVersion();

		// Loose coupling using external argument setup - 0% code refactor
		Mobile smartphone3 = createPhone(args[0]);
		smartphone2.owner();
		smartphone2.lastVersion();

		// Loose coupling using external argument setup - 0% code refactor
		Mobile smartphone4 = createPhone(args[1]);
		smartphone4.owner();
		smartphone4.lastVersion();
	}

	// Factory Method Design Pattern
	public static Mobile createPhone(String input) throws PhoneNotFound {
		if (input.equalsIgnoreCase("Iphone")) {
			return new Iphone();
		} else if (input.equalsIgnoreCase("Android")) {
			return new Android();
		}
		throw new PhoneNotFound();
	}

}