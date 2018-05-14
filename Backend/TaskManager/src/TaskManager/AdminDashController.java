package TaskManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Admin")
public class AdminDashController {
	@RequestMapping("/showAdminDash")
	public String showAD() {
		return "adminDash";
	}
}
