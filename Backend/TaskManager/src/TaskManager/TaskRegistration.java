package TaskManager;

public class TaskRegistration implements Registration {
	private Task task;
	public TaskRegistration(String startTime, String scheduledStop, int priorty, String desc, String team_assoc, String task_name,
			String task_company, User task_user) {
	   task = new Task(startTime, scheduledStop, priorty, desc, team_assoc, task_name, task_company, task_user);
	   
	}
	@Override
	public String register(String... args) {
		// write hibernate to add Task to the databse
		//add it to task table
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
