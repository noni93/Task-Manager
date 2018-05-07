package TaskManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Login")
public class LoginController {
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "loginPage";
	}
	@RequestMapping("/processLogin")
	public String processLogin(@RequestParam("username") String username,
			@RequestParam("password") String password,
			@RequestParam("company") String company_name,
			Model model) {
		String data[] = {username, password,company_name};
		LoginHandler lh = new LoginHandler(data);
		User user = lh.logInUser(model);
		
		
		return "";
		
	}
}
