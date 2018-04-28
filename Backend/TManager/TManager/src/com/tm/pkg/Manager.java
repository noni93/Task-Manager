package com.tm.pkg;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Manager extends User {

	public Manager(String name, String workPhone, String workEmail, String location, String username,
			String password, String title, String department) {
		super(name, "Manager", workPhone, workEmail, location, username, password, title, department);
	}
	
}