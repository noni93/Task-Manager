package TManager;

import java.util.LinkedList;

import sun.security.util.Password;

public class validateUserRegistration {
	private User user;
	private LinkedList<String> errors;
	private String[] passwords;
	public validateUserRegistration(User user, String password,  String repassword) {
		this.user = user;
		this.passwords = new String[] {password, repassword};
		errors = new LinkedList<>();
	}
	private boolean nonEmpty() {
		String[] fields = {user.getName(), user.getWorkPhone(), user.getWorkEmail(), user.getLocation(), user.getDepartment(), user.getTitle(), passwords[0], passwords[1]};
		
		
		
		return false;
	}
	
}
