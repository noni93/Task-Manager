package TaskManager;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/companyregistration")
public class CompanyRegistrationController {
	@RequestMapping("/showSignUp")
	public String showSignUp() {
		return "signUp";
	}
	@RequestMapping("/fetchAdminandValidateData")
	public String fetchAdminandValidateData(@RequestParam("company") String company,
			@RequestParam("companyId") String companyId,
			@RequestParam("companyphone") String companyphone,
			@RequestParam("companyaddress") String address,
			@RequestParam("description") String desc,
			@RequestParam("firstname") String firstname, 
			@RequestParam("lastname") String lastname
			,@RequestParam("title") String title,
			@RequestParam("username") String username,
			@RequestParam("department") String department,
			@RequestParam("workphone") String workphone,
			@RequestParam("email") String email,
			@RequestParam("location") String location,
			@RequestParam("password") String password,
			@RequestParam("repassword") String repassword, Model model){
		String[] data = {firstname + " " +lastname, workphone, email, location, username, password, title, department, repassword};
	
		// add user to the new company table created above
		Company comp= new Company(company, companyId, companyphone, address, desc);
		Registration cregister = new CompanyRegistration(comp);
		//Add company object to the maually created company tables (name it as companies)
		//Create a new table in database programmatically Create Table query(name is companyName + "users")
		// the code for above two comments go into cregister.register) method
		//see CompantRegistrationClass and register() method in it and put the code there
		String cresult = cregister.register();
		if(cresult.startsWith("Error: ")) {
			model.addAttribute("companyError", cresult);
			cresult = "";
		}
		
		Registration register = new UserRegistration("admin", data); 
		// below method takes in a table name returned from cregister.register() and puts user in it
		//see UserRegistration class and register() method in it
		String result = register.register(cresult);
		if(result.length()> 0) {
			result = "Errors: " + result;
		}
		model.addAttribute("CRegError", result);
		cregister.clean();
		register.clean();
		data = null;
		return "signUp";
	}
}
