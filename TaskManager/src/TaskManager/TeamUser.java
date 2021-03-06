package TaskManager;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TeamUser extends User {
	
	public TeamUser(String name, String workPhone, String workEmail, String location, String username,
			String password, String title, String department) {
		super(name, "teamuser", workPhone, workEmail, location, username, password, title, department);
	}
	
}