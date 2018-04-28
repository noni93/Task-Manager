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
	@Override
	public boolean validateData() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean register() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean clean() {
		// TODO Auto-generated method stub
		return false;
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
