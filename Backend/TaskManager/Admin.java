package TaskManager;

public class Admin extends User {

	public Admin(String name, String workPhone, String workEmail, String location, String username,
			String password, String title, String department) {
		super(name, "Admin", workPhone, workEmail, location, username, password, title, department);
	}
	
}	
