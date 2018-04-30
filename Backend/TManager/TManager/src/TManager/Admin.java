package TManager;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class Admin extends User {

	public Admin(String name, String workPhone, String workEmail, String location, String username,
			String password, String title, String department) {
		super(name, "Admin", workPhone, workEmail, location, username, password, title, department);
	}
	
	public void print1() {
		System.out.println("Admin");
	}
	
}
