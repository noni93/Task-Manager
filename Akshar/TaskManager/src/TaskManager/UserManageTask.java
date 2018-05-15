package TaskManager;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.PriorityQueue;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import sun.security.ssl.SSLContextImpl.TLS10Context;
/*
 * Queries to be written in:
 * private getAllTasks()
 * editTask
 * deleteTask
 * startTask
 * stopTask
 * approveTask
 * disapproveTask
 */
public class UserManageTask {
	public class TaskData implements Comparable{
		private Task task;
		private String id;
		
		public TaskData(Task task, String id) {
			this.task= task;
			this.id = id;
		}
		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			TaskData t = (TaskData)arg0;
			
			return new Integer(this.task.getPriorty()).compareTo(t.task.getPriorty());
		}
		public Task getTask() {
			return task;
		}
		public void setTask(Task task) {
			this.task = task;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
	}
	
	private User user;
	Task t1 = new Task(12, "Develop web app TM", "Team4", "TMProject", "CSUS",null);
	Task t2 = new Task(34, "Team4", "QATesing", "TMTesting", "CSUS",null);
	Task t3 = new Task( 2, "Develop Spring", "Team4", "TMProject222", "CSUS",null);
	public UserManageTask(User user) {
		this.user = user;
	}
	private LinkedList[] getAllTasks() {
		LinkedList[] list = new LinkedList[2];
		String company = user.getCompany();
		String team = user.getDepartment();
		//Matt using company and team query the database of Tasktable
		//Sample can be Select * From Tasks(table name) Where task_company = company and task_team = team
		//Seperate the ids and Tasks
		//ids are primary key
		//put all ids in linkelist[1]
		//and tasks in list[0]
		//ids should be concurrent with task
		//example: first task in linkedlast of taskslistp[1] must have id first in linkedlist of ids list[1]
		//remove mock objects once you are done
		//mock Objects

		// End of mocks
		list[0] = new LinkedList<Task>();
		list[0].addLast(t1);
		list[0].addLast(t2);
		list[0].addLast(t3);
		list[1] = new LinkedList<String>();
		for(int i = 1; i <= 3; i++) list[1].addLast(i + "");
		
		return list;
	}
	public  void getAllTasks(HttpSession session) {
		LinkedList[] list = this.getAllTasks();
		LinkedList<Task> tasks = (LinkedList<Task>)list[0];
		LinkedList<String> ids = (LinkedList<String>)list[1];
		LinkedList<TaskData> tid = this.sortByPriority(ids, tasks);
		session.setAttribute("Tasks", tid);
	}
	private LinkedList<TaskData> sortByPriority(LinkedList<String> ids, LinkedList<Task> tasks){
		PriorityQueue<TaskData> pq  = new PriorityQueue<>();
		LinkedList<TaskData> tid = new LinkedList<>();
		for(Task task: tasks) {
			tid.addLast(new TaskData(task, ids.pop()));
		}
		for(TaskData d: tid) {
			pq.add(d);
		}
		tid = new LinkedList<TaskData>();
		while(!pq.isEmpty()) {
			tid.addLast(pq.remove());
		}
		return tid;
	}
	public boolean  deleteTask(String id) {
		//Write query to delete the task;
		//sample: Delete * from TaskTable where (id column)id = id
		boolean isRemoved = false;
		//isRemoved = true if has been deleted from database
		return isRemoved;
		
	}
	public Task editTask(String id) {
		//write query to select the task where id = id
		//construct the task object below
		Task task = null;
		
		if(task.getStatus()) {
			
			return null;
		}else {
			return task;
		}
	}
	public boolean startTask(String id) {
		Timestamp ts = new Timestamp(Calendar.getInstance().getTimeInMillis());
		String starttime = ts.toString();
		//update tasktable set starttime = starttime where id = id
		boolean updated = false;
		//make it true if updated successfully
		return updated;
	}
	public boolean stopTask(String id) {
		Timestamp ts = new Timestamp(Calendar.getInstance().getTimeInMillis());
		String stoptime = ts.toString();
		//update tasktable set stoptime = stoptime where id = id;
		/*2018-05-15 07:43:03.096*/
		
		boolean updated = false;
		//make it true if updated successfully
		return updated;
	}
	public boolean approveTask(String id) {
		//Update tasktable set approved = true where id = id
		
		
		boolean update = false;
		//make update = true if it is updated
		return update;
	}
	public boolean disapproveTask(String id) {
		//Update tasktable set approved = false where id = id
		
		boolean update = false;
		//make update = true if it is updated
		return update;
	}
 
}
