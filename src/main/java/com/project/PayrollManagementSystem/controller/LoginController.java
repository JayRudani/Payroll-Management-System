package com.project.PayrollManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@PostMapping("/login")
	public String welcomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
		if(username.equals("admin")&&password.equals("12345")) {
			model.put("username",username);
			return "welcome";
		}
		model.put("errMsg", "Bad Credential");
		return "login";
	}
}
