package TaskManager;

import java.util.Comparator;
import java.util.LinkedList;

import javax.servlet.http.HttpSession;

public class AdminManageUser {
	public class UserData implements Comparable{
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
			User ot = (User)arg0;
			return this.user.getName().compareToIgnoreCase(ot.getName());
		}
		
	}
	private class SortByNames implements Comparator<UserData>{

		@Override
		public int compare(UserData arg0, UserData arg1) {
			// TODO Auto-generated method stub
			return arg0.getUser().getName().compareToIgnoreCase(arg1.getUser().getName());
		}
		
	}
	private User user;
	public AdminManageUser(User user) { this.user = user;}
	private LinkedList<UserData>[] getAllUsers(){
		String company = user.getCompany();
		//select * from users table where company = company
		//write above kind of query below
		//put all team users with role == teamuser in this linkedist
		/*
		 * String name, String role, String workPhone, String workEmail, String location, String username,
			 String title, String department, String company
		 */
		User tu1 = new TeamUser("Akshar Patel", "6692418220", "akshar@ecs.csus.edu", "E420", "akshar24", "Software Developer", "Software", "Google");
		User tu2 = new TeamUser("Parth patel", "4089089929", "parth@google.employee.com", "E421", "parth21", "Data Scientist", "Software", "Google");
		User mu1 = new Manager("Parth patel", "4089089929", "parth@google.employee.com", "E421", "parth21", "Data Scientist", "Software", "Google");
		User mu2 = new Manager("Kevin patel", "4089089929", "parth@google.employee.com", "E421", "parth21", "Data Scientist", "Software", "Google");
				
		LinkedList<User> teamusers = new LinkedList<>();
		teamusers.addLast(tu1); teamusers.addLast(tu2);
		//put id column of teamusers here
		LinkedList<String> teamusers_ids = new LinkedList<>();
		teamusers_ids.addLast("1"); teamusers_ids.addLast("2");
		//put all managers with role == Manager in this linkedlist
		LinkedList<User> managers = new LinkedList<>();
		managers.addLast(mu1); managers.addLast(mu2); 
		//put the id column values for managers here
		LinkedList<String> managers_ids = new LinkedList<>();
		managers_ids.add("144"); managers_ids.add("244");
		
		//do not worry about this
		LinkedList<UserData> team_users_ids = new LinkedList<>();
		for(User teamuser: teamusers) {
			team_users_ids.addLast(new UserData(teamuser, teamusers_ids.pop()));
		}
		LinkedList<UserData> manager_and_ids = new LinkedList<>();
		for(User teamuser: managers) {
			manager_and_ids.addLast(new UserData(teamuser, managers_ids.pop()));
		}
		 LinkedList<UserData> result[] = new LinkedList[2];
		 result[0] = team_users_ids; result[1] =  manager_and_ids;
		 return result;
		
	}
	public void getAllUsers(HttpSession session) {
		LinkedList<UserData> result[] = this.getAllUsers();
		result[0].sort(new SortByNames());
		result[1].sort(new SortByNames());
		session.setAttribute("AllManagers", result[1]);
		session.setAttribute("AllTeamUsers",result[0]);
	}
	public boolean deleteUser(String id) {
		//Delete* from users where id = id;
		boolean is_deleted = false;
		//make it true if it is deleted successfully
		return is_deleted;
	}
}
