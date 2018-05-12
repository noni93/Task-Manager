package TaskManager;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Manager extends User {

	public Manager(String name, String workPhone, String workEmail, String location, String username,
			String title, String department, String company) {
		super(name, "Manager", workPhone, workEmail, location, username,  title, department, company);
	}
	
}