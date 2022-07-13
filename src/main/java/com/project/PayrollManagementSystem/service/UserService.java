package com.project.PayrollManagementSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.PayrollManagementSystem.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public boolean getUser(String username, String password) {
		
		if((userRepository.findByUserName(username,password)).size()>0) {
			return true;
		}
		return false;
	}
}
