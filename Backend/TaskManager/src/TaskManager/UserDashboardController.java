package TaskManager;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userdashboard")
public class UserDashboardController {
	@RequestMapping("/showUDash")
	public String showUDash(HttpSession session) {
		return "userDash";
	}
}
