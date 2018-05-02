package TaskManager;

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
	
	}
	
	private Object[] validateData() {
		// TODO Auto-generated method stub
		validateUserRegistration v = new validateUserRegistration(user, passwordToValidate[0], passwordToValidate[1]);
		
		return new Object[] {v.validationResult(), v};
	}
	@Override
	public String register(String... args) {
		// TODO Auto-generated method stub
		Object[] results = validateData();
		boolean result = (Boolean)results[0];
		validateUserRegistration v = (validateUserRegistration) results[1];
		if(!result) {
			String errors ="";
			for(String error: v.errors) {
				errors += error + "\n";
			}
			v.clean();
			return errors;
		}else {
			// Write code to add User user to the tableName field of this class
			String table_name = args[0];
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
		user = (User) context.getBean(which_user, new Object [] {data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7]});
		context.close();
	}
}
