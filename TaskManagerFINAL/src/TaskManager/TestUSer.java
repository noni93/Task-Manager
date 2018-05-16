package TaskManager;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUSer {
	public static void main(String args[]) {
	ClassPathXmlApplicationContext context = 
			 new ClassPathXmlApplicationContext("applicationContext2.xml");
	User user = (User) context.getBean("admin", new Object[] {"Akshar Patel", "6692418220", "aksharpatel@csus.edu", "E460", "akshar24", "livonia1", "Software Engineer", "Software Development Team"});
		//User user = new Admin("Akshar Patel", "6692418220", "aksharpatel@csus.edu", "E460", "akshar24", "livonia1", "Software Engineer", "Software Development Team");
		user.print();
		User user1 = (User) context.getBean("manager", new Object[] {"Parth Pako", "4084992280", "parthpako@csus.edu", "E500", "parth2pako", "livonia1", "Software Engineer", "Software Team"});
		user1.print();
		User user2 = (User) context.getBean("teamUser", new Object[] {"Parth Pako", "4084992280", "parthpako@csus.edu", "E500", "parth2pako", "livonia1", "Software Engineer", "Software Team"});
		user2.print();
		context.clearResourceCaches();
		context.close();
		
	}
}
