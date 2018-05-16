package TaskManager;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.mapping.List;
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
		String given_username = data[0];
		//System.out.println(given_username);
		String given_company = data[2];
		// Select user from the database given username and company name
		// Sample :Select * From users where username = xyz and company = abc
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		User user = new User();
		// set it to true if you found given user with given username and company in
		// database
		boolean is_it_in_db;
		try{
			user = (User) session.get(User.class, data[0]);
			is_it_in_db = true;	
			System.out.println("Added user" + user.getFirstName());
		} catch (Exception e) {
			System.out.println("Not in database");
			//e.printStackTrace();
			is_it_in_db = false;
		}
		// After querying
		// Create user object with all columns about user but assign the password to the
		// variable below
		// User loginAttempt = new User()
		String password_db = user.getPassword();
		// set role_db to role of fetched user from database
		System.out.println(user.getRole());
		String role_db = user.getRole();

		if (role_db.equals("Admin")) {
			// user = new Admin(data)
		} else if (role_db.equals("Manager")) {
			// user = new Manager();

		} else if (role_db.equals("teamuser")) {
			// user = new TeamUser();
		}

		if (!is_it_in_db) {
			model.addAttribute("LoginError", "You are not registered for this product!!");
			return null;
		}

		if (!user.getUserName().equals(given_username)) {
			model.addAttribute("LoginError", "Username is incorrect!");
			return null;
		}
		if (!password_db.equals(data[1])) {
			model.addAttribute("LoginError", "Password is incorrect!");
			return null;
		}
		return user;

	}
}
