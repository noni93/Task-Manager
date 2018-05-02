package TaskManager;

public class User {
	private String name;
	private String role;
	private String workPhone;
	private String workEmail;
	private String location;
	private String username;
	private String password;
	private String title;
	private String department;
	public User(String name, String role, String workPhone, String workEmail, String location, String username,
			String password, String title, String department) {
		this.name = name;
		this.role = role;
		this.workPhone = workPhone;
		this.workEmail = workEmail;
		this.location = location;
		this.username = username;
		this.password = password;
		this.title = title;
		this.department = department;
	}
	public void setFirstName(String fn) {
		name  = fn + " " + name.split(" ")[1];
	}
	public void setLastName(String ln) {
		name = name.split(" ")[0] + " "+ ln;
	}
	public void setworkPhone(String phone) {
		this.workPhone = phone;
		
	}
	public void setworkEmail(String email) {
		this.workEmail = email;			
	}
	public String getFirstName() {
		return name.split(" ")[0];
	}
	public String getName() {
		return name;
	}
	public String getWorkEmail() {
		return workEmail;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public String getUserName() {
		return username;
	}
	public String getLocation() {
		return location;
	}
	public String getTitle() {
		return title;
	}
	public String getDepartment() {
		return department;
	}
	
	public String toString() {
		return "First Name: " + name.split(" ")[0]+ "\nLastName: " + name.split(" ")[1] +"\nRole: " + role +"\nUserEmail: "+ workEmail+"\nUserPhone: " +workPhone + "\nLocation: "+location+"\nTitle: "+title+"\nDepartment/Team: "+ department+ "\n";
	}
	public void print() {
		System.out.print(this.toString());
	}
}
