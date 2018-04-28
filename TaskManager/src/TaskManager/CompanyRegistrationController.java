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
	public String fetchAdminandValidateData(@RequestParam("firstname") String firstname, 
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
		Registration register = new UserRegistration("admin", data); 
		register.print();
		return "signUp";
	}
}
