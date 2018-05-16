package TaskManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

public class UserRegistration implements Registration {
	
	private User user;
	private String[] passwordToValidate;

	public UserRegistration(String which_user, String data[]) {
		init(which_user, data);
		passwordToValidate = new  String[] {data[5], data[8]};
		//user.print();
		//System.out.println(data[5]);
	}
	
	private Object[] validateData() {
		// TODO Auto-generated method stub
		validateUserRegistration v = new validateUserRegistration(user, passwordToValidate[0], passwordToValidate[1]);
		
		return new Object[] {v.validationResult(), v};
	}
	@Override
	public String register(String... args) {
		System.out.println(user.getName());
		// TODO Auto-generated method stub
		Object[] results = validateData();
		boolean result = true;//(Boolean) results[0];
		validateUserRegistration v = (validateUserRegistration) results[1];
		if (!result) {
			System.out.println(user.getDepartment());
			String errors = "";
			for (String error : v.errors) {
				errors += error + "\n";
			}
			v.clean();
			return errors;
		} else {
			// Write code to add User user to the tableName field of this class
			// hibernate code - adding User user to table
			// if no table exists (Company), it will create a new one
			// if user exists it will be caught
			Session session = null;
			try {
				System.out.println(user.getTitle());
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				session = sessionFactory.openSession();
				session.beginTransaction();
				session.save(user);
				session.getTransaction().commit();
				sessionFactory.close();
				session.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//String table_name = args[0];
			v.clean();
			return "";
		}

	}

	@Override
	public boolean clean() {
		user = null;
		passwordToValidate= null;
		return (user == null && passwordToValidate == null);
	}
	public void print() {
		user.print();
	}
	private void init(String which_user, String[] data) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		user = (User) context.getBean(which_user, new Object [] {data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[9]});
		context.close();
	}
}
