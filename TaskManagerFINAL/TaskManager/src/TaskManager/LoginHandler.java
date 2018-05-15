package TaskManager;

import org.springframework.ui.Model;

public class LoginHandler {
		public String data[];
		public LoginHandler(String[] data) {
			this.data = data;
		}
		public User logInUser(Model model) {
			return login(model);
		}
		private User login(Model model) {
			// Select user from the database given username and company name
			// Sample :Select * From users where username = xyz and company = abc
			String given_username = data[0];
			String given_company= data[2];
			//After querying
			// Create user object with all columns about user but assign the password to the variable below
			String password_db = "";
			
			//set role_db to role of feteched user from database
			String role_db = "";
			User user =  null;
			if(role_db.equals("Admim")) {
				// user = new Admin(data)
			}else if(role_db.equals("Manager")) {
				//user = new Manager();
				
			}else if(role_db.equals("teamuser")) {
				// user =  new TeamUser();
			}
			
			
			//set it to true if you found given user with given username and company in database
			boolean is_it_in_db = false;
			
			if(!is_it_in_db) {
				model.addAttribute("LoginError", "You are not registered for this product!!");
				return null;
			}
			
			if(!user.getUserName().equals(given_username)) {
				model.addAttribute("LoginError", "Username is incorrect!");
				return null;
			}
			if(!password_db.equals(data[1])) {
				model.addAttribute("LoginError", "Password is incorrect!");
				return null;
			}
			return user;
			
		}
}
