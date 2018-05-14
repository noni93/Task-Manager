package TaskManager;

public class CompanyRegistration implements Registration{
	private Company c;
	public CompanyRegistration(Company c) {
		this.c = c;
	}
	
	private Object[] validatePhoneNumber() {
		String errors = "";
		String phone = c.getCompanyPhone();
		if(phone.length() != 10) {
			errors+= "WorkPhone must be 10 digits long\n";
			return new Object [] {false, errors};
		}else {
			for(int i = 0; i < phone.length(); i++) {
				char c= phone.charAt(i);
				if(c < 48 || c > 57) {
					errors += "Work Phone must contain only numerical digits\n";
					return new Object [] {false, errors};
				}
			}
			return new Object [] {true, ""};
		}
	}
	@Override
	public String register(String... args) {
		// TODO Auto-generated method stub
		Object[] results = validatePhoneNumber();
		boolean result = (Boolean)results[0];
		String errors = (String)results[1];
		if(!result) {
			return "Errors: " +errors;
		}else {
			// Write code to add Company c to the companies table
			
			
			//
			String table_name = this.creatNewUsersTable();
			
			return table_name;
		}
	}
	private String creatNewUsersTable() {
		String table_name = c.getCompany() + "users";
		//Create Table code here
		
		return table_name;
	}
	@Override
	public boolean clean() {
		// TODO Auto-generated method stub
		c = null;
		return false;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
