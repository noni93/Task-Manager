package TaskManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TaskRegistration implements Registration {
	private Task task;
	public TaskRegistration( int priorty, String desc, String team_assoc, String task_name,
			String task_company) {
	   task = new Task(priorty, desc, team_assoc, task_name, task_company);
	   
	}
	@Override
	public String register(String... args) {
		// write hibernate to add Task to the databse
		//add it to task table
		try {
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(task);
			session.getTransaction().commit();
			session.flush();
			session.close();
		} catch (Exception e) {
			System.out.print(e.getMessage());
			// company already exists
		}
		return "";
	}

	@Override
	public boolean clean() {
		// TODO Auto-generated method stub
		task = null;
		return (task== null);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

}
