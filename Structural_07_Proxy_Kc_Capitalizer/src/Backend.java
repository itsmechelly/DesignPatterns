
public class Backend {

	LowerCaseCapitalizer lowerCaseCapitalizer = new LowerCaseCapitalizer();
	
	public String getRequest(String str) {
		return lowerCaseCapitalizer.print(str);
	}
	
	public double getBalance() {
		lowerCaseCapitalizer.printTable();
		return lowerCaseCapitalizer.printBalance();
	}

}
