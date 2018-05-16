package TaskManager;

import java.util.*;
import java.util.LinkedList;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.List;

import net.sf.ehcache.hibernate.HibernateUtil;

public class AdminManageUser {
	public class UserData implements Comparable {
		private User user;
		private String id;

		public UserData(User user, String id) {
			this.user = user;
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		@Override
		public int compareTo(Object arg0) {
			User ot = (User) arg0;
			return this.user.getName().compareToIgnoreCase(ot.getName());
		}

	}

	private class SortByNames implements Comparator<UserData> {

		@Override
		public int compare(UserData arg0, UserData arg1) {
			// TODO Auto-generated method stub
			return arg0.getUser().getName().compareToIgnoreCase(arg1.getUser().getName());
		}

	}

	private User user;

	public AdminManageUser(User user) {
		this.user = user;
	}

	private LinkedList<UserData>[] getAllUsers() {
		String company = user.getCompany();
		// select * from users table where company = company

		// User tu1 = new TeamUser("Akshar Patel", "6692418220", "akshar@ecs.csus.edu",
		// "E420", "akshar24", "password", "Software Developer", "Software", "Google");
		// User tu2 = new TeamUser("Parth patel", "4089089929",
		// "parth@google.employee.com", "E421", "parth21", "password", "Data Scientist",
		// "Software", "Google");
		// User mu1 = new Manager("Parth patel", "4089089929",
		// "parth@google.employee.com", "E421", "parth21", "password", "Data Scientist",
		// "Software", "Google");
		// User mu2 = new Manager("Kevin patel", "4089089929",
		// "parth@google.employee.com", "E421", "parth21" ,"password", "Data Scientist",
		// "Software", "Google");

		LinkedList<User> teamusers = new LinkedList<>();
		// put id column of teamusers here
		LinkedList<String> teamusers_ids = new LinkedList<>();
		// put all managers with role == Manager in this linkedlist
		LinkedList<User> managers = new LinkedList<>();
		// put the id column values for managers here
		LinkedList<String> managers_ids = new LinkedList<>();

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		List<User> ulist = session.createQuery("FROM userdatabase").list();
		for (User u : ulist) {
			if (u.getRole().equals("Manager")) {
				managers.addLast(u);
				managers_ids.addLast(u.getUserName());
			} else if (u.getRole().equals("teamuser")) {
				teamusers.addLast(u);
				teamusers_ids.addLast(u.getUserName());
			}
		}

		// do not worry about this
		LinkedList<UserData> team_users_ids = new LinkedList<>();
		for (User teamuser : teamusers) {
			team_users_ids.addLast(new UserData(teamuser, teamusers_ids.pop()));
		}
		LinkedList<UserData> manager_and_ids = new LinkedList<>();
		for (User teamuser : managers) {
			manager_and_ids.addLast(new UserData(teamuser, managers_ids.pop()));
		}
		LinkedList<UserData> result[] = new LinkedList[2];
		result[0] = team_users_ids;
		result[1] = manager_and_ids;
		return result;

	}

	public void getAllUsers(HttpSession session) {
		LinkedList<UserData> result[] = this.getAllUsers();
		result[0].sort(new SortByNames());
		result[1].sort(new SortByNames());
		session.setAttribute("AllManagers", result[1]);
		session.setAttribute("AllTeamUsers", result[0]);
	}

	public boolean deleteUser(String id) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		// session = sessionFactory.getCurrentSession();
		boolean is_deleted = true;
		Transaction tx=session.beginTransaction();
		User user=(User)session.get(User.class,id);
		session.delete(user);
		tx.commit();

		// String hql = "DELETE FROM Employee " +
		// "WHERE id = :employee_id";
		// Query query = session.createQuery(hql);
		// query.setParameter("employee_id", 10);
		// int result = query.executeUpdate();
		// System.out.println("Rows affected: " + result);
		return is_deleted;
	}
}
