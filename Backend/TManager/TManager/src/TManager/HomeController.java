package TManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showHome() {
		return "homePage";
	}
	 @RequestMapping("/navigateHome")
	public String navigateHome() {
		 return "homePage";
	}
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "loginPage";
	}

}
