
public class Frontend {
	
	private Backend backend = new Backend();
	
	public String goToServer(String str) {
		return backend.getRequest(str);
	}
	
	public void printBalance() {
		System.out.println(backend.getBalance());
	}

}
