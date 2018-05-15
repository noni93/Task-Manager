package TaskManager;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Admin extends User {

	public Admin(String name, String workPhone, String workEmail, String location, String username,
			String title, String department, String company) {
		super(name, "Admin", workPhone, workEmail, location, username, title, department, company);
	}
	
	public void print1() {
		System.out.println("Admin");
	}
	
}
