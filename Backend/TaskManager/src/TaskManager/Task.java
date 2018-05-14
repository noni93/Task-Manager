package TaskManager;

public class Task {
	private String startTime;
	private String scheduledStop;
	private int priorty;
	private String stoptime;
	private String desc;
	private String team_assoc;
	private String task_name;
	private String task_company;
	private User task_user;
	@Override
	public String toString() {
		return "Task [startTime=" + startTime + ", scheduledStop=" + scheduledStop + ", priorty=" + priorty
				+ ", stoptime=" + stoptime + ", desc=" + desc + ", team_assoc=" + team_assoc + ", task_name="
				+ task_name + ", task_company=" + task_company + ", task_user=" + task_user + "]";
	}
	public Task(String startTime, String scheduledStop, int priorty, String desc, String team_assoc, String task_name,
			String task_company, User task_user) {
		this.startTime = startTime;
		this.scheduledStop = scheduledStop;
		this.priorty = priorty;
		this.desc = desc;
		this.team_assoc = team_assoc;
		this.task_name = task_name;
		this.task_company = task_company;
		this.task_user = task_user;
		stoptime = null;
	}
	public String getStopTime() {
		return stoptime;
	}
	public void setStopTime(String stoptime) {
		this.stoptime = stoptime;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getScheduledStop() {
		return scheduledStop;
	}
	public void setScheduledStop(String scheduledStop) {
		this.scheduledStop = scheduledStop;
	}
	public int getPriorty() {
		return priorty;
	}
	public void setPriorty(int priorty) {
		this.priorty = priorty;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTeam_assoc() {
		return team_assoc;
	}
	public void setTeam_assoc(String team_assoc) {
		this.team_assoc = team_assoc;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	public String getTask_company() {
		return task_company;
	}
	public void setTask_company(String task_company) {
		this.task_company = task_company;
	}
	public User getTask_user() {
		return task_user;
	}
	public void setTask_user(User task_user) {
		this.task_user = task_user;
	}
	
	
}
