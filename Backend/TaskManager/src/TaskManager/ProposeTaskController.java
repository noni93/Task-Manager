package TaskManager;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.reactive.config.ResourceHandlerRegistry;

@Controller
@RequestMapping("/Task")
public class ProposeTaskController {
 
	@RequestMapping("/showStartTask")
	public String showST() {
		return "startTask";
	}
	@RequestMapping("/proposeTask")
	public String proposeTask(@RequestParam("task_name") String tname
			, @RequestParam("starttime") String starttime,
			@RequestParam("stoptime") String stoptime,
			@RequestParam("task_describe") String tdesc,
			@RequestParam("task_priority") String tprior
			, HttpSession session) {
		User user =(User)session.getAttribute("User");
	    String team_assoc = "";
	    String task_company = "";
	   
		Registration tg = new TaskRegistration(starttime, stoptime, Integer.parseInt(tprior), tdesc,user.getDepartment(),tname, user.getCompany(), user);
		tg.register();
		tg.clean();
		return "startTask";
	}
	
}
