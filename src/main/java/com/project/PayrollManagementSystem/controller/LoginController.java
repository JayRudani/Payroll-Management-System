package com.project.PayrollManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.PayrollManagementSystem.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	//@RequestMapping(value="/login",method=RequestMethod.POST)
	@PostMapping("/login")
	public String welcomePage(ModelMap model, @RequestParam String username, @RequestParam String password) {
		if(username.equals("jay@gmail.com")&& password.equals("12345"))
		if(userService.getUser(username, password)) {
			model.put("username",username);
			return "welcome";
		}
		model.put("errMsg", "Bad Credential");
		return "login";
	}
}
